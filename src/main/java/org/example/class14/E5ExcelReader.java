package org.example.class14;

import org.example.utils.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class E5ExcelReader {
    public static void main(String[] args) throws IOException {
        String path = "Files/data.xlsx";
        List<Map<String, String>> data = ExcelReader.read(path, "Sheet1");

        Map<String, String> row1 = data.get(0);
        System.out.println(row1);
        System.out.println(row1.get("Age"));
        System.out.println(row1.get("Salary"));


    }
}
