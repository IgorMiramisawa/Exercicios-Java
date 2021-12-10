package br.com.generation.exercicios3;

import java.util.Scanner;

public class PareseImpares {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int contador, valor, par = 0, impar = 0;

		for (contador = 0; contador < 10; contador++) {
			System.out.println("Digite o valor");
			valor = leia.nextInt();

			leia.close();
			if (valor % 2 == 0) {
				par++;
			} else
				impar++;

		}
		System.out.println("O valor de números pares foi " + par);
		System.out.println("O valor de números impares foi " + impar);

	}

}
