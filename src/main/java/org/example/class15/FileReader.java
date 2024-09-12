package org.example.class15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileReader {

    public void read() throws FileNotFoundException {

        FileInputStream fileInputStream=new FileInputStream("Files/Config.properties");
    }
}
