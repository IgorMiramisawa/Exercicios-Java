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
			System.out.println("Coloque a op��o que representa seu sexo");
			sexo = leia.nextInt();
			System.out.println(
					"1 Se voc� � uma pessoa calma | 2 Se voc� � uma pessoa nervosa | 3 Se voc� � uma pessoa agressiva");
			System.out.println("Coloque a op��o que te representa");
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
		System.out.println("\nO n�mero de pessoas calmas � " + pessoascalma);
		System.out.println("\nO n�mero de mulheres nervosas � " + mulheresnervosa);
		System.out.println("\nO n�mero de homens agressivos � " + homensagressivo);
		System.out.println("\nO n�mero de outros calmos � " + outroscalmo);
		System.out.println("\nO n�mero de pessoas nervosas com mais de 40 anos � " + nervosasacima);
		System.out.println("\nO n�mero de pessoas calmas com menos de 18 anos � " + calmasabaixo);
	}

}
