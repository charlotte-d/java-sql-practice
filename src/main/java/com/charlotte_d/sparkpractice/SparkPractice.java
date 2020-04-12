package com.charlotte_d.sparkpractice;

import static spark.Spark.*;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

/**
 * Creates some Spark routes for practice
 */
public class SparkPractice 
{
	private List<String> postItNotes;
	
	public SparkPractice() {
		postItNotes = new ArrayList<>();
	}
	
	/**
	 * createBasicHelloRoute
	 * Creates a basic get route
	 */
    public static void createBasicHelloRoute() {
        get("/hello", (req, res) -> "Hello World");
    }

    /**
     * createAdvancedHelloRoute
     * Creates a route with a parameter
     * @param prefix What to display before the value of the parameter
     */
    public static void createAdvancedHelloRoute(String prefix) {
        get("/hello/:name", (request, response) -> {
            return prefix + request.params(":name");
        });
    }
    
    /**
     * createPostItRoute
     * Creates a POST route called postIt that adds a sticky note
     */
    public void createPostItRoute() {
    	post("/postIt", (request, response) -> {
    		response.type("application/json");
    		postItNotes.add(request.queryParams("note"));
    		return "SUCCESS";
    	});
    }
    
    public void createPostItGetterRoute() {
    	get("/getPostIts", (request, response) -> {
    		return postItNotes;
    	});
    }
    
    public void createPostItGetterIndexRoute() {
    	get("/getPostIts/:index", (request, response) -> {
    		return postItNotes.get(Integer.parseInt(request.params(":index")));
    	});
    }
    
    public void createPostItPutterRoute() {
    	put("/updatePostIt/:index/:contents", (request, response) -> {
    		if (postItNotes != null) {
    			postItNotes.set(Integer.parseInt(request.params(":index")), request.params(":contents"));
    		}
    		return "SUCCESS";
    	});
    }

    /**
     * stopServer
     * Prints goodbye and stops the server
     */
    public static void stopServer() {
        System.out.println("Goodbye!");
        stop();
    }
}
