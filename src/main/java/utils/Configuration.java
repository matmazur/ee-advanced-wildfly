package utils;

import qualifiers.FileName;

import javax.enterprise.inject.Produces;
import java.io.IOException;
import java.util.Properties;

public class Configuration {

    private static final String CONFIG_FILE = "/config.properties";


    @Produces
    @FileName
    private String getFileName() {

        Properties config = new Properties();

        try {
            config.load(getClass().getResourceAsStream(CONFIG_FILE));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return config.getProperty("fileName");
    }
}