package br.com.generation.exercicios2;

import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner (System.in);
		
		double valor ;
		
		System.out.println("Digite um valor ");
		valor = leia.nextDouble();
		
		leia.close();
		
		if ( valor % 2 != 0) {
			valor = Math.pow(valor, 2);
			System.out.println("O valor inserido elevado ao quadrado é " + valor);
		}else {
			valor = Math.sqrt(valor);
			
			
			System.out.println("A raiz quadrada do valor é " + valor);
		}
			
		
	}

}
