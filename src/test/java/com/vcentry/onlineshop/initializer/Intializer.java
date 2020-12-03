package com.vcentry.onlineshop.initializer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.vcentry.onlineshop.report.ReportOptimizer;

public class Intializer {
	
	/**
	 * @author parthiban
	 * @created 12/1/2020
	 * declare environment variable
	 */
	
	public static Properties locprop=null;
	/**
	 * @author parthiban
	 * @created 12/1/2020
	 * declare locator variable
	 */
	
	public static Properties envprop=null;
	/**
	 * @author parthiban
	 * @created 12/1/2020
	 * declare report variable
	 */
	
	public static ExtentReports reports;
	/**
	 * @author parthiban
	 * @created 12/1/2020
	 * declare log variable
	 */
	
	public static ExtentTest log;
	/**
	 * @author parthiban
	 * @created 12/1/2020
	 * declare log variable
	 */
	
	public static boolean isReport=true;
	/**
	 * @author parthiban
	 * @created 12/1/2020
	 * declare webdriver variable
	 */
	
	
	public static WebDriver wd=null;
	
	/**
	 * @author parthiban
	 * @created 12/1/2020
	 * @throws IOException
	 * initialize  webdriver,environment,property variable
	 */
	

	public static void initialize() throws IOException{
		if(isReport){
		ReportOptimizer.optimizeReport();
		reports=new ExtentReports("C:\\seleniumPractice\\DDDPRACTICE\\report\\report.html");
		isReport=false;
		}
		 envprop=new Properties();
		envprop.load(new FileInputStream(new File(System.getProperty("user.dir")+File.separator+"src"+File.separator+File.separator+"test"+File.separator+"resources"+File.separator+"com"+File.separator+"vcentry"+File.separator+"onlineshop"+File.separator+"config"+File.separator+"env.properties")));
		
		 locprop=new Properties();
			locprop.load(new FileInputStream(new File(System.getProperty("user.dir")+File.separator+"src"+File.separator+File.separator+"test"+File.separator+"resources"+File.separator+"com"+File.separator+"vcentry"+File.separator+"onlineshop"+File.separator+"config"+File.separator+"loc.properties")));
		if(wd==null){	
		if (envprop.getProperty("BROWSER").equals("CHROME")){
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+File.separator+"browser"+File.separator+"chromedriver.exe");

			 wd=new ChromeDriver();
		}else if(envprop.getProperty("BROWSER").equals("firefox")){
			 wd=new FirefoxDriver();

		}
		}
		 wd.manage().window().maximize();
		 wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 wd.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

		
	}
}
