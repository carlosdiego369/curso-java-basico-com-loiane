package com.loiane.cursojava.aula15.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FuncinariosTabajara {

	public static void main(String[] args) {

		System.out.println("Programa Organiza��es Tabajara: ");

		double salario, reajuste;

		@SuppressWarnings("resource")
		Scanner programa = new Scanner(System.in);

		System.out.println("Ol� funcion�rio, digite seu sal�rio: ");

		salario = programa.nextDouble();

		if (salario <= 280.00) {

			reajuste = salario * 20 / 100;
			System.out.println("Seu sal�rio era de: R$" + new DecimalFormat("##.00").format (salario));
			System.out.println("Voc� recebeu 20% de reajuste!");
			System.out.println("O reajuste �: R$" + new DecimalFormat("##.00").format (reajuste));
			System.out.println("Com o reajuste seu sal�rio �: R$" + new DecimalFormat("##.00").format (reajuste + salario));

		} else if (salario > 280.00 && salario <= 700.00) {
			reajuste = salario * 15 / 100;
			System.out.println("Seu sal�rio era de: R$" + new DecimalFormat("##.00").format (salario));
			System.out.println("Voc� recebeu 15% de reajuste!");
			System.out.println("O reajuste �: R$" + new DecimalFormat("##.00").format (reajuste));
			System.out.println("Com o reajuste seu sal�rio �: R$" + (new DecimalFormat("##.00").format (reajuste + salario)));

		} else if (salario > 700.00 && salario <= 1500.00) {

			reajuste = salario * 10 / 100;
			
			System.out.println("Seu sal�rio era de: R$" + new DecimalFormat("##.00").format (salario));
			System.out.println("Voc� recebeu 10% de reajuste!");
			System.out.println("O reajuste �: R$" + new DecimalFormat("##.00").format (reajuste));
			System.out.println("Com o reajuste seu sal�rio �: R$" + new DecimalFormat("##.00").format (reajuste + salario));
		}

	}

}
