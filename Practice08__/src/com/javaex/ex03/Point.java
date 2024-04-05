package com.javaex.ex03;

public class Point {
	
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
		//return String.format("[포인트] x=%d, y=%d 입니다.%n",x,y);
	}

}
