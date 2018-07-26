package com.beije.academy.oca.samples.chap2;

public class TernaryOperator3 {
	
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		int d = a + b == 40 ? b - c == 30 ? 50 : 60 : 70;
		System.out.println(d);
	}

}
