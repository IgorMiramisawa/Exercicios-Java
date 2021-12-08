package br.com.generation.exercicios;

import java.util.Scanner;

public class DiasParaAnoMesDia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ano , mes , dia , idade  ;
		
		
		Scanner leia  = new Scanner(System.in);
		
		System.out.println("Digite sua idade em dias");
		idade = leia.nextInt();
		leia.close();
		ano = (idade / 365);
		mes = (idade % 365)/30;
		dia = (idade % 365)-(30*mes);
		
		System.out.println("Sua idade é " + ano  + " anos ," + mes +" mese e " + dia +" dia.");

	}

}
