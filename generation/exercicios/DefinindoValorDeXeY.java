package br.com.generation.exercicios;

import java.util.Scanner;

public class DefinindoValorDeXeY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		double a,b,c,d,e,f,x,y ;
		
		System.out.println("Digite o valor de A");
		a = leia.nextDouble();
		System.out.println("Digite o valor de B");
		b = leia.nextDouble();
		System.out.println("Digite o valor de C");
		c = leia.nextDouble();
		System.out.println("Digite o valor de D");
		d = leia.nextDouble();
		System.out.println("Digite o valor de E");
		e = leia.nextDouble();
		System.out.println("Digite o valor de F");
		f = leia.nextDouble();
		
		leia.close();
		
		
		x = ((c * e) - (b * f)) / ((a * e) - (b * d));
		
		y = ((a * f) - (c * d)) / ((a * e) - (b * d));
		
		System.out.println("O valor de X é " + x + " , valor de Y é " + y);
		
		
		

	}

}
