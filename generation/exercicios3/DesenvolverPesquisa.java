package br.com.generation.exercicios3;

import java.util.Scanner;

public class DesenvolverPesquisa {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int contador = 0, idade, sexo, opcao, pessoascalma = 0, mulheresnervosa = 0, homensagressivo = 0,
				outroscalmo = 0, nervosasacima = 0, calmasabaixo = 0;

		while (contador < 8) {
			System.out.println("Digite sua idade");
			idade = leia.nextInt();
			System.out.println("(1-feminino / 2-masculino / 3-Outros),");
			System.out.println("Coloque a opção que representa seu sexo");
			sexo = leia.nextInt();
			System.out.println(
					"1 Se você é uma pessoa calma | 2 Se você é uma pessoa nervosa | 3 Se você é uma pessoa agressiva");
			System.out.println("Coloque a opção que te representa");
			opcao = leia.nextInt();
			contador++;

			if (opcao == 1) {
				pessoascalma++;
			}
			if (sexo == 1 && opcao == 2) {
				mulheresnervosa++;
			}
			if (sexo == 2 && opcao == 3) {
				homensagressivo++;
			}
			if (sexo == 3 && opcao == 1) {
				outroscalmo++;
			}
			if (idade > 40 && opcao == 2) {
				nervosasacima++;
			}
			if (idade < 18 && opcao == 1) {
				calmasabaixo++;
			}

		}
		leia.close();
		System.out.println("\nO número de pessoas calmas é " + pessoascalma);
		System.out.println("\nO número de mulheres nervosas é " + mulheresnervosa);
		System.out.println("\nO número de homens agressivos é " + homensagressivo);
		System.out.println("\nO número de outros calmos é " + outroscalmo);
		System.out.println("\nO número de pessoas nervosas com mais de 40 anos é " + nervosasacima);
		System.out.println("\nO número de pessoas calmas com menos de 18 anos é " + calmasabaixo);
	}

}
