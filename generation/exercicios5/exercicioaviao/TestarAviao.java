package br.com.generation.exercicioaviao;

public class TestarAviao {

	public static void main(String[] args) {
		
		Aviao aviao = new Aviao();
		
		aviao.modelo = "Boeing 737";
		aviao.anofabricacao = 1967;
		aviao.velocidade = 0;
		
		aviao.decolar();
		aviao.pousar();

	}

}
