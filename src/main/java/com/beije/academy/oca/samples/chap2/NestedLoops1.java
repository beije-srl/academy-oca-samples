package com.beije.academy.oca.samples.chap2;

public class NestedLoops1 {
	
	public static void main(String[] args) {
		int x = 10;
		int y = 90;
		for (; x < 100; x--, y++) {
			while (y > 90)
				y++;
				x+=100;
			System.out.println(x);
		}
	}
}