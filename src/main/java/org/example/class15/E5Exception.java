package org.example.class15;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class E5Exception {
    public static void main(String[] args) throws IOException {


        FileInputStream fis = null;
        fis = new FileInputStream("Files/Config.properties");
        Properties properties = new Properties();
        properties.load(fis);


    }
}
