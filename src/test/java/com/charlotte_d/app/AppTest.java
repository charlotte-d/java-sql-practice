package com.charlotte_d.app;

import org.junit.Test;

import com.charlotte_d.sparkpractice.SparkPractice;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void testHelloRoute()
    {
        SparkPractice.createBasicHelloRoute();
        
        //TODO: Not sure if this really makes sense, but I want to try connecting to the route here...
        
        SparkPractice.stopServer();
        
    }
}
