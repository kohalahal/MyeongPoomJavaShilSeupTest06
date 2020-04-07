package org.calendar;

import java.util.Calendar;

public class Hey {
	
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		int h = c.get(Calendar.HOUR_OF_DAY);
		int m = c.get(Calendar.MINUTE);
		System.out.println("현재 시간은 "+h+"시 "+m+"분입니다.");
		if(h>3&& h<12) System.out.println("Good Morning");
		else if(h>11&& h<18) System.out.println("Good Afternoon");
		else if(h<19&& h<22) System.out.println("Good Evening");
		else System.out.println("Good Night");

	}
	

}
