package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		
		Scanner programa = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("Digite o primeiro número: ");
		num1 = programa.nextInt();

		System.out.println("Digite o segundo número: ");
		num2 = programa.nextInt();
		
		
		if(num1 < num2) {
			
			num1 = num1+ 1;
			while(num1 < num2) {
				System.out.println(num1);
				num1++;
			}
		}else if(num2 < num1) {
			num2 = num2 +1;
			while(num2 < num1) {
				System.out.println(num2);
				num2++;
			}
		}else if(num1 == num2 || num2 == num1) {
			System.out.println("Números iguais!");
		}
		
	}

}
