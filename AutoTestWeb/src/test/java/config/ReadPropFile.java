package config;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadPropFile {

    static Properties prop = new Properties();

    public static String ReadConfig(String value) throws IOException {
        String OSConfiguration = getOSProp();
        InputStream input = new FileInputStream((System.getProperty("user.dir") + "/src/test/java/config/" + OSConfiguration));
        prop.load(input);
        value = prop.getProperty(value);

        return value;
    }

    public static String getOSProp() {
        switch (OSConfiguration.getOS()) {
            case WINDOWS:
                return "config.windows.properties";
            case LINUX:
                return "config.linux.properties";
            case MAC:
                return "config.mac.properties";
            default:
               return "config.properties";
        }
    }
}
