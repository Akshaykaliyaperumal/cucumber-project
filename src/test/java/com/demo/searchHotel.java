package com.demo;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.xml.dom.Tag;

class searchHotel extends pageObjectModel {
	public searchHotel() {

		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "location")
	private WebElement dDnLocation;
	@FindBy(id = "hotels")
	private WebElement dDnHotels;
	@FindBy(id="room_type")
	private WebElement dDnRoomtype;
	@FindBy(id="room_nos")
	private WebElement dDnNoOfRoom;
	@FindBy(id = "datepick_in")
	private WebElement dateCheckinDate;
	@FindBy(id="datepick_out")
	private WebElement datechecoutElement;
	@FindBy(id= "adult_room")
	private WebElement adultsPerRoom;
	@FindBy(id = "child_room")
	private WebElement chilsdPerRoome;
	@FindBy(id = "Submit")
	private WebElement btnSearch;
	public WebElement getdDnLocation() {
		return dDnLocation;
	}
	public void setdDnLocation(WebElement dDnLocation) {
		this.dDnLocation = dDnLocation;
	}
	public WebElement getdDnHotels() {
		return dDnHotels;
	}
	public void setdDnHotels(WebElement dDnHotels) {
		this.dDnHotels = dDnHotels;
	}
	public WebElement getdDnRoomtype() {
		return dDnRoomtype;
	}
	public void setdDnRoomtype(WebElement dDnRoomtype) {
		this.dDnRoomtype = dDnRoomtype;
	}
	public WebElement getdDnNoOfRoom() {
		return dDnNoOfRoom;
	}
	public void setdDnNoOfRoom(WebElement dDnNoOfRoom) {
		this.dDnNoOfRoom = dDnNoOfRoom;
	}
	public WebElement getDateCheckinDate() {
		return dateCheckinDate;
	}
	public void setDateCheckinDate(WebElement dateCheckinDate) {
		this.dateCheckinDate = dateCheckinDate;
	}
	public WebElement getDatechecoutElement() {
		return datechecoutElement;
	}
	public void setDatechecoutElement(WebElement datechecoutElement) {
		this.datechecoutElement = datechecoutElement;
	}
	public WebElement getAdultsPerRoom() {
		return adultsPerRoom;
	}
	public void setAdultsPerRoom(WebElement adultsPerRoom) {
		this.adultsPerRoom = adultsPerRoom;
	}
	public WebElement getChilsdPerRoome() {
		return chilsdPerRoome;
	}
	public void setChilsdPerRoome(WebElement chilsdPerRoome) {
		this.chilsdPerRoome = chilsdPerRoome;
	}
	public WebElement getBtnSearch() {
		return btnSearch;
	}
	public void setBtnSearch(WebElement btnSearch) {
		this.btnSearch = btnSearch;
	}
	
	public void HotelSearch(String Ocation,String Hotel, String RoomType, String NoOfRooms, String CheckinDate, String checoutElement, String AdultsPerRoom, String ChilsdPerRoome ) {
		// TODO Auto-generated method stub
		
		SltOptions(getdDnLocation(), Ocation);
		SltOptions(getdDnHotels(), Hotel);
		SltOptions(getdDnRoomtype(), RoomType);
		SltOptions(getdDnNoOfRoom(), NoOfRooms);
		SltOptions(getDateCheckinDate(), CheckinDate);
		SltOptions(getDatechecoutElement(), checoutElement);
		SltOptions(getAdultsPerRoom(), AdultsPerRoom);
		SltOptions(getChilsdPerRoome(), ChilsdPerRoome);
		clickBtn(btnSearch);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
