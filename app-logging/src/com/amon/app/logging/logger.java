package com.amon.app.logging;

import java.text.SimpleDateFormat;
import java.util.Date;

public class logger {
	
	public static void info(String msg) {
		SimpleDateFormat sDF= new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		
		System.out.println("[INFO]"+ sDF.format(new Date())+ " - " + msg);
	}

	
}
