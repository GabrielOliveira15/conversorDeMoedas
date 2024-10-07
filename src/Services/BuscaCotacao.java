package Services;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import Models.RespostaBuscaCotacao;

public class BuscaCotacao {
    private String apiKey = "7568cad4f50ecab49589eaef";

    Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();
    
    public RespostaBuscaCotacao buscarCotacao(String deMoeda, String paraMoeda, double valor) throws IOException, InterruptedException{

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("https://v6.exchangerate-api.com/v6/" + apiKey + "/pair/" + deMoeda + "/" + paraMoeda + "/" + valor))
            .build();
        HttpResponse<String> response = client
            .send(request, HttpResponse.BodyHandlers.ofString());

        return new Gson().fromJson(response.body(), RespostaBuscaCotacao.class);
    }
}
