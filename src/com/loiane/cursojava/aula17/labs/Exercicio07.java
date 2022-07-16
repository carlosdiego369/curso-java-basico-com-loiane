package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {

		Scanner programa = new Scanner(System.in);
		
		int num1, num2, num3, num4, num5;
		
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
		
		
		if(num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5) {
			
			System.out.println("Primeiro número é maior " + num1);
		}else if(num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5) {
			
			System.out.println("Segundo número é maior " + num2);
		}else if(num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5) {
			
			System.out.println("Terceiro número é maior " + num3);
		}else if(num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5) {
			
			System.out.println("Quarto número é maior " + num4);
		}else if(num5 > num1 && num5 > num2 && num5 > num3 && num5 > num4) {
			
			System.out.println("Quinto número é maior " + num5);
		}
		
	}

}
