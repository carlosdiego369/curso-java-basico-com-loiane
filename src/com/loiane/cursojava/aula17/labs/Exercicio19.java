package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {

		Scanner chave = new Scanner(System.in);

		int notas, i;
		double res = 0;

		System.out.println("Digite a quantidade de notas: ");
		i = chave.nextInt();

		for (int cont = 1; cont <= i; cont++) {

			System.out.println("Digite o valor da " + cont + "ª  nota");
			notas = chave.nextInt();

			res += notas;
			if (cont == i) {
				System.out.println("O resultado da média das " + i + " notas é: " + res / i);
			}
		}

	}

}
