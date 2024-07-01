import com.google.gson.Gson;


import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class ConsultaConversor {

    public Monedas monedaEncontrada(String baseM, String cambioM){
        String password = "2e450cd491b2fc96f96e352e";
        String direccion = "https://v6.exchangerate-api.com/v6/"+password+"/latest/"+baseM;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());


            Monedas monedas = new Gson().fromJson(response.body(), Monedas.class);
            if (monedas.conversion_rates().containsKey(cambioM)) {
                return monedas;
            } else {
                throw new RuntimeException("Moneda NO encontrada");
            }
        } catch (Exception e) {
            throw new RuntimeException("Error en la consulta de monedas" + e.getMessage());
        }
    }
}


