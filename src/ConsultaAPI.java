import com.google.gson.Gson;


import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaAPI {


    public Moneda buscarMoneda(String nombreDeMoneda){
        HttpClient client = HttpClient.newHttpClient();
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/8f042affd61c453bb5527a82/latest/" + nombreDeMoneda);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request , HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(),Moneda.class);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }


}
