package com.beije.academy.oca.samples.chap2;

public class TernaryOperator5 {

	public static void main(String[] args) {
		boolean a = true;
		boolean b = false;
		boolean c = true;
		boolean d = true;
		boolean e = false;
		boolean f = a ? b ? c ? d ? e ? b : c : d : a ? b : c : d : e;
		System.out.println(f);
	}

}
