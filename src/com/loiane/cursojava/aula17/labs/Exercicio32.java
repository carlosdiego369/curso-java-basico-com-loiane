package com.loiane.cursojava.aula17.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio32 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("            CARDÁPIO DO REI DA GULA            "); 
        System.out.println("");
        System.out.println("Especificação    Cod    Preço");
        System.out.println("Cachorro Quente  100    R$1,20");
        System.out.println("Bauru Simples    101    R$1,30");
        System.out.println("Bauru com ovo    102    R$1,50");
        System.out.println("Hambúrguer       103    R$1,20");
        System.out.println("Cheeseburguer    104    R$1,30");
        System.out.println("Refrigerante     105    R$1,00");

		String saida = "";
		double total = 0;
		int fecharPedido, cod, qtdItem;
		boolean fechaPrograma = true;

		do {

			System.out.println("Deseja compra algo mais? (1 - Sim) ou (2 - Não)");
			fecharPedido = input.nextInt();

			if (fecharPedido == 1) {
				System.out.println("Digite o codigo do item: ");
				cod = input.nextInt();

				System.out.println("Digite a quantidade que deseja comprar: ");
				qtdItem = input.nextInt();

				switch (cod) {
				case (100):
					saida += "Cachorro Quente - R$1,20 * " + qtdItem;
					saida += " = " + (1.2 * qtdItem + "\n");
					total += 1.2 * qtdItem;
					break;

				case (101):
					saida += "Bauru Simples - R$1,30 * " + qtdItem;
					saida += " = " + (1.3 * qtdItem + "\n");
					total += 1.3 * qtdItem;
					break;

				case (102):
					saida += "Bauro com ovo - R$1,50 * " + qtdItem;
					saida += " = " + (1.5 * qtdItem + "\n");
					total += 1.5 * qtdItem;
					break;

				case (103):
					saida += "Hambúrguer - R$1,20 * " + qtdItem;
					saida += " = " + (1.2 * qtdItem + "\n");
					total += 1.2 * qtdItem;
					break;

				case (104):
					saida += "Cheeseburguer - R$1,30 * " + qtdItem * 1.3;
					saida += " = " + (1.3 * qtdItem + "\n");
					total += 1.3 * qtdItem;
					break;

				case (105):
					saida += "Refrigerante - R$1,00 * " + qtdItem * 1;
					saida += " = " + (1 * qtdItem + "\n");
					total += 1 * qtdItem;

				default:
					System.out.println("Codigo Inválido!");
				}
			} else if (fecharPedido == 2) {
				fechaPrograma = false;
				saida += "Total = " + total;

			} else {
				System.out.println("Código Inválido!");
				System.out.println("Registre seu pedido novamente!");
			}

		} while (fechaPrograma);
		System.out.println(saida);
	}
}
