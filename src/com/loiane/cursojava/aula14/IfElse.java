package com.loiane.cursojava.aula14;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		
		System.out.println("Sistema de verifica��o de idade: ");
		
		int valorItem;
		
		@SuppressWarnings("resource")
		Scanner programa = new Scanner(System.in);
		
		/*System.out.println("Digite sua idade: ");
		
		idade = programa.nextInt();
		
		if (idade >= 18) {
			
			System.out.println("Voc� � maior de idade!");
			
		}else {
			System.out.println("Voc� � menor de idade!");
		}*/
		
		
		System.out.println("Entre com o valor do produto: ");
		
		
		valorItem = programa.nextInt();
		
		if (valorItem <= 10) {
			System.out.println("Est� barato, pode comprar!");
			
		}else if(valorItem > 10 && valorItem < 15){
			System.out.println("Voc� pode pedir um desconto!");
						
		}else if (valorItem > 15 && valorItem < 17) {
			System.out.println("Voc� pode pesquisar mais!");
		}else{
			System.out.println("Est� muito caro!");
		}
		
		
		
	}

}
