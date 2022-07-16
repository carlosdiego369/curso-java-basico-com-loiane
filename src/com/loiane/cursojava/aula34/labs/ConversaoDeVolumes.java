package com.loiane.cursojava.aula34.labs;

public class ConversaoDeVolumes {
	
	static private double cmCubicos;
	static private double litros;
	static private double pesCubicos;
	static private double polCubicas;
	
	
	public ConversaoDeVolumes() {
		
	}
	static public double getCmCubicos() {
		return cmCubicos;
	}
	static public void setCmCubicos(double cmCubicos) {
		ConversaoDeVolumes.cmCubicos = cmCubicos;
	}
	static public double getLitros() {
		return litros;
	}
	static public void setLitros(double litros) {
		ConversaoDeVolumes.litros = litros;
	}
	static public double getPesCubicos() {
		return pesCubicos;
	}
	static public void setPesCubicos(double pesCubicos) {
		ConversaoDeVolumes.pesCubicos = pesCubicos;
	}
	static public double getPolCubicas() {
		return polCubicas;
	}
	static public void setPolCubicas(double polCubicas) {
		ConversaoDeVolumes.polCubicas = polCubicas;
	}
}
