package com.loiane.cursojava.aula24;

public class TesteLampada {

	public static void main(String[] args) {
		
		Lampada lampada = new Lampada();
		
		lampada.oid = 001;
		lampada.modelo = "Led";
		lampada.potencia = 220;
		lampada.garantiaMeses = 36;
		
		System.out.println(lampada.oid);
		System.out.println(lampada.modelo);
		System.out.println(lampada.potencia);
		System.out.println(lampada.garantiaMeses);

	}

}
