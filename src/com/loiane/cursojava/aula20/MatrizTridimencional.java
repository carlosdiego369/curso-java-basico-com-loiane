package com.loiane.cursojava.aula20;

public class MatrizTridimencional {

	public static void main(String[] args) {

		int[][][] matrizTridimensional = new int[3][3][3];

		for (int i = 0; i < matrizTridimensional.length; i++) {

			for (int j = 0; j < matrizTridimensional[i].length; j++) {

				for (int k = 0; k < matrizTridimensional[i][j].length; k++) {
					System.out.println("i = " + i + " - " + "j = " + j + " - " + "k = " + k);
					matrizTridimensional[i][j][k] = i + j + k;
				}
			}
		}
		int soma = 0;
		int par = 0, impar = 0;
		for (int i = 0; i < matrizTridimensional.length; i++) {

			for (int j = 0; j < matrizTridimensional[i].length; j++) {

				for (int k = 0; k < matrizTridimensional[i][j].length; k++) {
					soma += matrizTridimensional[i][j][k];
					
					if(matrizTridimensional[i][j][k] % 2 == 0) {
						par += matrizTridimensional[i][j][k] ;
					}else {
						impar+= matrizTridimensional[i][j][k];
					}
				}
			}
		}
		System.out.println("Quantidade da soma: "+ soma);
		System.out.println("Quantidade de par: " + par);
		System.out.println("Quantidade de par: " + impar);
	}

}
