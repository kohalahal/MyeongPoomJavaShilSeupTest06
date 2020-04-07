package org.love;

import java.util.Scanner;

public class ScrewBar {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		for(int i = 0; i < s.length()*2; i++) {
			
			s = s.substring(1).concat(s.substring(0,1));
			System.out.println(s);
			
		}
		
	}

}
