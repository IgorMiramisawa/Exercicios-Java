package br.com.generation.collections;

public class LojaEstoque {
	
	private String nomeProduto;
	private int numeroProdutos;
	public LojaEstoque(String nomeProduto, int numeroProdutos) {
		super();
		this.nomeProduto = nomeProduto;
		this.numeroProdutos = numeroProdutos;
	}
	
	@Override
	public String toString() {
		return "\nNome do produto: " + nomeProduto +"|"+ "Numero de Produtos: " + numeroProdutos;
	}
	
	
	
}
