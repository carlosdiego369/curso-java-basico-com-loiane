package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {

		Scanner programa = new Scanner(System.in);

		int num, par = 0, soma = 0, impar = 0;

		for (int i = 0; i <= 1; i++) {

			System.out.println("Digite um n�mero: ");
			num = programa.nextInt();

			if (num % 2 == 0) {
				par++;
				
				soma = soma + num;

			} else {
				impar++;
				soma = soma + num;
			}
			
			
		}
		System.out.println("N�mero pares: " + par);
		System.out.println("N�mero impar: " + impar);
		System.out.println("A soma dos n�meros: " + soma);
	}

}
