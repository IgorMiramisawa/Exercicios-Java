package br.com.generation.exercicios3;

import java.util.Scanner;

public class SolicitarIdadeMenos21Mais50 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int idade, contador = 2, menoridade = 0, maioridade = 0;

		System.out.println("Digite Idade");
		idade = leia.nextInt();

		while (idade != -99) {
			System.out.println("Digite a " + contador + "º Idade");
			idade = leia.nextInt();
			contador++;
			if (idade < 21 && idade > 0) {
				menoridade++;
			} else if (idade > 50) {
				maioridade++;

			}
		}
		leia.close();
		System.out.println();
		System.out.println("O numero de pessoas com menos de 21 Anos é " + menoridade);
		System.out.println("O numero de pessoas com mais de 50 Anos é " + maioridade);

	}

}
