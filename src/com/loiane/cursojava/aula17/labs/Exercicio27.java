package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio27 {

	public static void main(String[] args) {

		Scanner chave = new Scanner(System.in);

		double graus, soma = 0, min, max, media, i = 1;
		String fechar = null;


		System.out.println("Digite o valor da temperatura");
		graus = chave.nextDouble();
		
		min = max = graus; // para identificar o menor e o maior
		soma += graus; // para somar o grau digitado por fora
		while (i > 0) {
			
			
			System.out.println("Deseja inserir mais alguma temperatura? (Sim ou Não)");
			fechar = chave.next();
			
			if (fechar.equalsIgnoreCase("Sim")) {
				
				System.out.println("Digite o valor da temperatura");
				graus = chave.nextDouble();
				
				soma += graus; // para pegar os graus digitados dentro do if
				
				if(graus > max) {
					max = graus;
					
				}else if(graus < min){
					min = graus;
				};
				
				i++;
			} else {

				fechar.equalsIgnoreCase("Não");
				
				media = soma / i;

				System.out.println("Temperatura Máxima: " + max + "º C");
				System.out.println("Temperatura Mínima: " + min + "º C");
				System.out.println("Média de temperatura: " + media + "º C");

				i = 0;
			}
		}
	}
}
