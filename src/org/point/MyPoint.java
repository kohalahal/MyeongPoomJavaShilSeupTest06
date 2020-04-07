package org.point;

public class MyPoint {
	int x;
	int y;
	
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public static void main(String[] args) {
		MyPoint p = new MyPoint(3, 50);
		MyPoint q = new MyPoint(3, 50);
		System.out.println(p);
		if(p.equals(q)) System.out.println("같은점");
		else System.out.println("다른점");
	}

	MyPoint(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public String toString() {
	return "Point("+x+"."+y+")";
	}
	
	public boolean equals(MyPoint p) {
		if(this.x==p.getX()&&this.y==p.getY()) return true;
		else return false;
	}
}
