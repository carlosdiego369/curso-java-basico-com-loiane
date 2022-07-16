package com.loiane.cursojava.aula34.labs;

public class ConversaoDeUnidadesDeAreaService {
	
	static void imprimir(double num) {
		System.out.println(num);
	}

	public static void main(String[] args) {

		imprimir(ConversaoDeUnidadesDeAreaController.metrosParaPesQuadrados(10));
		
		imprimir(ConversaoDeUnidadesDeAreaController.pesParaCentimentrosQuadrados(10));
		
		imprimir(ConversaoDeUnidadesDeAreaController.milhasParaAcres(10));
		
		imprimir(ConversaoDeUnidadesDeAreaController.acresEmPesQuadrados(10));
	}

}
