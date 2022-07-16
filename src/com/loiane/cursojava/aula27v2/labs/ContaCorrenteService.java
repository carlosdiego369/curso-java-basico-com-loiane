package com.loiane.cursojava.aula27v2.labs;

import java.util.Scanner;

public class ContaCorrenteService {

	public static void main(String[] args) {
		ContaCorrenteController cc = new ContaCorrenteController(new Scanner(System.in));
		
		cc.showForm();
		
		
	}

}
