package com.vcentry.onlineshop.initializer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewFeature extends Intializer {

	public static void featureNew(){
	 wd=new FirefoxDriver();
	 wd=new ChromeDriver();
	}
}
