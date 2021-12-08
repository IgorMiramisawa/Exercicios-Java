package br.com.generation.exercicios;

import java.time.Year;
import java.util.Scanner;

public class idade_em_dias {
	public static void main (String [] args){
	
		Scanner leia = new Scanner(System.in);
		
		
		int ano, mes ,mesconta, dia ,diaconta, idade ;
		
		
		System.out.print("Digite sua idade , Anos  , Mes e Dia : ");
		ano = leia.nextInt();
		mes = leia.nextInt();
		dia = leia.nextInt();
		
		idade = ano * 365;
		
		mesconta = (mes * 30 );
		
		
		
		
		
		System.out.println("A sua idade em dias é  : " + (idade + mesconta + dia) );

	
	
	

	
			
	
	
	}
	

		
	

}
