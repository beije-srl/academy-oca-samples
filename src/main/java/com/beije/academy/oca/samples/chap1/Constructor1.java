package com.beije.academy.oca.samples.chap1;

public class Constructor1 {
	
	private String nome;

	private int numero;
	
	public Constructor1() {
		this.nome = "nessun nome";
		this.numero = 0;
	}
	
	public Constructor1(String nome) {
		this.nome = nome;
		this.numero = 100;
	}

	public Constructor1(int i) {
		this.nome = Integer.toString(i);
		this.numero = i;
	}
	
	public static void main(String[] args) {
		Constructor1 c1 = new Constructor1(7);
		
		System.out.println(c1.nome);
		System.out.println(c1.numero);
	}

}
