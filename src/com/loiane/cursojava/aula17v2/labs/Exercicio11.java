package com.loiane.cursojava.aula17v2.labs;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {

		
		Scanner programa = new Scanner(System.in);
		
		int x, y, z = 0;
		
		System.out.println("Digite o primeiro número: ");
		x = programa.nextInt();
		
		System.out.println("Digite o segundo número: ");
		y = programa.nextInt();
		
		
		for (int i = x; i <= y; i++) {
			z += i;
		}
		
		System.out.println("A soma dos valores: " + z);
	}

}
