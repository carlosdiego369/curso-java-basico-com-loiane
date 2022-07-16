package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class CalcularAreaQuadrado {

	public static void main(String[] args) {

		System.out.println("****Programa que calcula a área do quadrado****");
		
		@SuppressWarnings("resource")
		Scanner areaQuadrado = new Scanner(System.in);
		
		double area, resultado;
		
		
		System.out.println("Digite o valor da area a ser calculada");
		
		area = areaQuadrado.nextDouble();
		
		resultado = 2 * area;
		
		System.out.println("Resultado: " + resultado);
		
		System.out.println("Resultado da area em dobro: " + 2 * resultado);
		
		
	}

}
