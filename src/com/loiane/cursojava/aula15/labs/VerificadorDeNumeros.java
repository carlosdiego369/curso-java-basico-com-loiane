package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class VerificadorDeNumeros {

	public static void main(String[] args) {

		System.out.println("Programa Verificador de N�meros");
		
		int num1, num2, num3;
		
		@SuppressWarnings("resource")
		Scanner programa = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro n�mero: ");
		num1 = programa.nextInt();
		
		System.out.println("Entre com o segundo n�mero: ");
		num2 = programa.nextInt();
		
		System.out.println("Entre com o terceiro n�mero: ");
		num3 = programa.nextInt();
		
		if(num1 == num2) {
			System.out.println("O primeiro n�mero e o segundo s�o iguais!");
		}else if (num1 == num3) {
			System.out.println("O primeiro n�mero e o terceiro s�o iguais!");
		}else if(num2 == num3) {
			System.out.println("O segundo n�mero e igual o terceiro");
		}
		
		if (num1 > num2) {
			System.out.println("O primeiro n�mero � maior: " + num1);
		}else if (num2 > num3)  {
			System.out.println("O segundo n�mero � maior: " + num2);	
			}
				else {
					System.out.println("O Terceiro n�mero � maior: " + num3);
			}
				
				System.out.println("Obrigado, o sistema ser� encerrado!");
			}
		}
		
