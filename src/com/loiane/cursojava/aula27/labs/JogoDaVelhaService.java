package com.loiane.cursojava.aula27.labs;

import java.util.Scanner;

public class JogoDaVelhaService {

	public static void main(String[] args) {

		JogoDaVelhaController jgc = new JogoDaVelhaController(new Scanner(System.in));

		jgc.rollPlay();

	}

}
