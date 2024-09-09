package org.example.class14;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class E3ExcelReader {
    public static void main(String[] args) throws IOException {
        String path="Files/data.xlsx";
        FileInputStream fis=new FileInputStream(path);
        XSSFWorkbook excel=new XSSFWorkbook(fis);
        Sheet sheet=excel.getSheet("Sheet1");


        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
            Row row=sheet.getRow(i);


            for (int j  = 0; j < row.getPhysicalNumberOfCells(); j++) {
                Cell c=row.getCell(j); //1
                System.out.print(c.toString()+" ");
            }
            System.out.println();

        }


        
        
    }
}
