package com.loiane.cursojava.aula27v2.labs;

public class LampadaController {

	Lampada lampada = new Lampada();

	void mostrarEstado() {
		lampada.ligada = true;
		if (lampada.ligada == true) {
			System.out.println("A lampada est� ligada");
		} else {
			System.out.println("A lampada est� desligada");
		}
		lampada.ligada = false;
		if (lampada.ligada == true) {
			System.out.println("A lampada est� ligada");
		} else {
			System.out.println("A lampada est� desligada");
		}
	}
}
