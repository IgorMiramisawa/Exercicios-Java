package br.com.generation.ExerciciosJava05;

public class TestaCliente {
	public static void main (String [] args) {
		
		Cliente cliente = new Cliente();
		
		
		cliente.nome = "Igor Miramisawa";
		cliente.numerocelular = 999999999;
		cliente.email = "igor.miramisawa@Outlook.com";
		cliente.endereco = "Rua ......... " ;
		
		System.out.println(cliente.nome);
		System.out.println(cliente.numerocelular);
		System.out.println(cliente.email);
		System.out.println(cliente.endereco  + "\n\n");
		
		cliente.consulta();
		
		cliente.compra();
		
		
		
	}
}
