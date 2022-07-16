package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {

		Scanner chave = new Scanner(System.in);

		int notas, i, res = 0;

		System.out.println("Digite a quantidade de pessoas: ");
		i = chave.nextInt();

		for (int cont = 1; cont <= i; cont++) {

			System.out.println("Digite a idade da " + cont + "ª  pessoa");
			notas = chave.nextInt();

			res += notas;
			if (cont == i) {
				System.out.println("O resultado da média das " + i + " idades é: " + res / i);

				res = res / i;

				if (res >= 0 && res <= 25) {
					System.out.println("Turma Jovem");
				} else if (res >= 26 && res <= 60) {
					System.out.println("Turma Adulta");
				} else if (res > 60) {
					System.out.println("Turma Idosa");
				}
			}
		}

	}

}
