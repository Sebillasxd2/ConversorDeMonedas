import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class ConvertirJson {
    public void guardarJson(Moneda moneda) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter escritura = new FileWriter(moneda.conversion_result()+".json");
        escritura.write(gson.toJson(moneda));
        escritura.close();
    }
}
