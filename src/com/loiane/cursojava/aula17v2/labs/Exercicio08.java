package com.loiane.cursojava.aula17v2.labs;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		Scanner programa = new Scanner(System.in);

		int num = 0, soma = 0;
		double media = 0;

		for (int i = 0; i < 5; i++) {
			System.out.println("Digite um número");
			num = programa.nextInt();

			soma += num;
		}
		media = soma / 5;
		
		System.out.println(soma);
		System.out.println(media);

	}

}
