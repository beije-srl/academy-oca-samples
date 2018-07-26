package com.beije.academy.oca.samples.chap2;

public class TernaryOperator4 {

	public static void main(String[] args) {
		int a = 10;
		int b = 30;
		int c = 70;
		int d = 40;
		int e = 90;
		int f = a + b == 40 ? b + c == 100 ? d + e == 20 ? a : b : c : d;
		System.out.println(f);
	}
}
