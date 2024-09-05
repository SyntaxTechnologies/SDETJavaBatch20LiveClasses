package org.example.class13;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ChromeTester {
    public static void main(String[] args) throws IOException {
        String path="Files/Config.properties";
        FileInputStream fis=new FileInputStream(path);
        Properties properties=new Properties();
        properties.load(fis);
        System.out.println(properties.getProperty("username"));


    }
}
