package com.robust.common.utils;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.ResourceBundle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PropertiesReader {

	private static Logger log = LoggerFactory.getLogger(PropertiesReader.class);
	public static final String PROPERTY_FILEPATH = "config";

	public static String getValue(String key) {
		log.info("Loading from property..");
		ResourceBundle resource = ResourceBundle.getBundle(PROPERTY_FILEPATH);
		return resource.getString(key);

	}

	public static void load() {
		log.info("Loading from property..");
		Properties prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream(PROPERTY_FILEPATH);
			prop.load(fis);
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}