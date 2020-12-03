package com.vcentry.onlineshop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.vcentry.onlineshop.initializer.Intializer;

public class LoginPage extends Intializer {

	
	public static void clickLogin(){
		wd.findElement(By.linkText(locprop.getProperty("LOGINPAGE_CLICK_LOGIN_LINKTEXT"))).click();

	}
	public static void enterUsername(String username){
		wd.findElement(By.name(locprop.getProperty("LOGINPAGE_TYPE_USENAME_NAME"))).sendKeys(username);

	}
	public static void enterPassword(String password){
		wd.findElement(By.name(locprop.getProperty("LOGINPAGE_TYPE_PASSWORD_NAME"))).sendKeys(password);

	}
	public static void clickEnter(){
		wd.findElement(By.name("password")).sendKeys(Keys.ENTER);

	}
}


