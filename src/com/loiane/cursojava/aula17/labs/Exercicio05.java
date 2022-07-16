package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner programa = new Scanner(System.in);
		
		
		int  ano = 0;
		double txPopulacaoA, txAnualA, paisA, txPopulacaoB, paisB, txAnualB;
		
		System.out.println("Digite o valor da População A: ");
		txPopulacaoA = programa.nextDouble();
		
		System.out.println("Digite a taxa de crescimento da População A: ");
		txAnualA = programa.nextDouble();
		
		System.out.println("Digite o valor da População B: ");
		txPopulacaoB = programa.nextDouble();
		
		System.out.println("Digite a taxa de crescimento da População B: ");
		txAnualB = programa.nextDouble();

		paisA = txPopulacaoA / 100 * txAnualA;
		paisB = txPopulacaoB / 100 * txAnualB;

		System.out.println(paisA);
		System.out.println(paisB);

		while (txPopulacaoA <= txPopulacaoB) {
			paisA = txPopulacaoA / 100 * txAnualA;
			paisB = txPopulacaoB / 100 * txAnualB;

			txPopulacaoA = txPopulacaoA + paisA;
			txPopulacaoB = txPopulacaoB + paisB;
			System.out.println("Pais A: " + txPopulacaoA);
			System.out.println("Pais B: " + txPopulacaoB);
			System.out.println("Anos: " + ano);

			ano++;
		}

	}

}
