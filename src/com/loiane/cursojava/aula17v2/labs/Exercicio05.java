package com.loiane.cursojava.aula17v2.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner programa = new Scanner(System.in);

		double popA, txPopA, popB, txPopB, ano = 0;
		boolean validador = false;

		do {
			System.out.println("Informe a ordem da popula��o A: ");
			popA = programa.nextDouble();

			if (popA > 0) {
				validador = true;
			} else {
				System.out.println("Popula��o A precisa ser maior que 0");
			}
		} while (!validador);

		validador = false;

		do {
			System.out.println("Informe a taxa de crescimento da popula��o A: ");
			txPopA = programa.nextDouble();

			if (txPopA > 0) {
				validador = true;
			} else {
				System.out.println("Taxa da crescimento da popula�ao A precisa ser maior que 0");
			}
		} while (!validador);

		validador = false;

		do {
			System.out.println("Informe a ordem da popula��o B: ");
			popB = programa.nextDouble();

			if (popB > 0) {
				validador = true;
			} else {
				System.out.println("Popula��o A precisa ser maior que 0");
			}
		} while (!validador);

		validador = false;

		do {
			System.out.println("Informe a taxa de crescimento da popula��o A: ");
			txPopB = programa.nextDouble();

			if (txPopB > 0) {
				validador = true;
			} else {
				System.out.println("Taxa de crescimento da popula��o B precisa ser maior que 0");
			}
		} while (!validador);

		validador = false;

		while (popA < popB) {

			popA += (popA / 100) * txPopA;
			popB += (popB / 100) * txPopB;
			ano++;
		}

		System.out.println("Taxa popula��o A: " + new DecimalFormat("##.").format(popA));
		System.out.println("Taxa popula��o B: " + new DecimalFormat("##.").format(popB));
		System.out.println("Anos necessarios para igualar os paises: " + ano);

	}
}
