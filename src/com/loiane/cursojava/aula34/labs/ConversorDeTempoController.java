package com.loiane.cursojava.aula34.labs;

public class ConversorDeTempoController {

	static int minutosParaSegundos(int segundos) {
		ConversorDeTempo.setSegundos(segundos *= 60);
		return ConversorDeTempo.getSegundos();
	}

	static int horasParaMinutos(int minutos) {
		ConversorDeTempo.setMinutos(minutos *= 60);
		return ConversorDeTempo.getMinutos();
	}

	static int diaParaHoras(int horas) {
		ConversorDeTempo.setHoras(horas *= 24);
		return ConversorDeTempo.getHoras();
	}
	
	static int semanasParaDias(int dias) {
		ConversorDeTempo.setDias(dias *= 7);
		return ConversorDeTempo.getDias();
	}
	
	static int mesParaDias(int dias) {
		ConversorDeTempo.setDias(dias *= 30);
		return ConversorDeTempo.getDias();
	}
	
	static int anoParaDias(int dias) {
		ConversorDeTempo.setDias(dias *= 365.25);
		return ConversorDeTempo.getDias();
	}
	
	static void imprimir(int num) {
		System.out.println(num);
	}

}
