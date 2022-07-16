package com.loiane.cursojava.aula33;

public class MinhaCalculadoraService {

	public static void main(String[] args) {
		MinhaCalculadoraController calc = new MinhaCalculadoraController();

		calc.soma(1, 2);
		calc.soma(1.0, 2.0);
	}
}
