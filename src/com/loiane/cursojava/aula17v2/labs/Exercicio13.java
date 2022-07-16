package com.loiane.cursojava.aula17v2.labs;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {

		Scanner programa = new Scanner(System.in);
		
		int base, pot,res;
		
		System.out.println("Digite o valor base: ");
		base = programa.nextInt();
		
		System.out.println("Digite o valor expoente");
		pot = programa.nextInt();
		
		res = base;
		
		for(int i = 1;i < pot; i++) {
			
			res *= base;
		}
		System.out.println(res);
		
	}

}
