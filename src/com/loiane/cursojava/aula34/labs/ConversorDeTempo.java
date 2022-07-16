package com.loiane.cursojava.aula34.labs;

public class ConversorDeTempo {

	static private int segundos;
	static private int minutos;
	static private int horas;
	static private int dias;

	public ConversorDeTempo() {
	}

	// get & set
	public static int getSegundos() {
		return segundos;
	}

	static public void setSegundos(int segundos) {
		ConversorDeTempo.segundos = segundos;
	}

	static public int getMinutos() {
		return minutos;
	}

	static public void setMinutos(int minutos) {
		ConversorDeTempo.minutos = minutos;
	}

	static public int getHoras() {
		return horas;
	}

	static void setHoras(int horas) {
		ConversorDeTempo.horas = horas;
	}

	static public int getDias() {
		return dias;
	}

	static public void setDias(int dias) {
		ConversorDeTempo.dias = dias;
	}
}
