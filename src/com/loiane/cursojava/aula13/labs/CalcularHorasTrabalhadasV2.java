package com.loiane.cursojava.aula13.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalcularHorasTrabalhadasV2 {

	public static void main(String[] args) {
		
		
		float salario;
		int horasTrabalhadas;
		
		float total;
		
		@SuppressWarnings("resource")
		Scanner servico = new Scanner(System.in);
		
		System.out.println("Sistema de Cálculo do valor tralhado v2!");
		
		System.out.println("Qual é o valor do seu salário?");
		
		salario = servico.nextFloat();
		
		System.out.println("Qual é de horas trabalhadas no semanal: ");
		horasTrabalhadas = servico.nextInt();
		
		total = salario / horasTrabalhadas;
				
		System.out.println("Seu dia de trabalho é equivalente R$: " + new DecimalFormat("0.##").format(total));
		
		System.out.println("Sua hora de trabalho é equivalente R$: " + new DecimalFormat("0.##").format(total/9));
		System.out.println("Sua semana de trabalho é equivalente R$: " + new DecimalFormat("0.##").format(total /9 *44));
		
	}

}
