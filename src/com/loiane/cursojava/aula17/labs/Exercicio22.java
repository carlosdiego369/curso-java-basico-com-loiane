package com.loiane.cursojava.aula17.labs;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		Scanner chave = new Scanner(System.in);

		int cd;
		double valorCd, res = 0;

		System.out.println("Digite a quantidade de Cds: ");
		cd = chave.nextInt();

		for (int cont = 1; cont <= cd; cont++) {

			System.out.println("Digite o valor do " + cont + "�  CD");
			valorCd = chave.nextDouble();

			res += valorCd;
			if (cont == cd) {
				System.out.println("O valor total gasto na cole��o: R$" + new DecimalFormat("##.00").format(res));
				System.out.println("O valor m�dio gasto dos " + cd + " Cds da cole��o � : " + new DecimalFormat("##.00").format(res / cd));


			}
		}

	}

}
