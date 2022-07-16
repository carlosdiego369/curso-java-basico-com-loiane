package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class ComparadorDePrecosV2 {

	public static void main(String[] args) {
		System.out.println("Programa Números Decrescentes: v.002");

		int num1, num2, num3;

		@SuppressWarnings("resource")
		Scanner programa = new Scanner(System.in);

		System.out.println("Digite o primeiro valor: ");
		num1 = programa.nextInt();

		System.out.println("Digite o segundo valor: ");
		num2 = programa.nextInt();

		System.out.println("Digite o terceiro valor:");
		num3 = programa.nextInt();
		
		
		if (num1 <= num2 && num1 <= num3 && num2 <= num3) {
			System.out.println(num3);
			System.out.println(num2);
			System.out.println(num1);
			
		}else if (num1 <= num2 && num1 <= num3 && num3 <= num2) {
			System.out.println(num2);
			System.out.println(num3);
			System.out.println(num1);
			
		}else if (num2 <= num1 && num2 <= num3 && num1 <= num3) {
			System.out.println(num3);
			System.out.println(num1);
			System.out.println(num2);
			
		}else if (num2 <= num1 && num2 <= num3 && num3 <= num1) {
			System.out.println(num1);
			System.out.println(num3);
			System.out.println(num2);
			
		}else if (num3 <= num1 && num3 <= num2 && num1 <= num2) {
			System.out.println(num2);
			System.out.println(num1);
			System.out.println(num3);
			
		}else if (num3 <= num1 && num3 <= num2 && num2 <= num3) {
			System.out.println(num1);
			System.out.println(num2);
			System.out.println(num3);
		}


}
}