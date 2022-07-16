package com.loiane.cursojava.aula17v2.labs;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class Exercicio25 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		boolean sair = false;
		int continuaCompra, qtdProduto;
		double preco, total = 0, valorPago, troco;
		String output;

		do {
			System.out.println("Deseja informar uma nova compra? 1 - S / 2 - N");
			continuaCompra = input.nextInt();

			if (continuaCompra == 1) {
				output = "Lojas Tabajara \n";
				System.out.println("Digite a quantidade de produtos da compra: ");
				qtdProduto = input.nextInt();

				for (int i = 1; i <= qtdProduto; i++) {
					System.out.println("Informe o preço dos produtos");
					preco = input.nextDouble();

					total += preco;
					output += "Produto " + i + ": R$ " + preco + "\n";

				}

				output += "Total: R$ " + total + "\n";

				System.out.println("Total: R$ " + total);

				System.out.println("Entre com o valor pago");
				valorPago = input.nextDouble();

				output += "Dinheiro: R$ " + valorPago + "\n";

				troco = total - valorPago;

				output += "Troco: R$ " + troco;

				System.out.println(output);

			} else {
				sair = true;
			}

		} while (!sair);

	}

}
