package com.vcentry.onlineshop.report;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;

public class ReportOptimizer {

	public static void optimizeReport() throws IOException{
		
		Date date=new Date();
		SimpleDateFormat sf=new SimpleDateFormat("dd-M-yyyy-hh-mm-ss");
		String name=sf.format(date);
		String src="C:\\seleniumPractice\\DDDPRACTICE\\screenshot";
		String dst="C:\\seleniumPractice\\DDDPRACTICE\\old_screenshot\\"+name;
		
		FileUtils.copyDirectory(new File(src),new File(dst));
		FileUtils.cleanDirectory(new File(src));
	}
}
