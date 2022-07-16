package com.loiane.cursojava.aula27.labs;

import java.util.Scanner;

public class Lampada {
	
	int oid;
	String modelo;
	String tensao;
	int potencia;
	String cor;
	String tipoLuz;
	int garantiaMeses;
	boolean tipoAbajur;
	
	boolean ligada;

	Scanner input = new Scanner(System.in);
	
	boolean valido = false;

	void onAndOff() {
		int num; 
		while(!valido) {
		System.out.println("Digite: 1 - On / 0 - Off");
		num = input.nextInt();

		if (num == 1) {
			System.out.println("Lampada Ligada");
			valido = true;
		} else if (num == 0) {
			System.out.println("Lampada Desligada");
			valido = true;
		}else {
			System.out.println("Número inválido, digite novamente! ");
			valido = false;
			
		}
		}
	}

}
