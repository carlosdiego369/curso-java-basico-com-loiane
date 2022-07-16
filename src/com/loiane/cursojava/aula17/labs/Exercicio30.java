package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio30 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int num, com, ter;
		
		System.out.println("Insira o valor da tabuada: ");
		num = input.nextInt();
		
		System.out.println("Você quer que ela comece em qual número? :");
		com = input.nextInt();
		
		System.out.println("Você quer que ela termine em qual número? :");
		ter = input.nextInt();
		
		while(ter < com) {
			System.out.println("Número final e maior que o número inicial");
			System.out.println("Por favor digite corretamente!");
			
			System.out.println("Você quer que ela comece em qual número? :");
			com = input.nextInt();
			
			System.out.println("Você quer que ela termine em qual número? :");
			ter = input.nextInt();
		}
		
		System.out.println("Vou montar a tabuada de " + num + " começando em " + com + " e terminando em " + ter + ":");
		
		for(int i = com;i <= ter; i++) {
			System.out.println(num + " X " + i + " = " + (num * i));
		}
	}

}
