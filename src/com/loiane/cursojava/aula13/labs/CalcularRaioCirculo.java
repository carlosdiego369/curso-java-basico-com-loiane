package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class CalcularRaioCirculo {

	public static void main(String[] args) {

		
		System.out.println("Sistema para calcular o raio de um círculo: ");
		
		

		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor do raio a ser calculado: ");
		double raio = scan.nextDouble();
		
		double area = Math.PI * Math.pow(raio, 2);
		
		
		System.out.println("Digite o valor do raio a ser calculado: " + area);
		
		
		
	}

}
