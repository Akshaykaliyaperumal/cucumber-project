package com.demo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class adAtichtlBooking {

	public static void main(String[] args) throws IOException {

		BaseClase a = new BaseClase();
		a.getDriver();

		a.loadUrl("http://adactinhotelapp.com/SearchHotel.php");
		WebElement txtUserName = a.findElementById("username");
		String name = a.BaseClase(1, 0);
		a.typData(txtUserName, name);
		WebElement txtpassword = a.findElementById("password");
		String password = a.BaseClase(1, 1);
		System.out.println(password);
		a.typData(txtpassword, password);
		WebElement btnclick = a.findElementById("login");
		a.clickBtn(btnclick);
		WebElement sltLocation = a.findElementById("location");
		String location = a.BaseClase(1, 2);
		a.SltOptions(sltLocation, location);
		WebElement sltHotel = a.findElementById("hotels");
		String hotel = a.BaseClase(1, 3);
		a.SltOptions(sltHotel, hotel);
		WebElement sltType = a.findElementById("room_type");
		String type = a.BaseClase(1, 4);
		a.SltOptions(sltType, type);
		WebElement sltrooms = a.findElementById("room_nos");
		String roomno = a.BaseClase(1, 5);
		a.SltOptions(sltrooms, roomno);
		System.out.println(roomno);
		WebElement txtCheckIn = a.findElementById("datepick_in");
		String CheckInDate = a.BaseClase(1, 6);
		a.typData(txtCheckIn,CheckInDate );
		WebElement txtCheckout = a.findElementById("datepick_in");
		String CheckOutDate = a.BaseClase(1, 7);
		a.typData(txtCheckout, CheckOutDate);
		WebElement sliAdult = a.findElementById("adult_room");
		String adult = a.BaseClase(1, 8);
		a.SltOptions(sliAdult, adult);
		WebElement sltchild = a.findElementById("child_room");
		String child = a.BaseClase(1, 9);
		a.SltOptions(sltchild, child);
		WebElement btnSubmit = a.findElementById("Submit");
		a.clickBtn(btnSubmit);

	}
}
