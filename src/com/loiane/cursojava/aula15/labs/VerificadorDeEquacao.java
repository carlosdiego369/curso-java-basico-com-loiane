package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class VerificadorDeEquacao {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner programa = new Scanner(System.in);

		double a, b, c, delta;

		System.out.println("Sistema de Cálculo de Equação de Segundo Grau: ");
		System.out.println("Fórmula do Delta: Δ = b2 – 4ac");
		System.out.println("Entre com o primeiro valor: ");

		a = programa.nextDouble();

		// A
		if (a == 0) {

			System.out.println("A equação não é do segundo grau!");
		} else {

			System.out.println("Entre com o segundo valor: ");
			b = programa.nextDouble();

			System.out.println("Entre com o terceiro valor: ");
			c = programa.nextDouble();
			delta = (b * b) + ((-4) * a * c);

			// B
			if (delta <= 0) {

				System.out.println("A equação não possui raiz reais! " + delta);

			} else {

				// C
				if (delta == 0) {
					System.out.println("Delta igual a zero a equação possui apenas uma raiz real! " + delta);
				} else {

					// D
					if (delta >= 0) {
						System.out.println("Delta é positivo possui duas raiz reais");
						System.out.println("O valor de Delta é Δ: " + delta);
					}

				}

			}

		}
	}
}
