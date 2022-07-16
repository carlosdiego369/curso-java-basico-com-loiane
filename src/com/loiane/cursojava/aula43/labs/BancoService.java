package com.loiane.cursojava.aula43.labs;

import java.util.Scanner;

public class BancoService extends ContaBancaria {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		

		input.close();
	}
	
	public static String obterInfo(String texto, Scanner input) {
		System.out.println(texto);
		return texto;
	}

}
