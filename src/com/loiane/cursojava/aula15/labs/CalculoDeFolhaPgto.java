package com.loiane.cursojava.aula15.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculoDeFolhaPgto {

	public static void main(String[] args) {

		System.out.println("Programa de Cálculo de Folha de Pagamento");
		System.out.println("Bem - Vindo, Sr.(a)");
		
		@SuppressWarnings("resource")
		Scanner programa = new Scanner(System.in);
		
		double salarioBruto, irrf, inss, fgts, sindicato, salarioLiquido, horaTrabalho, valorHora;
		
		System.out.println("Digite o valor da sua hora de trabalho: R$");
		valorHora = programa.nextDouble();
		
		System.out.println("Digite a quantidade de horas trabalhadas: ");
		horaTrabalho = programa.nextDouble();
		
		salarioBruto = horaTrabalho * valorHora;
		
		
		
		
		if (salarioBruto <= 900) {
			
			inss = salarioBruto * 10 / 100;
			fgts = salarioBruto * 11 / 100;
			sindicato = salarioBruto * 5 / 100;
			
			salarioLiquido = salarioBruto - inss;
			
			System.out.println("Salario Bruto é: R$" + new DecimalFormat("##.00").format(salarioBruto));
			
			System.out.println("Valor do INSS: R$" + new DecimalFormat("##.00").format(inss));
			System.out.println("Valor do FGTS: R$" + new DecimalFormat("##.00").format(fgts));
			System.out.println("Total de descontos: R$" + new DecimalFormat("##.00").format(inss));
			System.out.println("Deposito feito pela empresa para o sindicato: " + new DecimalFormat("##.00").format(sindicato));
			System.out.println("Obs.: O valor do sindicato não é descontado do contratado!");
			System.out.println("Valor do Salário Líquido: R$" + new DecimalFormat("##.00").format(salarioLiquido));
		
		}else if( salarioBruto > 900 && salarioBruto <= 1500) {
			
			
			irrf = salarioBruto * 5 / 100;
			inss = salarioBruto * 10 / 100;
			fgts = salarioBruto * 11 / 100;
			sindicato = salarioBruto * 5 / 100;
			
			salarioLiquido = salarioBruto - inss - irrf;
			
			System.out.println("Salario Bruto é: R$" + new DecimalFormat("##.00").format(salarioBruto));
			
			System.out.println("Valor do IRRF: R$" + new DecimalFormat("##.00").format(irrf));
			System.out.println("Valor do INSS: R$" + new DecimalFormat("##.00").format(inss));
			System.out.println("Valor do FGTS: R$" + new DecimalFormat("##.00").format(fgts));
			System.out.println("Total de descontos: R$" + new DecimalFormat("##.00").format(inss+irrf));
			System.out.println("Deposito feito pela empresa para o sindicato: " + new DecimalFormat("##.00").format(sindicato));
			System.out.println("Obs.: O valor do sindicato não é descontado do contratado!");
			System.out.println("Valor do Salário Líquido: R$" + new DecimalFormat("##.00").format(salarioLiquido));
		
		}else if(salarioBruto < 1500 && salarioBruto >= 2500) {
			
			irrf = salarioBruto * 10 / 100;
			inss = salarioBruto * 10 / 100;
			fgts = salarioBruto * 11 / 100;
			sindicato = salarioBruto * 5 / 100;
			
			salarioLiquido = salarioBruto - inss - irrf;
			
			System.out.println("Salario Bruto é: R$" + new DecimalFormat("##.00").format(salarioBruto));
			
			System.out.println("Valor do IRRF: R$" + new DecimalFormat("##.00").format(irrf));
			System.out.println("Valor do INSS: R$" + new DecimalFormat("##.00").format(inss));
			System.out.println("Valor do FGTS: R$" + new DecimalFormat("##.00").format(fgts));
			System.out.println("Total de descontos: R$" + new DecimalFormat("##.00").format(inss+irrf));
			System.out.println("Deposito feito pela empresa para o sindicato: " + new DecimalFormat("##.00").format(sindicato));
			System.out.println("Obs.: O valor do sindicato não é descontado do contratado!");
			System.out.println("Valor do salário Líquido: R$" + new DecimalFormat("##.00").format(salarioLiquido));
			
		}else if(salarioBruto >= 2500) {
			
			irrf = salarioBruto * 20 / 100;
			inss = salarioBruto * 10 / 100;
			fgts = salarioBruto * 11 / 100;
			sindicato = salarioBruto * 5 / 100;
			
			salarioLiquido = salarioBruto - inss - irrf;
			
			System.out.println("Salario Bruto é: R$" + new DecimalFormat("##.00").format(salarioBruto));
			
			System.out.println("Valor do IRRF: R$" + new DecimalFormat("##.00").format(irrf));
			System.out.println("Valor do INSS: R$" + new DecimalFormat("##.00").format(inss));
			System.out.println("Valor do FGTS: R$" + new DecimalFormat("##.00").format(fgts));
			System.out.println("Total de descontos: R$" + new DecimalFormat("##.00").format(inss+irrf));
			System.out.println("Deposito feito pela empresa para o sindicato: " + new DecimalFormat("##.00").format(sindicato));
			System.out.println("Obs.: O valor do sindicato não é descontado do contratado!");
			System.out.println("Valor do Salário Líquido: R$" + new DecimalFormat("##.00").format(salarioLiquido));
		}
		
	}

}
