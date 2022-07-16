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
		
		System.out.println("Sistema de C�lculo do valor tralhado v2!");
		
		System.out.println("Qual � o valor do seu sal�rio?");
		
		salario = servico.nextFloat();
		
		System.out.println("Qual � de horas trabalhadas no semanal: ");
		horasTrabalhadas = servico.nextInt();
		
		total = salario / horasTrabalhadas;
				
		System.out.println("Seu dia de trabalho � equivalente R$: " + new DecimalFormat("0.##").format(total));
		
		System.out.println("Sua hora de trabalho � equivalente R$: " + new DecimalFormat("0.##").format(total/9));
		System.out.println("Sua semana de trabalho � equivalente R$: " + new DecimalFormat("0.##").format(total /9 *44));
		
	}

}
