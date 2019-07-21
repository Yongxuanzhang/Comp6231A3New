package com.web.server;
import java.io.IOException;
import java.util.HashMap;

import javax.xml.ws.Endpoint;


import com.web.service.impl.Server;

public class OTWServer {

public static void main(String args[]) throws SecurityException, IOException {
	try{
	HashMap<String,HashMap<String,Integer>> OTWrecord=new HashMap<String,HashMap<String,Integer>>();
	
	HashMap<String,Integer>value1=new HashMap<String,Integer>();
	HashMap<String,Integer>value2=new HashMap<String,Integer>();
	HashMap<String,Integer>value3=new HashMap<String,Integer>();
	
	value1.put("OTWA190619", 1);
	/*
	value1.put("OTWA100618", 23);
	value1.put("OTWA100617", 25);
	value1.put("OTWA070619", 25);
	value1.put("OTWA080619", 25);
	value1.put("OTWA090619", 25);
	*/
	value2.put("OTWE110417", 23);
	value3.put("OTWA250619", 1);
	OTWrecord.put("Conference", value1);
	OTWrecord.put("TradeShows", value2);
	OTWrecord.put("Seminars", value3);
	
	Server otw = new Server("OTW",2003,OTWrecord);


	System.out.println("Ottwa Server is running");

	Endpoint endpoint = Endpoint.publish("http://localhost:2003/otw", otw);

} 

catch (Exception e) {
	System.err.println("ERROR: " + e);
	e.printStackTrace(System.out);
}

//System.out.println("Ottwa Server Exiting ...");

}

	
	
	
	
	}


