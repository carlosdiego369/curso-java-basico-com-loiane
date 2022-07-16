package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio26 {

	public static void main(String[] args) {

		
		Scanner chave = new Scanner(System.in);
		
		int num, f = 1;
		
		System.out.println("Digite um número para factoriar");
		num = chave.nextInt();
		
		System.out.println("Fatorial de: " + num);
		System.out.print(num + "! = ");
		for(;num > 1; num--) {
			
			f *= num;
			System.out.print(num + " . ");
		}
		System.out.println(" 1 = " + f);
	}
	

}
