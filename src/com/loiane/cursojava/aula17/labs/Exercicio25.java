package com.loiane.cursojava.aula17.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio25 {

	public static void main(String[] args) {

		Scanner chave = new Scanner(System.in);

		int produto = 1;
		double preco, dinheiro, troco, total = 0;

		System.out.println("**** Lojas Tabajaras ****");

		for (; produto > 0; ) {
			System.out.println("Digite o valor do " + produto + "º Produto: ");
			preco = chave.nextDouble();
			
			total += preco;
			produto++;

			if (preco == 0) {

				System.out.println("**** Informe o dinheiro que o cliente entregou: ****");
				dinheiro = chave.nextDouble();
				
				troco = dinheiro - total;
				
				System.out.println("Total: " + "R$ " + new DecimalFormat("##0.00").format(total));
				System.out.println("Dinheiro: " + "R$ " + new DecimalFormat("##0.00").format(dinheiro));
				System.out.println("Troco: " + "R$ " + new DecimalFormat("##0.00").format(troco));

				produto = 0;
			}
		}
	}
}