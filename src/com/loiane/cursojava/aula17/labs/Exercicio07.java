package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {

		Scanner programa = new Scanner(System.in);
		
		int num1, num2, num3, num4, num5;
		
		System.out.println("Digite o primeiro n�mero: ");
		num1 = programa.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		num2 = programa.nextInt();
		
		System.out.println("Digite o terceiro n�mero: ");
		num3 = programa.nextInt();
		
		System.out.println("Digite o quarto n�mero: ");
		num4 = programa.nextInt();
		
		System.out.println("Digite o quinto n�mero: ");
		num5 = programa.nextInt();
		
		
		if(num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5) {
			
			System.out.println("Primeiro n�mero � maior " + num1);
		}else if(num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5) {
			
			System.out.println("Segundo n�mero � maior " + num2);
		}else if(num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5) {
			
			System.out.println("Terceiro n�mero � maior " + num3);
		}else if(num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5) {
			
			System.out.println("Quarto n�mero � maior " + num4);
		}else if(num5 > num1 && num5 > num2 && num5 > num3 && num5 > num4) {
			
			System.out.println("Quinto n�mero � maior " + num5);
		}
		
	}

}
