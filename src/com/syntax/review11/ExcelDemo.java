package com.syntax.review11;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExcelDemo {
    public static void main(String[] args) {
        String path="Files/Book1.xlsx";
        try {
            FileInputStream fileInputStream=new FileInputStream(path);
            XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
            Sheet sheet1=xssfWorkbook.getSheet("Sheet1");

            //List<Map<String,String>> excelData=new ArrayList<>();
            //var excelData=new ArrayList<Map<String,String>>();
            var excelData=new ArrayList<Map<String,String>>();
            Row row0=sheet1.getRow(0);//get the head of the excel
            for (int i = 1; i <sheet1.getPhysicalNumberOfRows() ; i++) {
                LinkedHashMap<String,String>rowMap= new LinkedHashMap<>();
                Row row=sheet1.getRow(i);

                int noOfCells=row.getPhysicalNumberOfCells();
                for (int j = 0; j < noOfCells; j++) {
                    String key=row0.getCell(j).toString();
                    String values=row.getCell(j).toString();
                    rowMap.put(key,values);
                }
                excelData.add(rowMap);
            }
            System.out.println(excelData);




        } catch (FileNotFoundException e) {
            System.out.println("Please check the path of the file");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
