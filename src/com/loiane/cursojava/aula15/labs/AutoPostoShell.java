package com.loiane.cursojava.aula15.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AutoPostoShell {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner programa = new Scanner(System.in);
		
		String combustivel;
		double qtdCombustivel, desconto, litros, gasolina = 6.74, alcool = 4.74;
		
		System.out.println("Bem-Vindo ao Auto Posto da Shell Ltda");
		System.out.println("Valor da Gasolina: 6,74/L && Valor Álcool: 4,74/L");
		System.out.println("Frentista: Hoje está havendo uma promoção!");
		System.out.println("Frentista: Abastecendo Álcool até 20 Litros você ganha 3% de desconto e acima de 20 Litros 5% de desconto");
		System.out.println("Frentista: Abastecendo Gasolina até 20 Litros você ganha 4% de desconto e acima de 20 Litros 6% de desconto");
		System.out.println("Frentista: Qual combustivel o(a) Senhor(a) vai adquirir? ");
		combustivel = programa.nextLine();
		
		System.out.println("Frentista: Qual quantidade de Litros o(a) Senhor(a) vai colocar em seu carro?");
		litros = programa.nextDouble();
		
		
		
		
		if(combustivel.equalsIgnoreCase("G") || combustivel.equalsIgnoreCase("Gasolina") && litros <= 20) {
			
			
			qtdCombustivel = gasolina  * litros;
			desconto = qtdCombustivel * 4 / 100;
					
			System.out.println("Combustivel Escolhido: G - Gasolina");
			System.out.println("Quantidade de litragem adquirida: " + litros);
			System.out.println("Valor a ser pago: " + new DecimalFormat("##.00").format((qtdCombustivel)));
			System.out.println("Valor do desconto por Litro: " + new DecimalFormat("#0.00").format(gasolina * 4 / 100));
			System.out.println("Valor total do desconto: " + new DecimalFormat("##.00").format(desconto));
			System.out.println("Valor total a pagar: " + new DecimalFormat("##.00").format(qtdCombustivel - desconto));
			
		}else if (combustivel.equalsIgnoreCase("G") || combustivel.equalsIgnoreCase("Gasolina") && litros >= 20) {
			
			qtdCombustivel = gasolina  * litros;
			desconto = qtdCombustivel * 6 / 100;
					
			System.out.println("Combustivel Escolhido: G - Gasolina");
			System.out.println("Quantidade de litragem adquirida: " + litros);
			System.out.println("Valor a ser pago: " + new DecimalFormat("##.00").format((qtdCombustivel)));
			System.out.println("Valor do desconto por Litro: " + new DecimalFormat("#0.00").format(gasolina * 6 / 100));
			System.out.println("Valor total do desconto: " + new DecimalFormat("##.00").format(desconto));
			System.out.println("Valor total a pagar: " + new DecimalFormat("##.00").format(qtdCombustivel - desconto));
		}
		
		if(combustivel.equalsIgnoreCase("A") || combustivel.equalsIgnoreCase("Alcool") && litros <= 20) {
			
			
			qtdCombustivel = alcool  * litros;
			desconto = qtdCombustivel * 3 / 100;
					
			System.out.println("Combustivel Escolhido: A - Alcool");
			System.out.println("Quantidade de litragem adquirida: " + litros);
			System.out.println("Valor a ser pago: " + new DecimalFormat("##.00").format((qtdCombustivel)));
			System.out.println("Valor do desconto por Litro: " + new DecimalFormat("#0.00").format(alcool * 3 / 100));
			System.out.println("Valor total do desconto: " + new DecimalFormat("##.00").format(desconto));
			System.out.println("Valor total a pagar: " + new DecimalFormat("##.00").format(qtdCombustivel - desconto));
			
		}else if (combustivel.equalsIgnoreCase("A") || combustivel.equalsIgnoreCase("Alcool") && litros >= 20) {
			
			qtdCombustivel = alcool  * litros;
			desconto = qtdCombustivel * 5 / 100;
					
			System.out.println("Combustivel Escolhido: A - Alcool");
			System.out.println("Quantidade de litragem adquirida: " + litros);
			System.out.println("Valor a ser pago: " + new DecimalFormat("##.00").format((qtdCombustivel)));
			System.out.println("Valor do desconto por Litro: " + new DecimalFormat("#0.00").format(alcool * 5 / 100));
			System.out.println("Valor total do desconto: " + new DecimalFormat("##.00").format(desconto));
			System.out.println("Valor total a pagar: " + new DecimalFormat("##.00").format(qtdCombustivel - desconto));
		}
		
	}

}
