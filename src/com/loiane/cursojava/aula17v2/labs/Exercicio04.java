package com.loiane.cursojava.aula17v2.labs;

public class Exercicio04 {

	public static void main(String[] args) {

		int popA = 80000, popB = 200000, ano = 0;

		while (popA < popB) {

			popA += (popA / 100) * 3;
			popB += (popB / 100) * 1.5;
			ano++;

		}
		System.out.println("Taxa população A: " + popA);
		System.out.println("Taxa população B: " + popB);
		System.out.println("Anos necessarios para igualar os paises: " + ano);

	}

}
