package com.vcentry.onlineshop.testcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;
import com.vcentry.onlineshop.initializer.Intializer;
import com.vcentry.onlineshop.initializer.Precondition;
import com.vcentry.onlineshop.inputreader.InputReader;
import com.vcentry.onlineshop.pages.LoginPage;
import com.vcentry.onlineshop.pages.PlaceOrder;
import com.vcentry.onlineshop.report.Screenshotgenerator;
@Test
public class CheckoutTest extends Intializer {
	
	@Test(dataProvider="CheckoutTest")
	public void ValidateCheckout(String tcname,String username,String password,String product,String mobno,String mail,String prodcat,String purchasename,String productqty) throws IOException{
		initialize();
		Precondition.enterUrl();
		
		LoginPage.clickLogin();
		LoginPage.enterUsername(username);
		LoginPage.enterPassword(password);
		LoginPage.clickEnter();
		Precondition.enterUrl();
		PlaceOrder.enterProduct(product);
		PlaceOrder.enterMobile(mobno);
		PlaceOrder.enterMail(mail);
		PlaceOrder.selectProducat(prodcat);
		PlaceOrder.purchaseName(purchasename);
        PlaceOrder.productQty(productqty);
		PlaceOrder.clickCod();
		PlaceOrder.clickGst();
		PlaceOrder.clickOrder();
		PlaceOrder.clickLogout();
		log=reports.startTest(tcname+"----competed");

		
		
	}
	@DataProvider(name="CheckoutTest")
	public static Object[][] getCheckoutData() throws Exception{
		if(InputReader.runModeVerification("CheckoutTest")){

		
			Object[][] data=InputReader.selectSingleDataOrMulitiData("CheckoutTest");
		return data;
		
	}
		return null;
	}
	@AfterMethod
    public void teardown(ITestResult it) throws IOException{
   	 
		Screenshotgenerator.generateScreenshot(it);

}
}
