package com.loiane.cursojava.aula17v2.labs;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double num, notas, soma = 0, media;

		System.out.println("Entre com um número de notas: ");
		num = input.nextDouble();

		for (int i = 0; i < num; i++) {

			System.out.println("Entre com a nota " + (i + 1));
			notas = input.nextDouble();
			soma += notas;
		}
		media = soma / num;
		
		System.out.println("Soma: " + soma);
		System.out.println("Soma: " + media);

	}

}
