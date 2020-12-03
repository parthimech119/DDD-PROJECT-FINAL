package com.vcentry.onlineshop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.vcentry.onlineshop.initializer.Intializer;

public class PlaceOrder extends Intializer {

	public static void enterProduct(String product){
		wd.findElement(By.id(locprop.getProperty("CHECKOUTPAGE_TYPE_PRODUCT_ID"))).sendKeys(product);

	}
	public static void enterMobile(String mobno){
		wd.findElement(By.id(locprop.getProperty("CHECKOUTPAGE_TYPE_MOBILE_ID"))).sendKeys(mobno);

	}
	public static void enterMail(String mail){
		wd.findElement(By.id(locprop.getProperty("CHECKOUTPAGE_TYPE_MAILID_ID"))).sendKeys(mail);

	}
	public static void selectProducat(String prodcat){
		WebElement element = wd.findElement(By.id(locprop.getProperty("CHECKOUTPAGE_SELECT_PRODCATS_ID")));

		Select s = new Select(element);
		s.selectByVisibleText( prodcat);

	}
	public static void productQty(String productqty){
		wd.findElement(By.id(locprop.getProperty("CHECKOUTPAGE_TYPE_PRODQTY_ID"))).sendKeys(productqty);

	}
	public static void purchaseName(String purchasename){
		wd.findElement(By.id(locprop.getProperty("CHECKOUTPAGE_TYPE_PURCHASENAME_ID"))).sendKeys(purchasename);

	}
	public static void clickGst(){
		wd.findElement(By.id(locprop.getProperty("CHECKOUTPAGE_CLICK_GST_ID"))).click();

	}
	public static void clickCod(){
		wd.findElement(By.id(locprop.getProperty("CHECKOUTPAGE_CLICK_COD_ID"))).click();

	}
public static void clickOrder(){
	wd.findElement(By.id(locprop.getProperty("CHECKOUTPAGE_CLICK_PALCEORDER_ID"))).click();

	}
public static void clickLogout(){
	wd.findElement(By.linkText(locprop.getProperty("CHECKOUTPAGE_CLICK_LOGOUT_LINKTEXT"))).click();
}
}


