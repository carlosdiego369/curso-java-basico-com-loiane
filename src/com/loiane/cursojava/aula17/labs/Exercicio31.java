package com.loiane.cursojava.aula17.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio31 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int ano = 1996;
		double salarioInicial = 1000, txAnual = 1.5;

		while (ano <= 2022) {

			salarioInicial = salarioInicial + (salarioInicial * txAnual) / 100;

			System.out.println("Ano: " + ano + " Salário: R$ " + new DecimalFormat("##.00").format(salarioInicial));

			txAnual += txAnual;
			ano++;

			if (ano > 2022) {
				System.out.println("Digite o salário inicial do funcionaário");
				salarioInicial = input.nextDouble();

				ano = 1996;

				while (ano <= 2022) {

					salarioInicial = salarioInicial + (salarioInicial * txAnual) / 100;

					System.out.println(
							"Ano: " + ano + " Salário: R$ " + new DecimalFormat("##.00").format(salarioInicial));
					txAnual += txAnual;
					ano++;
				}
			}
		}
	}

}
