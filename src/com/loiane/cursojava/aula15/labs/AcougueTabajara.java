package com.loiane.cursojava.aula15.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AcougueTabajara {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner programa = new Scanner(System.in);

		double fileDuplo, kgFileDuplo, desconto;
		String entrada, cartaoLoja;

		System.out.println("Bem vindo ao Hipermercao Tabajara\n");

		System.out.println("Açogueiro: Qual carne o Senhor(a) deseja levar hoje?");
		System.out.println("Digite para selecionar a carne: Filé/Alcatra/Picanha");
		entrada = programa.nextLine();

		System.out.println("Você vai pagar no cartão da loja?");
		cartaoLoja = programa.nextLine();

		if (entrada.equalsIgnoreCase("Filé Duplo") || entrada.equalsIgnoreCase("File Duplo")
				|| entrada.equalsIgnoreCase("filé") || entrada.equalsIgnoreCase("file")
				|| entrada.equalsIgnoreCase("f")) {

			System.out.println("Digite quantidade de KG de carne deseja comprar!?");
			kgFileDuplo = programa.nextDouble();

			if (cartaoLoja.equalsIgnoreCase("Sim") || cartaoLoja.equalsIgnoreCase("s")) {

				if (kgFileDuplo <= 5) {

					fileDuplo = kgFileDuplo * 4.90;

					desconto = fileDuplo * 5 / 100;

					System.out.println("O valor a ser pago é: R$" + new DecimalFormat("#0.00").format(fileDuplo));
					System.out.println("O valor do desconto é: R$" + new DecimalFormat("#0.00").format(desconto));
					System.out.println(
							"O total a ser pago é: R$" + new DecimalFormat("#0.00").format(fileDuplo - desconto));

				} else if (kgFileDuplo > 5) {

					fileDuplo = kgFileDuplo * 5.80;

					desconto = fileDuplo * 5 / 100;

					System.out.println("O valor a ser pago é: R$" + new DecimalFormat("#0.00").format(fileDuplo));
					System.out.println("O valor do desconto é: R$" + new DecimalFormat("#0.00").format(desconto));
					System.out.println(
							"O total a ser pago é: R$" + new DecimalFormat("#0.00").format(fileDuplo - desconto));
				}

			}

			if (cartaoLoja.equalsIgnoreCase("Não") || cartaoLoja.equalsIgnoreCase("Nao")
					|| cartaoLoja.equalsIgnoreCase("n")) {

				if (kgFileDuplo <= 5) {

					fileDuplo = kgFileDuplo * 4.90;

					System.out.println("O valor a ser pago é: R$" + new DecimalFormat("#0.00").format(fileDuplo));

				} else if (kgFileDuplo > 5) {

					fileDuplo = kgFileDuplo * 5.80;

					System.out.println("O valor a ser pago é: R$" + new DecimalFormat("#0.00").format(fileDuplo));
				}

			}
		}
		
		if (entrada.equalsIgnoreCase("Alcatra") || entrada.equalsIgnoreCase("A")){

			System.out.println("Digite quantidade de KG de carne deseja comprar!?");
			kgFileDuplo = programa.nextDouble();

			if (cartaoLoja.equalsIgnoreCase("Sim") || cartaoLoja.equalsIgnoreCase("s")) {

				if (kgFileDuplo <= 5) {

					fileDuplo = kgFileDuplo * 5.90;

					desconto = fileDuplo * 5 / 100;

					System.out.println("O valor a ser pago é: R$" + new DecimalFormat("#0.00").format(fileDuplo));
					System.out.println("O valor do desconto é: R$" + new DecimalFormat("#0.00").format(desconto));
					System.out.println(
							"O total a ser pago é: R$" + new DecimalFormat("#0.00").format(fileDuplo - desconto));

				} else if (kgFileDuplo > 5) {

					fileDuplo = kgFileDuplo * 6.80;

					desconto = fileDuplo * 5 / 100;

					System.out.println("O valor a ser pago é: R$" + new DecimalFormat("#0.00").format(fileDuplo));
					System.out.println("O valor do desconto é: R$" + new DecimalFormat("#0.00").format(desconto));
					System.out.println(
							"O total a ser pago é: R$" + new DecimalFormat("#0.00").format(fileDuplo - desconto));
				}

			}

			if (cartaoLoja.equalsIgnoreCase("Não") || cartaoLoja.equalsIgnoreCase("Nao")
					|| cartaoLoja.equalsIgnoreCase("n")) {

				if (kgFileDuplo <= 5) {

					fileDuplo = kgFileDuplo * 5.90;

					System.out.println("O valor a ser pago é: R$" + new DecimalFormat("#0.00").format(fileDuplo));

				} else if (kgFileDuplo > 5) {

					fileDuplo = kgFileDuplo * 6.80;

					System.out.println("O valor a ser pago é: R$" + new DecimalFormat("#0.00").format(fileDuplo));
				}

			}
		}
		
		if (entrada.equalsIgnoreCase("Picanha") || entrada.equalsIgnoreCase("P")){

			System.out.println("Digite quantidade de KG de carne deseja comprar!?");
			kgFileDuplo = programa.nextDouble();

			if (cartaoLoja.equalsIgnoreCase("Sim") || cartaoLoja.equalsIgnoreCase("s")) {

				if (kgFileDuplo <= 5) {

					fileDuplo = kgFileDuplo * 6.90;

					desconto = fileDuplo * 5 / 100;

					System.out.println("O valor a ser pago é: R$" + new DecimalFormat("#0.00").format(fileDuplo));
					System.out.println("O valor do desconto é: R$" + new DecimalFormat("#0.00").format(desconto));
					System.out.println(
							"O total a ser pago é: R$" + new DecimalFormat("#0.00").format(fileDuplo - desconto));

				} else if (kgFileDuplo > 5) {

					fileDuplo = kgFileDuplo * 7.80;

					desconto = fileDuplo * 5 / 100;

					System.out.println("O valor a ser pago é: R$" + new DecimalFormat("#0.00").format(fileDuplo));
					System.out.println("O valor do desconto é: R$" + new DecimalFormat("#0.00").format(desconto));
					System.out.println(
							"O total a ser pago é: R$" + new DecimalFormat("#0.00").format(fileDuplo - desconto));
				}

			}

			if (cartaoLoja.equalsIgnoreCase("Não") || cartaoLoja.equalsIgnoreCase("Nao")
					|| cartaoLoja.equalsIgnoreCase("n")) {

				if (kgFileDuplo <= 5) {

					fileDuplo = kgFileDuplo * 6.90;

					System.out.println("O valor a ser pago é: R$" + new DecimalFormat("#0.00").format(fileDuplo));

				} else if (kgFileDuplo > 5) {

					fileDuplo = kgFileDuplo * 7.80;

					System.out.println("O valor a ser pago é: R$" + new DecimalFormat("#0.00").format(fileDuplo));
				}

			}
		}

	}
}
