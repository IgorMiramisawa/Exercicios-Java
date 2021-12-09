package br.com.generation.exercicios2;

import java.util.Scanner;

public class QualDeleseMaior {
	public static void main (String [] args) {
		Scanner leia = new Scanner(System.in);
		
		int contador , valor1 ,  maiorvalor = 0;
		contador = 0;
		while (contador < 3)  {
			System.out.println("Digite um valor");
			valor1 = leia.nextInt();
			contador++;
			if (valor1 > maiorvalor){
				maiorvalor = valor1;
			
			}
		
		}
		leia.close();	
		System.out.println("O maior valor inserido foi " + maiorvalor);
		
		
		
		
	}
}
