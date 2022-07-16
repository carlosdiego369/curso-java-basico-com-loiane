package com.loiane.cursojava.aula33.labs;

public class LampadaController {

	Lampada lamp = new Lampada();

	public void ligarLampada() {
		lamp.setLigada(true);
	}

	public void desligarLampada() {
		lamp.setLigada(false);
	}

	public LampadaController() {
	}

	public void mostrarEstado() {
		if (lamp.isLigada()) {
			System.out.println("A lampada está ligada");
		} else {
			System.out.println("A lampada está desligada");
		}
	}

	public void mudarEstado() {
		if(lamp.isLigada()) {
			lamp.setLigada(false);
		}else {
			lamp.setLigada(true);
		}
	}
}
