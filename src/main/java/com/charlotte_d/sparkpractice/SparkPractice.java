package com.charlotte_d.sparkpractice;

import static spark.Spark.*;

/**
 * Creates some Spark routes for practice
 */
public class SparkPractice 
{
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
     * stopServer
     * Prints goodbye and stops the server
     */
    public static void stopServer() {
        System.out.println("Goodbye!");
        stop();
    }
}
