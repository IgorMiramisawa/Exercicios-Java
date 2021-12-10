package br.com.generation.exercicios2;

import java.util.Scanner;

public class QualDeleseMaior {
	public static void main (String [] args) {
		Scanner leia = new Scanner(System.in);
		
		double valor1, valor2 ,valor3 ;
		
		System.out.println("Digite o primeiro valor");
		valor1 = leia.nextInt();
		System.out.println("Digite o segundo valor");
		valor2 = leia.nextInt();
		System.out.println("Digite o terceiro valor");
		valor3 = leia.nextInt();
		
		leia.close();
		
		if (valor1 >= valor2 && valor1 >= valor3){
			System.out.println("O maior valor inserido foi o " + valor1);
		}else if (valor2 >= valor1 && valor2 >= valor3) {
			System.out.println("O maior valor inserido foi o " + valor2);
		}else 
			System.out.println("O maior valor inserido foi o " + valor3);
		
		
		
			
		
				
			
			}
		
		
		
		
		
		
	}

