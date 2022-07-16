package com.loiane.cursojava.aula27v3.labs;

import java.util.Scanner;

public class JogoDaVelhaService {

	public static void main(String[] args) {

		JogoDaVelhaController jgC = new JogoDaVelhaController(new Scanner(System.in));
		
		jgC.rollPlayer();
	}

}
