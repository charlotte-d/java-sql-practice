package com.charlotte_d.app;

import java.sql.SQLException;

import com.charlotte_d.mysqlpractice.MySQLPractice;
import com.charlotte_d.sparkpractice.SparkPractice;

/**
 * This is the main class that calls methods in other classes that contain the actual practice
 */
public class App 
{
    public static void main( String[] args )
    {
        // Run the spark practice
        SparkPractice.createBasicHelloRoute(); 
        SparkPractice.createAdvancedHelloRoute("Hi there, ");
        SparkPractice.stopServer();
        
        // Run the SQL practice
        MySQLPractice sqlPractice = new MySQLPractice();        
		try {
			String versionInfo = sqlPractice.getVersionInfo();
			System.out.println("Version information: " + versionInfo);
		} catch (SQLException e) {
			e.printStackTrace();
		}
        
    }
}
