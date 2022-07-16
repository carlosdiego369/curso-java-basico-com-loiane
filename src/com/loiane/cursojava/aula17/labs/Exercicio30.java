package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio30 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int num, com, ter;
		
		System.out.println("Insira o valor da tabuada: ");
		num = input.nextInt();
		
		System.out.println("Voc� quer que ela comece em qual n�mero? :");
		com = input.nextInt();
		
		System.out.println("Voc� quer que ela termine em qual n�mero? :");
		ter = input.nextInt();
		
		while(ter < com) {
			System.out.println("N�mero final e maior que o n�mero inicial");
			System.out.println("Por favor digite corretamente!");
			
			System.out.println("Voc� quer que ela comece em qual n�mero? :");
			com = input.nextInt();
			
			System.out.println("Voc� quer que ela termine em qual n�mero? :");
			ter = input.nextInt();
		}
		
		System.out.println("Vou montar a tabuada de " + num + " come�ando em " + com + " e terminando em " + ter + ":");
		
		for(int i = com;i <= ter; i++) {
			System.out.println(num + " X " + i + " = " + (num * i));
		}
	}

}
