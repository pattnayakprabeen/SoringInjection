package com.prabeen.beans;

import java.util.Date;

public class WishMessageGenerator {
         private int i=10;
	private Date date;
   static {
	   
	   System.out.println("WishMessageGenerator:static");
   }

public WishMessageGenerator(Date dat) {
	System.out.println("WishMessgaegenerator::1 Param");
	this.date=dat;
}
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator::0-param constructor");
	}

	public void setDate1(Date date) {
		System.out.println("WishMessageGenerator.setDate(-)");
		this.date = date;
	}
	
	public  String sayHello(String user) {
		System.out.println("WishMessageGenerator.sayHello(-):::"+date);
		int hour=0; 
		//get current hour of the day
		hour=date.getHours();
		//generate wish Message
		if(hour<12)
			return "GM::"+user;
		else if(hour<=16)
			return "GA::"+user;
		else if(hour<=20)
			return "GE::"+user;
		else
			return "GN::"+user;
}
  
}
