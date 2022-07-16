package com.loiane.cursojava.aula17v2.labs;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int fibo, primeiro = 1, segundo = 1, proximo;

		System.out.println("Entre com o n-ésimo termo da série de fibonacci: ");
		fibo = input.nextInt();

		System.out.println(primeiro);
		System.out.println(segundo);
		
		for (int i = 3; i <= fibo; i++) {

			proximo = primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;
			
			System.out.println(proximo);

		}
	}

}
