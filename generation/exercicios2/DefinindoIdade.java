package br.com.generation.exercicios2;

import java.util.Scanner;

public class DefinindoIdade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Digite sua idade ");
		idade = leia.nextInt();
		
		leia.close();
		
		if (idade >=10 && idade <=14) {
			System.out.println("Infantil");
		}
		else if (idade >= 15 && idade <= 17) {
			System.out.println("Juvenil");
		}
		else if (idade >= 18 && idade <= 25) {
			System.out.println("Adulto");
		} else 
			System.out.println("Valor inserido n?o se encaixa a pesquisa");
		
	}

}
