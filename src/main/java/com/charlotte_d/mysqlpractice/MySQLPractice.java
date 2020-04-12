package com.charlotte_d.mysqlpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;
import java.util.logging.Level;
import com.typesafe.config.Config;

/**
 * MySQL Practice
 */
public class MySQLPractice 
{
	private Config config;
	private String url;
	private String user;
	private String password;
	
	public MySQLPractice() {
		config = ConfigurationManager.getConfig();
		url = config.getString("dbUrl");
		user = config.getString("dbUsername");
		password = config.getString("dbPassword");
	}
	
	public String getVersionInfo() throws RuntimeException {
		String query = "SELECT VERSION()";
		String versionInfo = "";
		try (Connection con = DriverManager.getConnection(url, user, password);
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery(query)) {
			if (rs.next()) {
				versionInfo = rs.getString(1);
			}
		} catch (SQLException ex) {
			Logger logger = Logger.getLogger(MySQLPractice.class.getName());
			logger.log(Level.SEVERE, ex.getMessage(), ex);
			throw new RuntimeException("Failed to connect to database", ex);
		}
		return versionInfo;
	}

//TODO: Add more interesting examples	
}
