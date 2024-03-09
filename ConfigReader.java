package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    public static Properties properties;
    static {
        String fileRoad="configuraiton.properties";
        try {
            FileInputStream fileInputStream=new FileInputStream(fileRoad);
            properties=new Properties();
            properties.load(fileInputStream);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static String getProperty(String key){
        return properties.getProperty(key);
    }
}
