package com.loiane.cursojava.aula34.labs;

public class ConversaoDeUnidadesDeAreaController {

	static private double pesQuadrados;
	static private double centimentrosQuadrados;
	static private double acres;

	public ConversaoDeUnidadesDeAreaController() {
	}

	// gets & sets
	public static double getPesQuadrados() {
		return pesQuadrados;
	}

	public static void setPesQuadrados(double pesQuadrados) {
		ConversaoDeUnidadesDeAreaController.pesQuadrados = pesQuadrados;
	}

	public static double getCentimentrosQuadrados() {
		return centimentrosQuadrados;
	}

	public static void setCentimentrosQuadrados(double centimentrosQuadrados) {
		ConversaoDeUnidadesDeAreaController.centimentrosQuadrados = centimentrosQuadrados;
	}

	public static double getAcres() {
		return acres;
	}

	public static void setAcres(double acres) {
		ConversaoDeUnidadesDeAreaController.acres = acres;
	}

	static double metrosParaPesQuadrados(double metrosQuadrados) {
		setPesQuadrados(metrosQuadrados *= 10.76);
		return getPesQuadrados();
	}

	static double pesParaCentimentrosQuadrados(double pesQuadrados) {
		setCentimentrosQuadrados(pesQuadrados *= 929);
		return getCentimentrosQuadrados();
	}

	static double milhasParaAcres(double milhas) {
		setAcres(milhas *= 640);
		return getAcres();
	}
	
	static double acresEmPesQuadrados(double acres) {
		setPesQuadrados(acres *= 43560);
		return getPesQuadrados();
	}

}
