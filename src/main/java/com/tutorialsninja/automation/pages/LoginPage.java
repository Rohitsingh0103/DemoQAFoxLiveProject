package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class LoginPage {
	
public LoginPage() {
		
		PageFactory.initElements(Base.driver,this);
		
	}
	
	@FindBy(id="input-email")
	public static WebElement emailField;
	
	@FindBy(id="input-password")
	public static WebElement passwordField;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	public static WebElement mainWarning;
	
	
	@FindBy(css="input[value='Login']")
	public static WebElement loginButton;
	
	@FindBy(linkText="Forgotten Password")
	public static WebElement forgottenPassword;
	
	public static void doLogin(String username, String password) {
		Elements.TypeText(LoginPage.emailField,username);
		Elements.TypeText(LoginPage.passwordField,password);
		Elements.click(LoginPage.loginButton);
		
	}

}
