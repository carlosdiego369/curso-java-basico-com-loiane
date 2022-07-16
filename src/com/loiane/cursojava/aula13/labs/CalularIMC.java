package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class CalularIMC {

	public static void main(String[] args) {

		double altura;
		double pesoIdeal;

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		System.out.println("**** Sitema para calcular o IMC ****");

		System.out.println("Digite sua altura: 'Ex.: 1,78'");

		altura = scan.nextDouble();

		pesoIdeal = (72.7 * altura - 58);

		System.out.println("Seu peso ideal é: " + pesoIdeal);

	}

}
