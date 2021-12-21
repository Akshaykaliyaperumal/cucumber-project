package com.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.text.html.parser.Element;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice.Return;

public class BaseClase {
	static WebDriver driver;

	public String BaseClase(int Rownum, int Cellnum) throws IOException {

		String data = null;

		File file = new File("C:\\Users\\Akshay\\eclipse-workspace\\Demo\\excel\\adatichotel.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet("sheet1");
		Row row = sheet.getRow(Rownum);
		Cell cell = row.getCell(Cellnum);
		int type = cell.getCellType();

		if (type == 1) {
			data = cell.getStringCellValue();

		}
		if (type == 0) {
			if (DateUtil.isCellDateFormatted(cell)) {
				Date date = cell.getDateCellValue();
				SimpleDateFormat dateformat = new SimpleDateFormat("dd-MMM-yyyy");
				String data1 = dateformat.format(date);
			} else {

				double d = cell.getNumericCellValue();
				long l = (long) d;
				data = String.valueOf(l);

			}

		}
		return data;
	}

	public static void getDriver() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
	 
	}
	
	public static void loadUrl(String Url) {
		driver.get(Url);
	}
	
	public WebElement findElementById(String data) {
		WebElement element = driver.findElement(By.id(data));
		return element;
	}
	public WebElement findELementByXpath(String data ) {
		WebElement element = driver.findElement(By.xpath(data));
		return element;
	}
	public void clickBtn(WebElement element) {
		element.click();		
	}
	public void SltOptions(WebElement element,String data) {
		Select select=new Select(element);
		select.selectByVisibleText(data);		
	}
	public void typData(WebElement element,String data) {
		element.sendKeys(data);
	}

	public static void maximize() {
		// TODO Auto-generated method stub
	driver.manage().window().maximize();
	}

	
	
}


