package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class ConversorDeMetrosParaCm {

	public static void main(String[] args) {

		System.out.println("Conversor de metros para cent�metros: ");
		
		System.out.println("Digite o valor em Metros");
		
		@SuppressWarnings("resource")
		Scanner conversor = new Scanner(System.in);
		
		double metro, resultado;
		
		
		metro = conversor.nextDouble();
		
		resultado = metro * 100;
		
		System.out.println("O valor do metro �: " + metro);
		
		System.out.println("A conversando de Metro para Cm �: " + resultado + "cm");
		
	}

}
