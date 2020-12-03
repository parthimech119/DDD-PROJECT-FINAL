package com.vcentry.onlineshop.initializer;

public class Precondition extends Intializer{

	
	public static void enterUrl(){
		
		wd.get(envprop.getProperty("URL"));

	}
}
