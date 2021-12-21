package com.demo;

import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.Advice.This;

public class pageObjectModel extends BaseClase {
	public pageObjectModel() {
		
	PageFactory.initElements(driver, this);
	} 

	@FindBy(id = "username")
	private WebElement txtusername;
	@FindBy(id = "password")
	private WebElement txtpassword;
	@FindBy(id = "login")
	private WebElement BtnLogin;

	public WebElement getTxtpassword() {
		return txtpassword;
	}

	public WebElement getTxtusername() {
		return txtusername;
	}

	public WebElement getBtnLogin() {
		return BtnLogin;
	}

	public void loginpage(String username, String password) {
		// TODO Auto-generated method stub\
		typData(getTxtusername(), username);
		typData(getTxtpassword(), password);
		clickBtn(getBtnLogin());

	}

}
