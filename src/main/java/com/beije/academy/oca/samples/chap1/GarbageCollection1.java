package com.beije.academy.oca.samples.chap1;

public class GarbageCollection1 {
	
	public static void main(String[] args) {
		String s1 = "ciao1";
		String s2 = "ciao2";
		String s3 = "banana";
		
		if (true) {
			String s4 = "ciao";
		}
		
		s3 = s1;
		s2 = s1;
		s1 = null;
		
		s1 = "prova";
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

}