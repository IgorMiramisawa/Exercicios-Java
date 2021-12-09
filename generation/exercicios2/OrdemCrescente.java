package br.com.generation.exercicios2;

import java.util.Arrays;
import java.util.Scanner;

public class OrdemCrescente {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Scanner leia = new Scanner(System.in);
		
		int valor1;
		int valor2 , valor3 ;
		System.out.println("Digite o primeiro valor");
		valor1 = leia.nextInt();
		System.out.println("Digite o segundo valor");
		valor2 = leia.nextInt();
		System.out.println("Digite o terceiro valor");
		valor3 = leia.nextInt();
		
		leia.close();
		
		if (valor1 >= valor2 && valor1 >= valor3 && valor3 >= valor2 ) {
			System.out.println("Os valores são " + valor2 + " , " + valor3 +" , " + valor1 + ".");
		} else if (valor1 >= valor2 && valor1 >= valor3 && valor2 >= valor3) {
			System.out.println("Os valores são " + valor3 + " , " + valor2 +" , " + valor1 + ".");
		} else if (valor2 >= valor1 && valor2 >= valor3 && valor1 >= valor3) {
			System.out.println("Os valores são " + valor3 + " . " + valor1 + " , " + valor2 + ".");
		} else if (valor2 >= valor1 && valor2 >= valor3 && valor3 >= valor1) {
			System.out.println("Os valores são " + valor1 + " , " + valor3 + " , " + valor2 + ".");
		}else if (valor3 >= valor1 && valor3 >= valor2 && valor1 >= valor2) {
			System.out.println("Os valores são " + valor2 + " , " + valor1 + " , " + valor3 + ".");
		} else if (valor3>= valor1 && valor3 >= valor2 && valor2 >= valor1){
			System.out.println("Os valores são " + valor1 + " , " + valor2 + " , " + valor3 + ".");
		}
		
		
	}

}
