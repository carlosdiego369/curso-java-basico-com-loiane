package com.loiane.cursojava.aula17v2.labs;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {

		Scanner programa = new Scanner(System.in);
		
		int num, impar = 0, par = 0, count = 1;
		
		
		while(count <= 4) {
			
			System.out.println("Digite o valor");
			num = programa.nextInt();
			
			if(num %2 == 0) {
				par++;
			}else {
				impar++;
			}
			count++;	
		}
		
		System.out.println("Numeros impares digitados: " + impar);
		System.out.println("Numeros pares digitados: " + par);
		
	}

}
