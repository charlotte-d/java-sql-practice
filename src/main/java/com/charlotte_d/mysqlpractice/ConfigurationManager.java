package com.charlotte_d.mysqlpractice;

import java.io.File;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

/**
 * Configuration Manager
 */
public class ConfigurationManager 
{
	private static File TYPESAFE_CONFIG_FILE = new File("config\\databaseconfig.conf");
	private static Config config = ConfigFactory.parseFile(TYPESAFE_CONFIG_FILE);
	
	public static Config getConfig() {
		return config;
	}
}
