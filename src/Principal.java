import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ConsultaTasaDeCambio consulta = new ConsultaTasaDeCambio();
        System.out.println("*******************************************************");
        System.out.println("Sea bienvenido/a al Conversor de Monedas =D");

        String menu = """
                1) Dólar =>> Peso argentino
                2) Peso argentino =>> Dólar
                3) Dólar ==> Real brasileño
                4) Real brasileño ==> Dólar
                5) Dólar =>> Peso colombiano
                6) Peso colombiano =>> Dólar
                7) Salir
                Elija una de estas opciones validas:
                """;
        System.out.println("*******************************************************");

        int opcion = 0;
        while(opcion != 7){
            double resultado;
            double monto = 0;
            System.out.println(menu);
            opcion = teclado.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Ingrese el monto que desea convertir: ");
                     monto= teclado.nextDouble();
                     resultado = consulta.buscarMoneda("USD","ARS",monto);
                    System.out.println("el valor de: "+monto+" [USD] corresponde al valor final de =>>> "+ resultado +" [ARS]");
                    break;
                case 2:
                    System.out.println("Ingrese el monto que desea convertir: ");
                     monto= teclado.nextDouble();
                      resultado= consulta.buscarMoneda("ARS","USD",monto);
                    System.out.println("el valor de: "+monto+" [ARS] corresponde al valor final de =>>> "+ resultado +" [USD]");
                    break;
                case 3:
                    System.out.println("Ingrese el monto que desea convertir: ");
                     monto= teclado.nextDouble();
                    resultado= consulta.buscarMoneda("USD","BRL",monto);
                    System.out.println("el valor de: "+monto+" [USD] corresponde al valor final de =>>> "+ resultado +" [BRL]");
                    break;
                case 4:
                    System.out.println("Ingrese el monto que desea convertir: ");
                     monto= teclado.nextDouble();
                    resultado= consulta.buscarMoneda("BRL","USD",monto);
                    System.out.println("el valor de: "+monto+" [BRL] corresponde al valor final de =>>> "+ resultado +" [USD]");
                    break;
                case 5:
                    System.out.println("Ingrese el monto que desea convertir: ");
                     monto= teclado.nextDouble();
                    resultado = consulta.buscarMoneda("USD","COP",monto);
                    System.out.println("el valor de: "+monto+" [USD] corresponde al valor final de =>>> "+ resultado +" [COP]");
                    break;
                case 6:
                    System.out.println("Ingrese el monto que desea convertir: ");
                     monto= teclado.nextDouble();
                    resultado= consulta.buscarMoneda("COP","USD",monto);
                    System.out.println("el valor de: "+monto+" [COP] corresponde al valor final de =>>> "+ resultado +" [USD]");
                    break;
                case 7:
                    System.out.println("Gracias por utilizar mi conversor");
                    break;

                default:
                    System.out.println("Opcion invalida");
            }
        }
    }
}
