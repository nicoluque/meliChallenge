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
import com.meli.persistence.entity.IpGeolocation;

@RestController
public class IpGeolocationRest {
	@RequestMapping(value = "getIpGeolocation" ,method = RequestMethod.GET)
	public static IpGeolocation getIpGeolocation(@RequestParam String ip) {
		HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
              .uri(URI.create("http://ip-api.com/json/" + ip))
              .timeout(Duration.of(10, ChronoUnit.SECONDS))
              .GET()
              .build();

        try {
            var response = client.send(request, BodyHandlers.ofString());

            if (response.statusCode() != 200) {
                throw new Exception("Respuesta invalida - response code " + response.statusCode());
            }
            
            return  new ObjectMapper().readValue(response.body(), IpGeolocation.class);
            
        } catch (Exception e) {
            throw new RuntimeException("Error obteniendo info de la ip /" + ip , e);
        }
		
	}
}