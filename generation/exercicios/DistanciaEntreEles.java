package br.com.generation.exercicios;

import java.util.Scanner;
import java.lang.Math;

public class DistanciaEntreEles {

	public static void main(String[] args) {	
	// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		
		double x1 ,y1 ,x2 , y2 , p1 , p2 , valorD;
		
		System.out.println("Digite o valor de x1:");
		x1 = leia.nextDouble();
		System.out.println("Digite o valor de y1:");
		y1 = leia.nextDouble();
		System.out.println("Digite o valor de x2:");
		x2 = leia.nextDouble();
		System.out.println("Digite o valor de y2:");
		y2 = leia.nextDouble();
		
		leia.close();
		p1 = Math.pow((x2 - x1), 2);
		p2 = Math.pow((y2 - y1), 2);
		
		valorD = Math.sqrt((p1 + p2));
		
		System.out.println("A diferença entre eles é " + valorD);

	}

}
