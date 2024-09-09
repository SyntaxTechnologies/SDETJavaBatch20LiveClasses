package org.example.class14;


import org.example.utils.ConfigReader;

import java.io.IOException;

public class ConfigReaderDemo {
    public static void main(String[] args) throws IOException {
        String path = "Files/Config.properties";
        String urlValue = ConfigReader.read(path, "url");
        System.out.println(urlValue);

    }
}
