package com.beije.academy.oca.samples.chap2;

public class NestedLoops4 {
	
	public static void main(String[] args) {
		int x = 0;
		while(x < 10) {
			for (;; x++) {
				if (--x + x++ == x * 2) {
					break;
				} else {
					System.out.println(x);
					continue;
				}
			}
		}
	}

}
