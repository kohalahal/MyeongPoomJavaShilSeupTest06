package org.game;

import java.util.Calendar;
import java.util.Scanner;

public class AimTenSeconds {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] p = {"황기태", "황기문","황명태"};
		int[] s = new int[p.length];
		int m = 0;
		String winner ="";
		
		System.out.println("10초에 가까운 사람이 이김");
		for(int i = 0; i<p.length; i++) {
			System.out.println(p[i]+"시작 엔터키>>");
			sc.nextLine();
			Calendar c = Calendar.getInstance();
			int a = c.get(Calendar.SECOND);
			System.out.println("현재 초 시간:"+a);
			System.out.println("10초 예상 후 엔터>>");
			sc.nextLine();
			Calendar cc = Calendar.getInstance();
			int b = cc.get(Calendar.SECOND);
			System.out.println("현재 초 시간:"+b);
			s[i]=b>a?b-a:60-a+b;
			int d = Math.abs(10-s[i]);
			
			if(i==0) { m = d; winner = p[i];}
			if(m>d) { m = d; winner = p[i];}
			
		}
		for(int i = 0; i<p.length; i++) {
			System.out.print(p[i]+"의 결과 "+s[i]+",");
		}
		
		System.out.println("승자는 " +winner);
		
	}

}
