package com.loiane.cursojava.aula17.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {

		Scanner chave = new Scanner(System.in);

		int item;
		double res = 0;
		System.out.println("Lojas Quase Dois - Tabela de Preços");
		System.out.println("Digite a quantidade de itens: ");
		item = chave.nextInt();

		for (int cont = 1; cont <= 50; cont++) {
			while(item > 50) {
				System.out.println("Sr. Manoel disse: Na na ni na não minha filho(a), você pode comprar só até 50 itens!");
				System.out.println("Digite novamente a quantidade de itens: ");
				item = chave.nextInt();
			}
			res = item * 1.99;

			System.out.println(cont + " - " + "R$ " + new DecimalFormat("##0.00").format((1.99 * cont)));

		}
		System.out.println("O valor total que o cliente vai pagar por:" + item + " Itens é" + " R$"
				+ new DecimalFormat("##.00").format(res));
	}

}
