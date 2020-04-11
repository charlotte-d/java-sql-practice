package com.charlotte_d.sparkpractice;

import static spark.Spark.*;

/**
 * Creates some Spark routes
 */
public class SparkPractice 
{
    public static void createBasicHelloRoute() {
        get("/hello", (req, res) -> "Hello World");
    }

    public static void createAdvancedHelloRoute(String prefix) {
        get("/hello/:name", (request, response) -> {
            return prefix + request.params(":name");
        });
    }

    public static void stopServer() {
        System.out.println("Goodbye!");
        stop();
    }
}
