package com.loiane.cursojava.aula43v2.labs.exer01;

import java.util.Calendar;

public class ContaPoupan�a extends ContaBancaria {
	
	private int diaRendimento;

	int getDiaRendimento() {
		return diaRendimento;
	}

	void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}

	@Override
	public String toString() {
		String s = "ContaPoupan�a [diaRendimento=" + diaRendimento + "]";
		s += super.toString();
		return s;
	}
	
	public boolean calcularNovoSaldo(double taxaRendimento) {
		Calendar hoje = Calendar.getInstance();
		
		if(diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)) {
			this.setSaldo(this.getSaldo() + (this.getSaldo() * taxaRendimento));
			return true;
		}
		return false;
	}

}
