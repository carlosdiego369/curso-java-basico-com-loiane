package com.loiane.cursojava.aula27.labs;

import java.util.Scanner;

public class LampadaService {

	public static void main(String[] args) {

		LampadaController lc = new LampadaController(new Scanner(System.in));

		lc.ligar();
		lc.desligar();

	}

}
