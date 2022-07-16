package com.loiane.cursojava.aula19v2.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double[] vetorA = new double[20];
		double cotacao;

		System.out.println("Informe o valor do Dollar US$");
		cotacao = input.nextDouble();
		
		for (int i = 1; i < vetorA.length; i++) {
			vetorA[i] = cotacao * (i);
		}

		for (int i = 1; i < vetorA.length; i++) {
			System.out.println((i) +" US$ quantidade de dollar convertido em reais R$" + new DecimalFormat("###,###.###").format(vetorA[i]));
		}

	}

}
