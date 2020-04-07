package org.love;

import java.util.Scanner;

public class SplitStringInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println(">>");
			String str = sc.nextLine();
			if(str.equals("그만")) {System.out.println("종료합니다.."); System.exit(0);}
			String[] s = str.split(" ");
			System.out.println("어절 개수는 "+s.length);
			
		}
		
		
	}
}
