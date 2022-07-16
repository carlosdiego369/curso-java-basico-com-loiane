package com.loiane.cursojava.aula17.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {
		Scanner chave = new Scanner(System.in);

		int paes;
		double res = 0, preco;
		System.out.println("Panificadora - Tabela de Pre�os");
		
		System.out.println("Digite a quantidade de p�es que vai adquirir: ");
		paes = chave.nextInt();
		
		System.out.println("Digite o pre�o do p�o");
		preco = chave.nextDouble();
		
		for (int cont = 1; cont <= 50; cont++) {
			while (paes > 50) {
				System.out.println(
						"Sr. Manoel disse: Na na ni na n�o minha filho(a), voc� pode comprar s� at� 50 p�es se n�o eu fico sem pra vender pros outros!");
				System.out.println("Digite novamente a quantidade de itens: ");
				paes = chave.nextInt();
			}
			res = paes * preco;

			System.out.println(cont + " - " + "R$ " + new DecimalFormat("##0.00").format((preco * cont)));

		}
		System.out.println("O valor total que o cliente vai pagar pelos paes:" + paes + " �" + " R$"
				+ new DecimalFormat("#0.00").format(res));
	}
}