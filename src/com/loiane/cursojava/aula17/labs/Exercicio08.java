package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner programa = new Scanner(System.in);

		int num1, num2, num3, num4, num5, soma, media;

		System.out.println("Digite o primeiro número: ");
		num1 = programa.nextInt();

		System.out.println("Digite o segundo número: ");
		num2 = programa.nextInt();

		System.out.println("Digite o terceiro número: ");
		num3 = programa.nextInt();

		System.out.println("Digite o quarto número: ");
		num4 = programa.nextInt();

		System.out.println("Digite o quinto número: ");
		num5 = programa.nextInt();

		
		soma = num1 + num2 + num3 + num4 + num5;
		media = (num1 + num2 + num3 + num4 + num5) / 5;
		
		System.out.println("Soma: " + soma);
		System.out.println("Média: " + media);
		
	}

}
