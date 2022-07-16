package com.loiane.cursojava.aula27.labs;

import java.util.Scanner;

public class LampadaController {

	Lampada lampada = new Lampada();
	String text = "";

	Scanner input;

	public LampadaController(Scanner scanner) {
		this.input = scanner;
	}
	
	void ligar() {
		lampada.ligada = true;
		text = "Ligada";
		System.out.println(text);
	}

	void desligar() {
		lampada.ligada = false;
		text = "Desligada";
		System.out.println(text);
	}
}
