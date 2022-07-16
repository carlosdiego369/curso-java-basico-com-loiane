package com.loiane.cursojava.aula17.labs;

public class Exercicio04 {

	public static void main(String[] args) {

		int txPopulacaoA = 80000,  txAnualA = 3, paisA, ano = 0;
		double txPopulacaoB = 200000, paisB, txAnualB = 1.5;
		
		
		
		paisA = txPopulacaoA / 100 * txAnualA;
		paisB = txPopulacaoB /100 * txAnualB;
		
		System.out.println(paisA);
		System.out.println(paisB);
		
		while(txPopulacaoA <= txPopulacaoB) {
			paisA = txPopulacaoA / 100 * 3;	
			paisB = txPopulacaoB / 100 * 1.5;
			
			txPopulacaoA = txPopulacaoA + paisA;
			txPopulacaoB = txPopulacaoB + paisB;
			System.out.println("Pais A: " + txPopulacaoA);
			System.out.println("Pais B: " + txPopulacaoB);
			System.out.println("Anos: " + ano);
			
			ano++;
		}
		
		
		
	}

}
