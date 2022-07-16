package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class VerificadorDeNumInteiros {

	public static void main(String[] args) {

		int num1;
		int num2;
		float real;
		
		
		
		@SuppressWarnings("resource")
		Scanner calculo = new Scanner(System.in);
		
		System.out.println("Programa do exercicio 11");
		
		System.out.println("Digite um número inteiro");
		
		num1 = calculo.nextInt();
		
		System.out.println("Digite outro número inteiro");
		
		num2 = calculo.nextInt();
		
		System.out.println("Digite um numero real ex: 0,12 etc...");
		
		real = calculo.nextFloat();
		
		int a = (num1 * 2) * (num2 /2) ;
		double b = ((num1 * 3) + real );
		double c = Math.pow(real, 3);
		
		System.out.println("Soma de todos: " + (num1 + num2 + real));
		System.out.println("Dobro do primeiro com a metade do segundo " + a);
		System.out.println("Triplo do primeiro com o terceiro " + b);
		System.out.println("Terceiro elevado ao Cubo " + c);
		
	}

}
