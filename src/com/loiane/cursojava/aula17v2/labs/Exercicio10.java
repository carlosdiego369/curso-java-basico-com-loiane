package com.loiane.cursojava.aula17v2.labs;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		Scanner programa = new Scanner(System.in);

		int x, y;

		System.out.println("Digite o primeiro número ");
		x = programa.nextInt();

		System.out.println("Digite o segundo número ");
		y = programa.nextInt();

		if (y <= x) {
			System.out.println("Operação Inválida");
		} else {
			for (x = x + 1; x < y; x++) {
				
				System.out.println(x);
			}
		}

	}

}
