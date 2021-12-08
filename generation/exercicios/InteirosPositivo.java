
package br.com.generation.exercicios;

import java.util.Scanner;

public class InteirosPositivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		
		int valorA = 0, valorB = 0 , valorC = 0 , valorR , valorS , valorD;
		
		System.out.print("Digite o valor A :");
		valorA = leia.nextInt();
		System.out.print("Digite o valor B :");
		valorB = leia.nextInt();
		System.out.print("Digite o valor C :");
		valorC = leia.nextInt();
		
		
		leia.close();
		
		if ((valorA >= 0 )&& (valorB >=0) && (valorC >= 0 ) ){
			
		valorR = (int) Math.pow((valorA + valorB), 2);
		
		valorS = (int) Math.pow((valorB + valorC), 2);
		
		valorD = (valorR + valorS)/2;
		
		System.out.println("O valor de D é :" + valorD);
		
		
		
		
			
		} else 
			System.out.println("Valor digitado incorreto");
		

	}

}
