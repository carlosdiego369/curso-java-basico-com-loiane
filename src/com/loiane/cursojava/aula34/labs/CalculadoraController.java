package com.loiane.cursojava.aula34.labs;

public class CalculadoraController {

	public static int somar(int num1, int num2) {
		return num1 + num2;
	}

	public static int subtrair(int num1, int num2) {
		return num1 - num2;
	}

	public static int multiplicar(int num1, int num2) {
		return num1 * num2;
	}

	public static int dividir(int num1, int num2) {
		return num1 / num2;
	}

	public static double potencia(int num1, int num2) {
		return Math.pow(num1, num2);
	}

	public static void imprimirTela(int num) {
		System.out.println(num);
	}

	public static int fatorial(int num) {
		
		if (num == 0) {
			return 1;
		}
		int total = 1;
		for (int i = num; i>1; i--) {
			total *= i;
		}

		imprimirTela(total);
		return total;

	}

	public static void imprimir(String texto) {
		System.out.println(texto);
	}
}
