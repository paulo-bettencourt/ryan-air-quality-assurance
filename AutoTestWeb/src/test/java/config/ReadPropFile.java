package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.lang.Object;

public class ReadPropFile {

    static Properties prop = new Properties();

    public static String ReadConfig(String value) throws IOException {

        InputStream input = new FileInputStream((System.getProperty("user.dir") + "/src/test/java/config/config.properties"));
        prop.load(input);
        value = prop.getProperty(value);

        return value;
    }

}
