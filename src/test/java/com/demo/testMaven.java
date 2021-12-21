package com.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testMaven {

	public static void main(String[] args) throws IOException {

		File file = new File("C:\\Users\\Akshay\\eclipse-workspace\\Demo\\excel\\New Microsoft Excel Worksheet.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet("sheet1");

		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				

				int type = cell.getCellType();
				if (type == 1) {
					String name = cell.getStringCellValue();
					System.out.println(name);

				} else {
					if (DateUtil.isCellInternalDateFormatted(cell)) {
						Date date = cell.getDateCellValue();
						SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
						String data = dateFormat.format(date);
						System.out.println(data);

					} else {
						double d = cell.getNumericCellValue();
						long l = (long) d;
						String valueOf = String.valueOf(1);
						System.out.println(valueOf);
					}
				
				}
			}
		}
	}
}
