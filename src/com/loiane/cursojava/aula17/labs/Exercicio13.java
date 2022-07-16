package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		
		Scanner programa = new Scanner(System.in);

		int num1, num2, calc = 0;

		System.out.println("Digite o número base: ");
		num1 = programa.nextInt();

		System.out.println("Digite o número do expoente: ");
		num2 = programa.nextInt();
		
			
		calc = num1;
				
				for(int cont = 1;cont < num2; cont++) {
					
					calc *= num1;
					
				}
				
				System.out.println(calc);
		
	}

}
