package org.example.class15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class E4Exception {
    public static void main(String[] args) {


        FileInputStream fis= null;
        try {
            fis = new FileInputStream("Files/Config.properties");
            Properties properties=new Properties();
            properties.load(fis);
        } catch (FileNotFoundException e) {
            System.out.println("Create new file");
        } catch (IOException e) {
            System.out.println("notify the developers");
        }


    }
}
