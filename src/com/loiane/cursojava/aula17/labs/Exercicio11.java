package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {

		Scanner programa = new Scanner(System.in);

		int num1, num2, cont;

		System.out.println("Digite o primeiro número: ");
		num1 = programa.nextInt();

		System.out.println("Digite o segundo número: ");
		num2 = programa.nextInt();

		if (num1 < num2) {
				cont = num1 + 1;
			while (cont < num2) {
				System.out.println(cont);
				cont++;
			}
		}else if(num2 < num1) {
			cont = num2 + 2;
			while (cont < num1) {
				System.out.println(cont);
				cont++;
			}
		}
		
		System.out.println("A Soma dos números: " + (num1 + num2));

	}

}
