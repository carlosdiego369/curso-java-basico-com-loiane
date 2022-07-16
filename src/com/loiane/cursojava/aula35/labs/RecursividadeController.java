package com.loiane.cursojava.aula35.labs;

public class RecursividadeController {

	static public int recursividade(int num) {
		if (num == 1) {
			return 1;
		}
		return num + recursividade(num - 1);
	}
}
