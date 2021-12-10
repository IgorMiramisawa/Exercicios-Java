package br.com.generation.exercicios3;

public class MostrarResto5 {

	public static void main(String[] args) {

		for (int numero = 1000; numero <= 1999; numero++) {
			if (numero % 11 == 5) {
				System.out.println(numero);
			}
		}

	}

}
