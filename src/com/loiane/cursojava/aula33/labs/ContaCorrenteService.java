package com.loiane.cursojava.aula33.labs;

import java.util.Random;
import java.util.Scanner;

public class ContaCorrenteService {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente();
		ContaCorrenteController c = new ContaCorrenteController(new Scanner(System.in), new Random());

		c.showForm(cc);
		cc.setSaldo(c.verificadorSaldo(0));
		c.validarLimiteEspecial(0);

		boolean exit = false;
		while (!exit) {
			System.out.println("1 - Saque\n2 - Deposito\n3 - Extrato\n0 - Sair");
			int num = c.input.nextInt();

			switch (num) {
			case 1: {
				c.retirarDinheiro(num);
				c.mostrarSaldo();
				exit = false;
				break;
			}
			case 2: {
				c.depositarDinheiro(num);
				c.mostrarSaldo();
				exit = false;
				break;
			}
			case 3: {
				c.mostrarSaldo();
				exit = false;
				break;
			}
			case 0: {
				c.sairSistema();
				exit = true;
				break;
			}
			default:
				c.invalidarOpcao();
				exit = false;
			}
		}

	}

}
