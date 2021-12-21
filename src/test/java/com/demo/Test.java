package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {


	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com");
		driver.manage().window().maximize();
		WebElement txtusername = driver.findElement(By.id("username"));
	     txtusername.sendKeys("Akshay");
	     WebElement txtpassword = driver.findElement(By.id("password"));
	     txtpassword.sendKeys("123456");
	     driver.findElement(By.id("login")).click();
	     
		
		
	}
}
