package com.loiane.cursojava.aula17v2.labs;

public class Exercicio16 {

	public static void main(String[] args) {
		int primeiro = 1, segundo = 1, proximo = 0;

		System.out.println(primeiro);
		System.out.println(segundo);

		while (proximo < 500) {

			proximo = primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;

			System.out.println(proximo);

		}
	}

}
