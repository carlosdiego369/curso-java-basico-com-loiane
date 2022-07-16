package com.loiane.cursojava.aula34.labs;

public class ConversaoDeVolumesService {
	
	static void imprimir(double num) {
		System.out.println(num);
	}

	public static void main(String[] args) {

		imprimir(ConversaoDeUnidadesDeVolumeController.litrosParaCmCubicos(20));
		
		imprimir(ConversaoDeUnidadesDeVolumeController.mCubicosParaLitros(20));
		
		imprimir(ConversaoDeUnidadesDeVolumeController.mCubicosParaPesCubicos(20));
		
		imprimir(ConversaoDeUnidadesDeVolumeController.gAmericanoEmPolCubicas(20));
		
		imprimir(ConversaoDeUnidadesDeVolumeController.gAmercianoEmLitros(20));
		
	}

}
