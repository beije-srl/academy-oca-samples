package com.beije.academy.oca.samples.chap2;

public class NestedLoops3 {
	
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++)
		for(int j = 0; j < 10; j++)
		for(int k = 0; k < 10; k++)
		if(k + j + i == 20)
		j++;
		System.out.println("ciao");
	}

}
