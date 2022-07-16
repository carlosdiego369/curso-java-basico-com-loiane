package com.loiane.cursojava.aula13.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalcularVelocidadeInternet {

	public static void main(String[] args) {

		
		double tamanhoArquivo, velocidadeInternet, tempo;
		
		
		
		System.out.println("Sistema Para Informar o Tempo aproximado de Download");
		
		
		@SuppressWarnings("resource")
		Scanner programa = new Scanner(System.in);
		
		System.out.println("Informe o tamanho do arquivo do download em MegaBytes");
		
		tamanhoArquivo = programa.nextDouble();
		
		
		System.out.println("Informe a velocidade do seu link de Internet: Ex.: 30Mbps");
		
		velocidadeInternet = programa.nextDouble();
		
		tempo = tamanhoArquivo / velocidadeInternet;
		
		System.out.println("Tempo do estimado do donwload é equivalente: " +  new DecimalFormat("0.#").format(tempo) + " Minutos");
		
		
	}

}
