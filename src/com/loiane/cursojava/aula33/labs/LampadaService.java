package com.loiane.cursojava.aula33.labs;

public class LampadaService {

	public static void main(String[] args) {

		LampadaController lampC = new LampadaController();
		
		lampC.ligarLampada();
		lampC.mostrarEstado();
		lampC.desligarLampada();
		lampC.mostrarEstado();
		lampC.mudarEstado();
		lampC.mostrarEstado();
		
	}

}
