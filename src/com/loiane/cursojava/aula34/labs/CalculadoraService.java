package com.loiane.cursojava.aula34.labs;

import java.util.Scanner;

public class CalculadoraService {

	public static void main(String[] args) {

		CalculadoraController.imprimirTela(CalculadoraController.somar(1, 2));

		CalculadoraController.imprimirTela(CalculadoraController.subtrair(2, 1));

		CalculadoraController.imprimirTela(CalculadoraController.multiplicar(2, 2));

		CalculadoraController.imprimirTela(CalculadoraController.dividir(4, 2));

		CalculadoraController.imprimirTela((int) CalculadoraController.potencia(2, 4));
		
		Scanner input = new Scanner(System.in);
		int num;
		do {
			
			CalculadoraController.imprimir("Entre com o valor positivo para factoriar");
			num = input.nextInt();
			if (num < 0) {
				CalculadoraController.imprimir("Valor inválido, digite novamente!");
			}
			CalculadoraController.fatorial(num);
		} while (num < 0);

		CalculadoraController.imprimirTela(CalculadoraController.fatorial(num));
		input.close();
	}

}
