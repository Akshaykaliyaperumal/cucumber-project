package com.demo;

import org.junit.BeforeClass;
import org.testng.annotations.Test;

public class junit extends BaseClase {

	
	
	@BeforeClass
	public static void BeforeClass() {
		// TODO Auto-generated constructor stub
		getDriver();
		loadUrl("http://adactinhotelapp.com/");
		maximize();
	 }

	
	@Test
	private void cancelBooking() {
		// TODO Auto-generated method stub

	}
}
