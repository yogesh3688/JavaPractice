package com.base.collection;

import java.util.Calendar;

public class CalenderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());
		System.out.println(System.currentTimeMillis());
		cal.add(Calendar.SECOND, 20);
		long stoptime = cal.getTimeInMillis();
		System.out.println(stoptime);
		while(System.currentTimeMillis() <  stoptime) {
			//System.out.println(System.currentTimeMillis());
		}
		System.out.println(cal.getTime());
	}

}
