package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class IdentificadorDeNumerosPositivos {

	public static void main(String[] args) {

		System.out.println("Programa de verifica��o se o n�mero � positivo ou negativo");
		
		double num;
		
		@SuppressWarnings("resource")
		Scanner programa = new Scanner(System.in);
		
		System.out.println("Entre com o n�mero: ");
		num = programa.nextDouble();
		
		
		
		if (num > 0) {
			System.out.println("Numero � positivo! " + num);
		}else if (num < 0) {
			System.out.println("Numero � negativo! " + num);
		}else if (num == 0) {
			System.out.println("Zero � um n�mero neutro! " + num);
		}
		
		
	}

}
