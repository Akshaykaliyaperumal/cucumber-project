package com.demo;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class Inputs  {
	public static void main(String[] args) throws IOException {
		BaseClase a = new BaseClase();
		a.getDriver();
		a.loadUrl("http://adactinhotelapp.com/");
		a.maximize();
		WebElement txtUsername = a.findElementById("username");
		String name = a.BaseClase(1, 0);
		a.typData(txtUsername, name);
		WebElement txtPassword = a.findElementById("password");
		String pass = a.BaseClase(1, 1);
		a.typData(txtPassword, pass);
		WebElement bntclk = a.findElementById("login");
		a.clickBtn(bntclk);
		WebElement sltlocation = a.findElementById("location");
		String location = a.BaseClase(1, 2);
		a.SltOptions(sltlocation, location);
		WebElement sltHotels = a.findElementById("hotels");
		String hotels = a.BaseClase(1, 3);
		a.SltOptions(sltHotels, hotels);
		WebElement sltRoomType = a.findElementById("room_type");
		String roomType = a.BaseClase(1, 4);
		a.SltOptions(sltRoomType, roomType);
		WebElement sltRooms = a.findElementById("room_nos");
		String rooms = a.BaseClase(1, 5);
		a.SltOptions(sltRooms, rooms);
		WebElement txtCheckIn = a.findElementById("datepick_in");
		String checkIn = a.BaseClase(1, 6);
		a.typData(txtCheckIn, checkIn);
		WebElement txtCheckOut = a.findElementById("datepick_out");
		String checkOut = a.BaseClase(1, 7);
		a.typData(txtCheckOut, checkOut);
		WebElement sltAdults = a.findElementById("adult_room");
		String adults = a.BaseClase(1, 8);
		a.SltOptions(sltAdults, adults);
		WebElement sltChildrens = a.findElementById("child_room");
		String childrens = a.BaseClase(1, 9);
		a.SltOptions(sltChildrens, childrens);
		WebElement btnSearch = a.findElementById("Submit");
		a.clickBtn(btnSearch);
		WebElement btnSelectHotel = a.findElementById("radiobutton_0");
		a.clickBtn(btnSelectHotel);
		WebElement btnContinue = a.findElementById("continue");
		a.clickBtn(btnContinue);
		WebElement txtFirstName = a.findElementById("first_name");
		String firstName = a.BaseClase(1, 10);
		a.typData(txtFirstName, firstName);
		WebElement txtLastName = a.findElementById("last_name");
		String lastName = a.BaseClase(1, 11);
		a.typData(txtLastName, lastName);
		WebElement txtAddress = a.findElementById("address");
		String address = a.BaseClase(1, 12);
		a.typData(txtAddress, address);
		WebElement txtCC = a.findElementById("cc_num");
		String creditCard = a.BaseClase(1, 13);
		a.typData(txtCC, creditCard);
		WebElement sltCCType = a.findElementById("cc_type");
		String ccType = a.BaseClase(1, 14);
		a.SltOptions(sltCCType, ccType);
		WebElement sltExpMonth = a.findElementById("cc_exp_month");
		String expMonth = a.BaseClase(1, 15);
		a.SltOptions(sltExpMonth, expMonth);
		WebElement sltExpYear = a.findElementById("cc_exp_year");
		String expYear = a.BaseClase(1, 16);
		a.SltOptions(sltExpYear, expYear);
		WebElement txtCVV = a.findElementById("cc_cvv");
		String CVV = a.BaseClase(1, 17);
		a.typData(txtCVV, CVV);
		WebElement btnBook = a.findElementById("book_now");
		a.clickBtn(btnBook);
		
		WebElement order = a.findElementById("order_no");
		String attribute = order.getAttribute("value");
		System.out.println(attribute);
	}

}
