package com.beije.academy.oca.samples.chap2;

public class TernaryOperator1 {

	public static void main(String[] args) {
		int x = 0;
		int y = 10;
		if (x > 10 ? y++ == 1 ? ++x == 11 : ++y == 0 : true) {
			System.out.println(x + y);
		} else {
			System.out.println(x - y);
		}
	}

}
