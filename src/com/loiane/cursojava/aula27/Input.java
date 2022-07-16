package com.loiane.cursojava.aula27;

import java.util.Random;
import java.util.Scanner;

public class Input {

		
		Carro carro = new Carro();
		
		Scanner input;
		Random random;
		
		public Input (Scanner scanner, Random random) {
			this.input = scanner;
			this.random = random;
			
		}
		
		String input(String text) {
			return input.nextLine();
			

	}
		
		int generationKey(int num) {
			return random.nextInt(99999);
		}

}
