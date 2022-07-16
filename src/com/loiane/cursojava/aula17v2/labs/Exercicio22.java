package com.loiane.cursojava.aula17v2.labs;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {

		int cd;
		double preco, soma = 0, media;

		Scanner input = new Scanner(System.in);

		System.out.println("Digite a quantidade de CD's");
		cd = input.nextInt();

		for (int i = 1; i <= cd; i++) {
			System.out.println("Informe o valor do cd " + i);
			preco = input.nextDouble();
			
			soma += preco;
		}
		
		media = soma / cd;
		System.out.println("A média gasta com cada CD: " + media);

	}

}
