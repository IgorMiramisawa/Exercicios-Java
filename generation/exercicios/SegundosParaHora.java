package br.com.generation.exercicios;

import java.util.Scanner;

public class SegundosParaHora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		int segundos , minuto , hora , segundosmostrar , minutomostrar;
		
		System.out.print("Digite os segundos : ");
		segundos = leia.nextInt();
		leia.close();
		hora = segundos / 3600 ;
	
		minuto = (segundos % 60)/60;
		
		minutomostrar = ((segundos % 3600) - (60 * minuto))/60;
	
		
		
	
		
		segundosmostrar = (segundos % 60 );
		
		System.out.println("Segundos calculados foram : " + hora +" hora e " + minutomostrar + " minuto e " + segundosmostrar + " segundos.");
		
		
		

	}

}
