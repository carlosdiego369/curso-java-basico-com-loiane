package com.loiane.cursojava.aula17.labs;

public class Exercicio15 {

	public static void main(String[] args) {

		for (int f1 = 0, f2 = 1, i = 0; ; f2 += f1, f1 = f2-f1, i++ ) {
			System.out.println(f1);
		}
	}

}
