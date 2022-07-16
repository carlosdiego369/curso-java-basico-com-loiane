package com.loiane.cursojava.aula34.labs;

public class ConversorDeTempoService {

	public static void main(String[] args) {
		
		ConversorDeTempoController.imprimir(ConversorDeTempoController.minutosParaSegundos(3600));
		
		ConversorDeTempoController.imprimir(ConversorDeTempoController.horasParaMinutos(3600));
		
		ConversorDeTempoController.imprimir(ConversorDeTempoController.diaParaHoras(3600));
		
		ConversorDeTempoController.imprimir(ConversorDeTempoController.semanasParaDias(3600));
		
		ConversorDeTempoController.imprimir(ConversorDeTempoController.mesParaDias(3600));
		
		ConversorDeTempoController.imprimir(ConversorDeTempoController.anoParaDias(3600));
		
	}

}
