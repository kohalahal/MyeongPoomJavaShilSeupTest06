package org.love;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizeInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println(">>");
			StringTokenizer st = new StringTokenizer(sc.nextLine());
			int cnt = 0;
			while(st.hasMoreTokens()) {
				String s = st.nextToken();
				if(s.equals("그만")) {System.out.println("종료합니다.."); System.exit(0);}
				cnt++;
			}
			System.out.println("어절 개수는 "+cnt);
		}
		
		
	}
}
