package org.game;

import java.util.Random;
import java.util.Scanner;

public class Gambling {
	
	public static void main(String[] args) {
		Person[] p = new Person[2];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<p.length; i++) {
			System.out.print((i+1)+"번째 선수 이름>> ");
			p[i] = new Person(sc.nextLine());
		}

		while(true) {
			for(int i =0; i<p.length; i++) {
				System.out.print("["+p[i].getName()+"] 엔터");
				sc.nextLine();
				p[i].run();
			}
		} 
		
		
	}
	


}

class Person {
	String name;
	
	public Person(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean run() {
		
		Random r = new Random();
		int a = r.nextInt(3)+1;
		int b = r.nextInt(3)+1;
		int c = r.nextInt(3)+1;
		System.out.print("\t"+a+"\t"+b+"\t"+c+"\t");
		if(a==b&&b==c) {
			System.out.println(name+"님이 이겼습니다!");
			System.exit(0);
		} else System.out.println("아쉽군요!"); return true;
	}
}
