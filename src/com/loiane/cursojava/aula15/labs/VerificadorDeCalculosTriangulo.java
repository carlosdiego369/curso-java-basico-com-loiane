package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class VerificadorDeCalculosTriangulo {

	public static void main(String[] args) {

		System.out.println("Programa que calcula 3 lados de um tri�ngulo");

		@SuppressWarnings("resource")
		Scanner programa = new Scanner(System.in);

		int lado1, lado2, lado3;

		System.out.println("Digite o valor do primeiro lado do tri�ngulo: ");
		lado1 = programa.nextInt();

		System.out.println("Digite o valor do segundo lado do tri�ngulo: ");
		lado2 = programa.nextInt();

		System.out.println("Digite o alor do terceiro lado do tri�ngulo: ");
		lado3 = programa.nextInt();

		
		System.out.println("Lado 1 :" + lado1);
		System.out.println("Lado 2 :" + lado2);
		System.out.println("Lado 3 :" + lado3);

		if (lado1 == lado2 && lado1 == lado3) {
			System.out.println("Tri�ngulo Equil�tero");
			
		} else if (lado1 == lado2 && lado1 != lado3 || lado2 == lado3 && lado2 != lado1 || lado1 == lado3 && lado1 != lado2) {

			System.out.println("Tri�ngulo Is�sceles");
			
		} else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {

			System.out.println("Tri�ngulo Escaleno");
		}

	}

}
