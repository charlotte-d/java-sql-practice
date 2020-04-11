package com.charlotte_d.app;

import com.charlotte_d.sparkpractice.SparkPractice;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Run the spark practice
        SparkPractice.createBasicHelloRoute(); 
        SparkPractice.createAdvancedHelloRoute("Hi there, ");
    }
}
