package com.loiane.cursojava.aula13.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalcularImpostos {

	public static void main(String[] args) {

		double valorHora, horaTrabalho, totalSalario, impostoRenda, inss, sindicato, salarioLiquido;
		
		@SuppressWarnings("resource")
		Scanner descontos = new Scanner(System.in);
		
		System.out.println("**** Sistema de Cáculo de Impostos sobre o salário ****");
		
		System.out.println("Digite o valor Hora/Trabalho: ");
		
		valorHora = descontos.nextDouble();
		
		System.out.println("Digite a quantidade de horas trabalhadas no mês: ");
		
		horaTrabalho = descontos.nextDouble();
		
		totalSalario = valorHora * horaTrabalho;
		
				
		impostoRenda = totalSalario * 11 /100;
		
		
		System.out.println("O salário bruto referênte ao mê é: R$" + new DecimalFormat("0.##").format(totalSalario));
		
		
		System.out.println("O valor do imposto de Renda Descontado é: R$" + new DecimalFormat("0.##").format(impostoRenda));
		
		inss = totalSalario * 8 / 100;
		
		System.out.println("O valor do INSS Descontado é: R$" + new DecimalFormat("0.##").format(inss));
		
		sindicato = totalSalario * 5 / 100;
		
		System.out.println("O valor do Sindicato Descontado é: R$" + new DecimalFormat("0.##").format(sindicato));
		
		salarioLiquido = totalSalario - impostoRenda - inss - sindicato;
		
		System.out.println("O valor liquido a receber é: R$:" + new DecimalFormat("0.##").format(salarioLiquido));
		
		
		
		
		
	}

}
