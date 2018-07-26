package com.beije.academy.oca.samples.chap2;

public class Loop1 {

	public static void main(String[] args) {
		boolean b = false;
		int i = 1;
		do {
			i++;
		} while (b = !b);
		System.out.println(i);
	}

}
