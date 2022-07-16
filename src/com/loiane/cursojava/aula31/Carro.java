package com.loiane.cursojava.aula31;

public class Carro {
	public String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	private double consumoCombustivel; 
	
	
	
	public void exibirAutonomia() {
		System.out.println("A autonomia do carro é: " + this.capCombustivel * this.consumoCombustivel + "km/L");
	}

	public double obterAutonomia() {

		System.out.println("Método obterAutonomia foi chamado.");

		return this.capCombustivel * this.consumoCombustivel;

	}
	
	private double divideKmPorConsumoCombustivel(double km) {
		return km/this.consumoCombustivel;
		
	}

	double calcularCombustivel(double km) {

		return this.divideKmPorConsumoCombustivel(km);

	}
	
}
