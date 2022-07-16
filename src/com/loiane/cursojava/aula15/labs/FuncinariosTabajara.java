package com.loiane.cursojava.aula15.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FuncinariosTabajara {

	public static void main(String[] args) {

		System.out.println("Programa Organizações Tabajara: ");

		double salario, reajuste;

		@SuppressWarnings("resource")
		Scanner programa = new Scanner(System.in);

		System.out.println("Olá funcionário, digite seu salário: ");

		salario = programa.nextDouble();

		if (salario <= 280.00) {

			reajuste = salario * 20 / 100;
			System.out.println("Seu salário era de: R$" + new DecimalFormat("##.00").format (salario));
			System.out.println("Você recebeu 20% de reajuste!");
			System.out.println("O reajuste é: R$" + new DecimalFormat("##.00").format (reajuste));
			System.out.println("Com o reajuste seu salário é: R$" + new DecimalFormat("##.00").format (reajuste + salario));

		} else if (salario > 280.00 && salario <= 700.00) {
			reajuste = salario * 15 / 100;
			System.out.println("Seu salário era de: R$" + new DecimalFormat("##.00").format (salario));
			System.out.println("Você recebeu 15% de reajuste!");
			System.out.println("O reajuste é: R$" + new DecimalFormat("##.00").format (reajuste));
			System.out.println("Com o reajuste seu salário é: R$" + (new DecimalFormat("##.00").format (reajuste + salario)));

		} else if (salario > 700.00 && salario <= 1500.00) {

			reajuste = salario * 10 / 100;
			
			System.out.println("Seu salário era de: R$" + new DecimalFormat("##.00").format (salario));
			System.out.println("Você recebeu 10% de reajuste!");
			System.out.println("O reajuste é: R$" + new DecimalFormat("##.00").format (reajuste));
			System.out.println("Com o reajuste seu salário é: R$" + new DecimalFormat("##.00").format (reajuste + salario));
		}

	}

}
