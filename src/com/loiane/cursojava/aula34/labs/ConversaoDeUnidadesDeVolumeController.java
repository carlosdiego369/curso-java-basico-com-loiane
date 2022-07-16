package com.loiane.cursojava.aula34.labs;

public class ConversaoDeUnidadesDeVolumeController {
	
	static double litrosParaCmCubicos(double cmCubicos) {
		ConversaoDeVolumes.setCmCubicos(cmCubicos *= 1000);
		return ConversaoDeVolumes.getCmCubicos();
	}
	
	static double mCubicosParaLitros(double litros) {
		ConversaoDeVolumes.setLitros(litros *= 1000);
		return ConversaoDeVolumes.getLitros();
	}
	
	static double mCubicosParaPesCubicos(double pesCubicos) {
		ConversaoDeVolumes.setPesCubicos(pesCubicos *= 35.32);
		return ConversaoDeVolumes.getPesCubicos();
	}
	
	static double gAmericanoEmPolCubicas(double polCubicas) {
		ConversaoDeVolumes.setPolCubicas(polCubicas *= 231);
		return ConversaoDeVolumes.getPolCubicas();
	}
	
	static double gAmercianoEmLitros(double litros) {
		ConversaoDeVolumes.setLitros(litros *= 3785);
		return ConversaoDeVolumes.getLitros();
	}

}
