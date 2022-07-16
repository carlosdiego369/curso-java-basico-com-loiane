package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class VerificadorDeAnoBissexto {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner programa = new Scanner(System.in);

		System.out.println("Olá, usuário(a), Sejam Bem-Vindos:");
		System.out.println("Programa Verificador de Anos Bissextos (366 Dias)");
		System.out.println("Entre com o valor do ano para ser verificado: ");

		int ano = programa.nextInt();

		if (ano % 4 == 0 ) {
			System.out.println("Este ano é um ano bissexto! (tem 366 dias) ");

		} else {
			System.out.println("Este ano não é um ano bissexto! (tem 365 dias) ");
		}

	}

}
