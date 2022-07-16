package com.loiane.cursojava.aula17v2.labs;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {

		Scanner programa = new Scanner(System.in);

		int x;

		System.out.println("Digite o valor do número para ser multiplicado");
		x = programa.nextInt();

		System.out.println("Tabuada de " + x + ":");

		for (int i = 1; i <= 10; i++) {

			System.out.println(x + " X " + i + " = " + (x * i));

		}
	}

}
