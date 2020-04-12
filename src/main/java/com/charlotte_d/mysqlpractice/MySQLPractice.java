package com.charlotte_d.mysqlpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.typesafe.config.Config;

/**
 * MySQL Practice
 */
public class MySQLPractice {
	private Config config;
	public MySQLPractice() {
		config = ConfigurationManager.getConfig();
	}

	/**
	 * getVersionInfo
	 * @return String with version information for database connection or empty string if no results were found
	 * @throws SQLException Exceptions connecting to database
	 */
	public String getVersionInfo() throws SQLException {
		String query = "SELECT VERSION()";
		String versionInfo = "";
		Connection conn = DriverManager.getConnection(config.getString("dbUrl"), config.getString("dbUsername"), config.getString("dbPassword"));
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(query);
		if (rs.next()) {
			versionInfo = rs.getString(1);
		}
		conn.close();

		return versionInfo;
	}
}
