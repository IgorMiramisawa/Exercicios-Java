package br.com.generation.exercicios;

import java.util.Scanner;

public class ValorDoCarroNovo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double valorfabrica , valordistribuidor , valorcliente ;
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira o valor de custo da fábrica ");
		valorfabrica = leia.nextDouble();
		
		leia.close();
		valordistribuidor = valorfabrica + (valorfabrica * 0.28) ; 
		valorcliente = valordistribuidor + (valordistribuidor * 0.45 ) ;
		
		System.out.println("O valor para o consumidor será de R$ " + valorcliente);
		
		

	}

}
