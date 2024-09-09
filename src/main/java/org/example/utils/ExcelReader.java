package org.example.utils;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExcelReader {

    public static List<Map<String,String>> read(String path,String sheetName) throws IOException {

        FileInputStream fis=new FileInputStream(path);
        XSSFWorkbook excel=new XSSFWorkbook(fis);
        Sheet sheet=excel.getSheet(sheetName);
        List<Map<String,String>> excelData=new ArrayList<>();
        Row headerRow=sheet.getRow(0);

        for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
            Row valuesRow=sheet.getRow(i);
            Map<String,String> rowMap=new LinkedHashMap<>();
            for (int j  = 0; j < valuesRow.getPhysicalNumberOfCells(); j++) {
                String key=headerRow.getCell(j).toString();
                String value=valuesRow.getCell(j).toString();
                rowMap.put(key,value);
            }
            excelData.add(rowMap) ;
        }
        return excelData;
    }
}
