package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class VerificadorDeLetrasV3 {

	public static void main(String[] args) {

		String regex = "\\b\\d+\\b";

		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite uma letra, vogal ou consoante: ");

		String letra = entrada.nextLine();

		if (letra.matches(regex)) {
			System.out.println("Número.");
		} else {

			if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i")
					|| letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
				System.out.println("Vogal");
			} else {
				System.out.println("Consoante");
			}
		}

	}

}
