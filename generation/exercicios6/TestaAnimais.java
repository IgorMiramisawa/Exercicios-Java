package br.com.generation.exercicios6;

public class TestaAnimais {

	public static void main(String[] args) {
		
		Cavalo cavalo1 = new Cavalo();
		
		cavalo1.setNome("Morena");
		cavalo1.setIdade(15);
	
		System.out.println("Nome: " + cavalo1.getNome());
		System.out.println("Idade : " + cavalo1.getIdade());
		cavalo1.cavalocorrendo();
		cavalo1.somcavalo();
		
		
		 System.out.println("\n");
		 
		Preguica preguica1 = new Preguica();
		
		preguica1.setNome("Joana");
		preguica1.setIdade(15);
		
		System.out.println("Nome: " + 	preguica1.getNome());
		System.out.println("Idade : " + preguica1.getIdade());
		
		preguica1.preguicadormindo();
		preguica1.preguicaarvore();
		
		System.out.println("\n");
		Cachorro cachorro1 = new Cachorro();
		
		cachorro1.setNome("Jõao");
		
		cachorro1.setIdade(15);
		
		System.out.println("Nome: " + cachorro1.getNome());
		System.out.println("Idade : " + cachorro1.getIdade());
		
		cachorro1.cachorrolatindo();
		cachorro1.cachorrocorrendo();
		
		
	}

}
