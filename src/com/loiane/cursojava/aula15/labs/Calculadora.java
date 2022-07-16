package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner programa = new Scanner(System.in);

		int num1, num2, resultado;
		String entrada;

		System.out.println("Programa de Opera��es");

		System.out.println("Digite um n�mero: ");
		num1 = programa.nextInt();

		System.out.println("Digite o segundo n�mero:");
		num2 = programa.nextInt();

		System.out.println("Digite se voc� deseja saber 'Somar' ou 'Subtrair' ou 'Multiplicar e 'Dividir' :");
		entrada = programa.next();

		// Soma
		if (entrada.equalsIgnoreCase("Somar") || entrada.equalsIgnoreCase("+")) {

			resultado = num1 + num2;
			System.out.println("O resultado da soma �! " + resultado);
			
			if(resultado % 2 == 0) {
				System.out.println("Este n�mero � par! " + resultado);
			}else if(resultado % 2 == 1) {
				System.out.println("Este n�mero � impar! " + resultado);
			}if(resultado >= 0) {
				System.out.println("O n�mero � positivo! " + resultado);
			}else if ( resultado < 0) {
				System.out.println("O n�mero � negativo " + resultado);
			}
		}
				//subtra��o
			 if(entrada.equalsIgnoreCase("Subtrair") || entrada.equalsIgnoreCase("-")) {
			resultado = num1 - num2;
			System.out.println("O resultado da subtra��o �! " + resultado);
			
			 if(resultado % 2 == 0) {
				System.out.println("Este n�mero � par! " + resultado);
			}else if(resultado % 2 == 1) {
				System.out.println("O n�mero � positivo! " + resultado);
			}if(resultado >= 0) {
				System.out.println("O n�mero � positivo! " + resultado);
			}else if( resultado < 0) {
				System.out.println("O n�mero � negativo! " + resultado);
			}
		}
			 //multiplica��o
			if(entrada.equalsIgnoreCase("Multiplicar") || entrada.equalsIgnoreCase("*")){
				resultado = num1 * num2;
				System.out.println("O resultado da multiplica��o �! " + resultado);
				
				 if(resultado % 2 == 0) {
					System.out.println("Este n�mero � par! " + resultado);
				}else if(resultado % 2 == 1) {
					System.out.println("O n�mero � positivo! " + resultado);
				}if(resultado >= 0) {
					System.out.println("O n�mero � positivo! " + resultado);
				}else if( resultado < 0) {
					System.out.println("O n�mero � negativo! " + resultado);
				
			}
		}
			//divis�o
			if(entrada.equalsIgnoreCase("Dividir") || entrada.equalsIgnoreCase("/")){
				resultado = num1 / num2;
				System.out.println("O resultado da divis�o �! " + resultado);
				
				 if(resultado % 2 == 0) {
					System.out.println("Este n�mero � par! " + resultado);
				}else if(resultado % 2 == 1) {
					System.out.println("O n�mero � positivo! " + resultado);
				}if(resultado >= 0) {
					System.out.println("O n�mero � positivo! " + resultado);
				}else if( resultado < 0) {
					System.out.println("O n�mero � negativo! " + resultado);
				
			}
			
		}
	
}
}

