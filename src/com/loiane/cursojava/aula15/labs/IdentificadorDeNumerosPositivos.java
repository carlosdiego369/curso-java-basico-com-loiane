package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class IdentificadorDeNumerosPositivos {

	public static void main(String[] args) {

		System.out.println("Programa de verificação se o número é positivo ou negativo");
		
		double num;
		
		@SuppressWarnings("resource")
		Scanner programa = new Scanner(System.in);
		
		System.out.println("Entre com o número: ");
		num = programa.nextDouble();
		
		
		
		if (num > 0) {
			System.out.println("Numero é positivo! " + num);
		}else if (num < 0) {
			System.out.println("Numero é negativo! " + num);
		}else if (num == 0) {
			System.out.println("Zero é um número neutro! " + num);
		}
		
		
	}

}
