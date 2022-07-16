package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class ComparadorDePrecos {

	public static void main(String[] args) {

		
		@SuppressWarnings("resource")
		Scanner programa = new Scanner(System.in);
		
		int valor1, valor2, valor3;
		
		System.out.println("Programa Comparador de Pre�os");
		System.out.println("Digite o pre�o do produto 1: ");
		valor1 = programa.nextInt();
		
		System.out.println("Digite o pre�o do produto 2: ");
		valor2 = programa.nextInt();
		
		System.out.println("Digite o pre�o do produto 3: ");
		valor3 = programa.nextInt();
		
		//Comparador dos mesmo valor do produto! Anti-Moleque
		if (valor1 == valor2) {
			System.out.println("Os produtos 1 e 2 s�o do mesmo valor! ");
		}else if(valor1 == valor3) {
			System.out.println("Os produtos 1 e 3 s�o do mesmo valor! ");
		}else if(valor2 == valor3) {
			System.out.println("Os produtos 2 e 3 s�o do mesmo valor1 ");
		}
		
		if(valor1 < valor2) {
			System.out.println("O produto 1 � o mais barato! " + valor1);
		}else if(valor2 < valor3) {
			
			System.out.println("O produto 2 � o mais barato! " + valor2);
		}else {
			System.out.println("O produto 3 � o mais barato! " + valor3);
		}
	}

}
