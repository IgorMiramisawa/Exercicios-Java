package br.com.generation.exercicios;

import java.util.Scanner;

public class NotaAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		double nota1 , nota2 , nota3 , media;
		
		System.out.print("Digite a primeira nota:");
		nota1 = leia.nextDouble();
		System.out.print("Digte a segunda nota:");
		nota2 = leia.nextDouble();
		System.out.print("Digite a terceira nota:");
		nota3 = leia.nextDouble();
		
		leia.close();
		
		media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5))/10;
		
		System.out.println("A média do aluno é : " + media);
		
		
		
	}

}
