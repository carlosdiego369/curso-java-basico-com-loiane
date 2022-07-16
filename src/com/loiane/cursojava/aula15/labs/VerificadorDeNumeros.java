package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class VerificadorDeNumeros {

	public static void main(String[] args) {

		System.out.println("Programa Verificador de Números");
		
		int num1, num2, num3;
		
		@SuppressWarnings("resource")
		Scanner programa = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro número: ");
		num1 = programa.nextInt();
		
		System.out.println("Entre com o segundo número: ");
		num2 = programa.nextInt();
		
		System.out.println("Entre com o terceiro número: ");
		num3 = programa.nextInt();
		
		if(num1 == num2) {
			System.out.println("O primeiro número e o segundo são iguais!");
		}else if (num1 == num3) {
			System.out.println("O primeiro número e o terceiro são iguais!");
		}else if(num2 == num3) {
			System.out.println("O segundo número e igual o terceiro");
		}
		
		if (num1 > num2) {
			System.out.println("O primeiro número é maior: " + num1);
		}else if (num2 > num3)  {
			System.out.println("O segundo número é maior: " + num2);	
			}
				else {
					System.out.println("O Terceiro número é maior: " + num3);
			}
				
				System.out.println("Obrigado, o sistema será encerrado!");
			}
		}
		
