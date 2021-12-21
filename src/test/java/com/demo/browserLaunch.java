package com.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class browserLaunch {
	WebDriver driver;

	@Parameters({ "browser" })
	@Test(priority = 2)
	private void loginEdge(String name) {
		if (name.equals("Edge")) {

			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.get("https://www.facebook.com/");

		}
	}

	@Parameters({ "browser" })
	@Test
	private void loginChrome(String name) {
		if (name.contentEquals("Chrome")) {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get(
					"https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");

		}
	}
	
	@Parameters({"browser"})
	@Test
	private void loginFF() {

	}
}