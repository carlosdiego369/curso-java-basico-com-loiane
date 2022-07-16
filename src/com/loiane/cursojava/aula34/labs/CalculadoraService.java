package com.loiane.cursojava.aula34.labs;

public class CalculadoraService {

	public static void main(String[] args) {
		
	CalculadoraController.imprimirTela(CalculadoraController.somar(1, 2));
	
	CalculadoraController.imprimirTela(CalculadoraController.subtrair(2, 1));
	
	CalculadoraController.imprimirTela(CalculadoraController.multiplicar(2, 2));
	
	CalculadoraController.imprimirTela(CalculadoraController.dividir(4, 2));
	
	CalculadoraController.imprimirTela((int) CalculadoraController.potencia(2, 4));

	}

}
