package com.beije.academy.oca.samples.chap3;

public class Immutability1 {
	
	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("ciao");
		StringBuilder sb2 = sb1;
		
		System.out.println(sb1);
		
		sb1.append(" mondo");
		System.out.println(sb2);
		
		sb2 = new StringBuilder("ciao mondo");
		
		sb1.append(" mondo");
		System.out.println(sb1);
		System.out.println(sb2);
		
	}

}
