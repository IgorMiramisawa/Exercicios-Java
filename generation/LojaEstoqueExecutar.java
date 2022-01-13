package br.com.generation.collections;

import java.util.ArrayList;


public class LojaEstoqueExecutar {

	public static void main(String[] args) {
		LojaEstoque l1 = new LojaEstoque("Tenis Nike", 20);
		LojaEstoque l2 = new LojaEstoque("Jaqueta Adidas", 60);
		LojaEstoque l3 = new LojaEstoque("Calça Puma", 30);
		LojaEstoque l4 = new LojaEstoque("Camisa Pulma", 30);
		LojaEstoque atualizar = new LojaEstoque("Camisa da new era", 30);
		ArrayList<LojaEstoque> Loja= new ArrayList<>();
		Loja.add(l1);
		Loja.add(l2);
		Loja.add(l3);
		Loja.add(l4);
		System.out.println(Loja);

		
		Loja.remove(0);
		System.out.println("Objeto removido: "+ Loja);
		Loja.set(2, atualizar);
		System.out.println("Era Puma virou new era: "+ Loja);
	}

}
