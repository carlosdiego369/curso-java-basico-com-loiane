package com.loiane.cursojava.aula34.labs;

public class ContadorController {

	private static int cont;

	public static int acrementarValor() {
		return cont++;
	}

	public static int decrementarValor() {
		return cont--;
	}

	public static int zerarValor() {
		return cont = 0;
	}

	public static void imprimirValor() {
		System.out.println(cont);
	}
}
