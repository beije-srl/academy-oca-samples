package com.beije.academy.oca.samples.chap2;

public class NestedLoops5 {

	public static void main(String[] args) {
		for(int x= 10; x<100; x++){                                             
		for(int j= 100; j> 50; j--){
			if(x==j)System.out.println(x);
		}
		}
	}
}