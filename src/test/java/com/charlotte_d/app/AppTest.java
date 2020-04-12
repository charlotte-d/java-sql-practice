package com.charlotte_d.app;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.charlotte_d.sparkpractice.SparkPractice;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	
	@AfterEach
	public static void teardown() {
		SparkPractice.stopServer();
	}
	
    @Test
    public void testHelloRoute() throws Exception
    {
        SparkPractice.createBasicHelloRoute();
        
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(
        		"http://localhost:4567/hello")).build();
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
        
        //Make sure the route returns what we expect
        Assertions.assertEquals(200, response.statusCode(), "Unsuccessful response");
        Assertions.assertEquals("Hello World", response.body(), "Wrong response returned");        
    }
    
}
