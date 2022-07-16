package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner programa = new Scanner(System.in);

		int num1, num2, resultado;
		String entrada;

		System.out.println("Programa de Operações");

		System.out.println("Digite um número: ");
		num1 = programa.nextInt();

		System.out.println("Digite o segundo número:");
		num2 = programa.nextInt();

		System.out.println("Digite se você deseja saber 'Somar' ou 'Subtrair' ou 'Multiplicar e 'Dividir' :");
		entrada = programa.next();

		// Soma
		if (entrada.equalsIgnoreCase("Somar") || entrada.equalsIgnoreCase("+")) {

			resultado = num1 + num2;
			System.out.println("O resultado da soma é! " + resultado);
			
			if(resultado % 2 == 0) {
				System.out.println("Este número é par! " + resultado);
			}else if(resultado % 2 == 1) {
				System.out.println("Este número é impar! " + resultado);
			}if(resultado >= 0) {
				System.out.println("O número é positivo! " + resultado);
			}else if ( resultado < 0) {
				System.out.println("O número é negativo " + resultado);
			}
		}
				//subtração
			 if(entrada.equalsIgnoreCase("Subtrair") || entrada.equalsIgnoreCase("-")) {
			resultado = num1 - num2;
			System.out.println("O resultado da subtração é! " + resultado);
			
			 if(resultado % 2 == 0) {
				System.out.println("Este número é par! " + resultado);
			}else if(resultado % 2 == 1) {
				System.out.println("O número é positivo! " + resultado);
			}if(resultado >= 0) {
				System.out.println("O número é positivo! " + resultado);
			}else if( resultado < 0) {
				System.out.println("O número é negativo! " + resultado);
			}
		}
			 //multiplicação
			if(entrada.equalsIgnoreCase("Multiplicar") || entrada.equalsIgnoreCase("*")){
				resultado = num1 * num2;
				System.out.println("O resultado da multiplicação é! " + resultado);
				
				 if(resultado % 2 == 0) {
					System.out.println("Este número é par! " + resultado);
				}else if(resultado % 2 == 1) {
					System.out.println("O número é positivo! " + resultado);
				}if(resultado >= 0) {
					System.out.println("O número é positivo! " + resultado);
				}else if( resultado < 0) {
					System.out.println("O número é negativo! " + resultado);
				
			}
		}
			//divisão
			if(entrada.equalsIgnoreCase("Dividir") || entrada.equalsIgnoreCase("/")){
				resultado = num1 / num2;
				System.out.println("O resultado da divisão é! " + resultado);
				
				 if(resultado % 2 == 0) {
					System.out.println("Este número é par! " + resultado);
				}else if(resultado % 2 == 1) {
					System.out.println("O número é positivo! " + resultado);
				}if(resultado >= 0) {
					System.out.println("O número é positivo! " + resultado);
				}else if( resultado < 0) {
					System.out.println("O número é negativo! " + resultado);
				
			}
			
		}
	
}
}

