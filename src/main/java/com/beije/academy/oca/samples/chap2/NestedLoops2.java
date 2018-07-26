package com.beije.academy.oca.samples.chap2;

public class NestedLoops2 {
	
	public static void main(String[] args) {
		boolean z;
		while(z = true) {
			int x = 100;
			int y = 0;
			do {
				x += ++y * 4;
				System.out.println(x * y);
				if (x * y > 100) {
					z = false;
					break;
				}
			} while (x > y);
		}
	}

}
