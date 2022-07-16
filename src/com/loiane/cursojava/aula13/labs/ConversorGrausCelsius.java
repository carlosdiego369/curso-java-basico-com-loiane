package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class ConversorGrausCelsius {

	public static void main(String[] args) {

		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		int celsius;
		int conversor;
		
		System.out.println("**** Sistema para conversão de Graus Celsius para Farenheit ****");
		
		
		System.out.println("Digite o valor em Graus Celsius para ser convertido: ");
		
		celsius = scan.nextInt();
		
		conversor = (celsius * 9 / 5) + 32;
		
		System.out.println("A conversão para farenheit é: " + conversor + " ºF");
		
	}

}
