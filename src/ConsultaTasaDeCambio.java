import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaTasaDeCambio {
       public double buscarMoneda(String monedaSolicitada,String monedaACambiar, Double monto) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/a85a64d0bc1c987bd16acf62/pair/" + monedaSolicitada +"/" + monedaACambiar+"/" + monto);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
                Moneda moneda = new Gson().fromJson(response.body(), Moneda.class);
                return moneda.conversion_result();
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
