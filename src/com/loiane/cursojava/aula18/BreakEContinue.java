package com.loiane.cursojava.aula18;

import java.util.Scanner;

public class BreakEContinue {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Entre com um numero");
		int num = input.nextInt();
		
		System.out.println("Entr com um limite");
		int max = input.nextInt();
		
		for(int i = num; i<= max;i++) {
			if(i % 7 == 0) {
				System.out.println("O valor de i ?: " + i);
				break;
			}
		}
		
	}

}
