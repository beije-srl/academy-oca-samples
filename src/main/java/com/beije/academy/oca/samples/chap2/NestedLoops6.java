package com.beije.academy.oca.samples.chap2;

public class NestedLoops6 {
	
	public static void main(String[] args) {
		boolean vero = false;
		do {
			vero =  vero ? false ? true ? false : vero : true : !vero;
			for (int i = 0; vero; i++) {
				if (Math.pow(i, i) == 36) {
					System.out.println(i);
					break;
				} else {
					System.out.println("WTF");
					vero = !vero;
				}
			}
		} while(vero);
	}

}
