package com.web.service.impl;
import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


/**
 * simple logging class copied from https://www.youtube.com/watch?v=4Bpg5i4tUFg
 *  
 */
public class Log {
	
	
	public Logger logger;
	FileHandler fh;
	
	public Log(String file_name) throws SecurityException, IOException{
		
		File f = new File(file_name);
		
		if(!f.exists()){
				f.createNewFile();	
		}
		fh = new FileHandler(file_name, true);
		logger = Logger.getAnonymousLogger();
		logger.setUseParentHandlers(false);
		logger.addHandler(fh);
		SimpleFormatter formatter =  new SimpleFormatter();
		fh.setFormatter(formatter);
	}

}