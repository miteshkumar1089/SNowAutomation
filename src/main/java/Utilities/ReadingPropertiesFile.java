package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
public class ReadingPropertiesFile {
    public String readFromPropertiesFile(String key) throws IOException, FileNotFoundException {

        FileInputStream fs= new FileInputStream("src\\test\\resources\\data.properties");
        Properties props=new Properties();
        props.load(fs);
        return props.getProperty(key);

    }
}
