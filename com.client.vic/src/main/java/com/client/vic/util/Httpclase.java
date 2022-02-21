package com.client.vic.util;

import java.util.Arrays;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.client.vic.entity.Product;
import com.google.gson.Gson;

public class Httpclase {
	
	static RestTemplate restTemplate = new RestTemplate(); 
	
	public Product getGson(String url) {
	
	HttpHeaders headers = new HttpHeaders();
	headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	
	HttpEntity<String> entity = new HttpEntity<>("parameters" , headers);
	
	ResponseEntity<String> result = restTemplate.exchange(url, HttpMethod.GET, entity, String.class );
	
	//Formato Json
	//System.out.println(result.getBody());
	
    Gson gson = new Gson();
            
    Product salida = new Product();
    
    salida = gson.fromJson(result.getBody(), Product.class);

    System.out.println("_Entrando al metodo_getGson");
    
	return salida;
	
}


}
