package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {

		Scanner programa = new Scanner(System.in);
		
		int num, calc, cont =1;
		
		System.out.println("Programa de Tabuada");
		System.out.println("Digite o número que voce quer verificar: ");
		num = programa.nextInt();
		
		
		while(cont <= 10) {
			calc = num * cont;
			System.out.println(num + " X " + cont + " = " + calc);
			cont++;
		}
	}

}
