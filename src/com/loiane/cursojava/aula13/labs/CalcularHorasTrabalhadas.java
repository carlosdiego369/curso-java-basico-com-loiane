package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class CalcularHorasTrabalhadas {

	public static void main(String[] args) {
		
		int ganhoHora;
		int horasTrabalhadas;
		
		int total;
		
		@SuppressWarnings("resource")
		Scanner servico = new Scanner(System.in);
		
		System.out.println("Sistema de Calculo do Valor Tralhado!");
		
		System.out.println("Qual � o valor que voc� ganha por hora?");
		
		ganhoHora = servico.nextInt();
		
		System.out.println("Qual � o total de horas trabalhadas no m�s ");
		horasTrabalhadas = servico.nextInt();
		
		total = ganhoHora * horasTrabalhadas;
				
		System.out.println("Seu sal�rio �: " + total);
		

	}

}
