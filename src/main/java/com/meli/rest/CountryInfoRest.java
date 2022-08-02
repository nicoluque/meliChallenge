package com.meli.rest;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse.BodyHandlers;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.meli.persistence.entity.CountryInfo;

@RestController
public class CountryInfoRest {
	@RequestMapping(value = "getCountryInfo" ,method = RequestMethod.GET)
	public static CountryInfo getCountryInfo(@RequestParam String name) {
		HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
              .uri(URI.create("https://api.countrylayer.com/v2/all?access_key=7a2d476ece283150ac716f7cf95b7c63&name=" + name))
              .timeout(Duration.of(10, ChronoUnit.SECONDS))
              .GET()
              .build();

        try {
            var response = client.send(request, BodyHandlers.ofString());

            if (response.statusCode() != 200) {
                throw new Exception("Respuesta invalida - response code " + response.statusCode());
            }
            
            return  new ObjectMapper().readValue(response.body(), CountryInfo.class);
            
        } catch (Exception e) {
            throw new RuntimeException("Error obteniendo info de la ip Country /", e);
        }
	}
}
