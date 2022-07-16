package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {

		
		Scanner programa = new Scanner(System.in);
		int num, f = 1;
		
		
		System.out.println("Digite um número para factoriar");
		num = programa.nextInt();
		
			
		for(;num > 1; num--) {
			
			f *= num;
			
			System.out.println(num + "! " + f);
		}
		
	}

}
