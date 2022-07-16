package com.loiane.cursojava.aula13.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalcularImpostos {

	public static void main(String[] args) {

		double valorHora, horaTrabalho, totalSalario, impostoRenda, inss, sindicato, salarioLiquido;
		
		@SuppressWarnings("resource")
		Scanner descontos = new Scanner(System.in);
		
		System.out.println("**** Sistema de C�culo de Impostos sobre o sal�rio ****");
		
		System.out.println("Digite o valor Hora/Trabalho: ");
		
		valorHora = descontos.nextDouble();
		
		System.out.println("Digite a quantidade de horas trabalhadas no m�s: ");
		
		horaTrabalho = descontos.nextDouble();
		
		totalSalario = valorHora * horaTrabalho;
		
				
		impostoRenda = totalSalario * 11 /100;
		
		
		System.out.println("O sal�rio bruto refer�nte ao m� �: R$" + new DecimalFormat("0.##").format(totalSalario));
		
		
		System.out.println("O valor do imposto de Renda Descontado �: R$" + new DecimalFormat("0.##").format(impostoRenda));
		
		inss = totalSalario * 8 / 100;
		
		System.out.println("O valor do INSS Descontado �: R$" + new DecimalFormat("0.##").format(inss));
		
		sindicato = totalSalario * 5 / 100;
		
		System.out.println("O valor do Sindicato Descontado �: R$" + new DecimalFormat("0.##").format(sindicato));
		
		salarioLiquido = totalSalario - impostoRenda - inss - sindicato;
		
		System.out.println("O valor liquido a receber �: R$:" + new DecimalFormat("0.##").format(salarioLiquido));
		
		
		
		
		
	}

}
