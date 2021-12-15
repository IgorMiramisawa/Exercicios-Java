package br.com.generation.projetojava;

import java.util.Scanner;

public class AvaliacaoEmpregado {
	
	
	
	static int empresa ;
	static String empresatrabalhada ;
	static String tempotrabalhado ;
	static String experiencia;
	static String experienciadeoutra;
	static String banheiro;
	static String palestra;
	static String acessibilidade;
	static String inclusivavisual;
	static String inclusivaintelectual;
	static String inclusivaauditiva;
	static String inclusivafisica;
	static String assedio;
	static String ambienteinclusivo;
	
	
	
	
	public static void avaliacaoentrada () {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("**********   Olá você está no campo de avaliação   *************");
		
		System.out.println("Você trabalhou na empresa?");
		
		System.out.println("1 - Sim");
		System.out.println("2 - Não");
		
		System.out.print("Insira a opção :");
		empresa = leia.nextInt();
		while(empresa != 1 && empresa != 2) {
			System.out.println("Insira a opção :");
			empresa = leia.nextInt();			
		}
		if (empresa == 1) {
			System.out.print("Nome da empresa trabalhada: ");
			empresatrabalhada = leia.next();
			System.out.print("Quanto tempo trabalhou no local: ");
			tempotrabalhado = leia.next();
		}
		
		System.out.println("Essa experiência é sua ?");
		System.out.println("1 - Sim");
		System.out.println("2 - Não");
		
		System.out.print("Insira a opção :");
		experiencia = leia.next();
		while(!experiencia.equals("1") && !experiencia.equals("2")) {
			System.out.print("Insira a opção :");
			experiencia = leia.next(); 
			}
		experiencia = "A experiência é da própria pessoa que está fazendo avaliação";
		
		if(experiencia.equals("2")) {
			experiencia = "";
			System.out.println("É de alguem que você conhece ?");
			System.out.println("1 - Sim");
			System.out.println("2 - Não");
			System.out.print("Insira a opção :");
			experienciadeoutra = leia.next();
			while(!experienciadeoutra.equals("1") && !experienciadeoutra.equals("2")) {
				System.out.print("Insira a opção :");
				experienciadeoutra = leia.next(); 
			}
			if (experienciadeoutra.equals("1")) {
				experienciadeoutra = "Pessoa conhecida";
				
			}else {
				experienciadeoutra = "Pessoa desconhecida";
				
			}
			
		}
		
		
		
		System.out.println("O local possui banheiro inclusivo?");
		
		System.out.println("1 - Sim");
		System.out.println("2 - Não");
		System.out.print("Insira a opção :");
		banheiro = leia.next();
		while(!banheiro.equals("1") && !banheiro.equals("2")) {
			System.out.println("Insira a opção :");
			banheiro = leia.next();			
		}
		if(banheiro.equals("1")) {
			banheiro = "Possui banheiro";
		} else {
			banheiro = "Não possui banheiro";
		}
		
		
		System.out.println("A empresa faz palestra ou educa seus funcionarios sobre inclusão?");
		System.out.println("1 - Sim");
		System.out.println("2 - Não");
		System.out.print("Insira a opção :");
		palestra = leia.next();
		while(!palestra.equals("1") && !palestra.equals("2")) {
			System.out.print("Insira a opção :");
			palestra = leia.next();
		}
		if(palestra.equals("1")) {
			palestra = "A empresa é inclusiva";
		} else {
			palestra = "A empresa não é inclusiva";
		}
		
		System.out.println("O local possui acessibilidade para pessoas com deficiências "
				+ " físicas de mobilidade? rampa? elevador? corrimão, acesso a todos os locais (incluindo banheiro) com cadeiras de rodas?");
		
		System.out.println("1 - Sim");
		System.out.println("2 - Não");
		System.out.print("Insira a opção :");
		acessibilidade = leia.next();
		while(!acessibilidade.equals("1") && !acessibilidade.equals("2")) {
			System.out.print("Insira a opção :");
			acessibilidade = leia.next();
		}
		if(acessibilidade.equals("1")) {
			acessibilidade = "Empresa é acessível a todos";
		} 
		else {
			acessibilidade = "Empresa não é acessível";
		}
		
		System.out.println("O local possui acessibilidade para pessoas com deficiência visual?");
		
		System.out.println("1 - Sim");
		System.out.println("2 - Não");
		System.out.print("Insira a opção :");
		inclusivavisual = leia.next();
		while(!inclusivavisual.equals("1") && !inclusivavisual.equals("2")) {
			System.out.print("Insira a opção :");
			inclusivavisual = leia.next();
		}
		if(inclusivavisual.equals("1")) {
			inclusivavisual = "Empresa tem facil acesso a pessoas com deficiência visual";
		} 
		else {
			inclusivavisual = "Empresa tem difícil acesso a pessoas com deficiência visual";
		}
		
		System.out.println("Possui acessibilidade para pessoas com deficiência intelectual?");
		
		System.out.println("1 - Sim");
		System.out.println("2 - Não");
		System.out.print("Insira a opção :");
		inclusivaintelectual = leia.next();
		while(!inclusivaintelectual.equals("1") && !inclusivaintelectual.equals("2")) {
			System.out.print("Insira a opção :");
			inclusivaintelectual = leia.next();
		}
		if(inclusivaintelectual.equals("1")) {
			inclusivaintelectual = "Empresa tem facil acesso a pessoas com deficiência Intelectual";
		} 
		else {
			inclusivaintelectual = "Empresa tem difícil acesso a pessoas com deficiência Intelectual";
		}
		
		
		System.out.println("Possui acessibilidade para pessoas com deficiência auditiva?");
		
		System.out.println("1 - Sim");
		System.out.println("2 - Não");
		System.out.print("Insira a opção :");
		inclusivaauditiva = leia.next();
		while(!inclusivaauditiva.equals("1") && !inclusivaauditiva.equals("2")) {
			System.out.print("Insira a opção :");
			inclusivaauditiva = leia.next();
		}
		if(inclusivaauditiva.equals("1")) {
			inclusivaauditiva = "Empresa tem facil acesso a pessoas com deficiência auditiva";
		} 
		else {
			inclusivaauditiva = "Empresa tem difícil acesso a pessoas com deficiência auditiva";
		}
		
		
		System.out.println("Possui acessibilidade para pessoas com deficiência física?");
		
		System.out.println("1 - Sim");
		System.out.println("2 - Não");
		System.out.print("Insira a opção :");
		inclusivafisica = leia.next();
		while(!inclusivafisica.equals("1") && !inclusivafisica.equals("2")) {
			System.out.print("Insira a opção :");
			inclusivafisica = leia.next();
		}
		if(inclusivafisica.equals("1")) {
			inclusivafisica = "Empresa tem facil acesso a pessoas com deficiência auditiva";
		} 
		else {
			inclusivafisica = "Empresa tem difícil acesso a pessoas com deficiência auditiva";
		}
		
		System.out.println("Você sofreu algum tipo de assédio?");
		
		System.out.println("1 - Sim");
		System.out.println("2 - Não");
		System.out.print("Insira a opção :");
		assedio = leia.next();
		while(!assedio.equals("1") && !assedio.equals("2")) {
			System.out.print("Insira a opção :");
			assedio = leia.next();
		}
		
		if(assedio.equals("1")) {
			System.out.println("Que tipo de assédio ?");
			assedio = leia.next();
			
		} else {
			assedio = "Não sofreu assédio";
		}
		
		System.out.println("Você acha o ambiente inclusivo para pessoas LGBTQIA+?");
			
		System.out.println("1 - Sim");
		System.out.println("2 - Não");
		System.out.print("Insira a opção :");
		ambienteinclusivo = leia.next();
		while(!ambienteinclusivo.equals("1") && !ambienteinclusivo.equals("2")) {
			System.out.print("Insira a opção :");
			ambienteinclusivo = leia.next(); 
		}
		if (ambienteinclusivo.equals("1")) {
			ambienteinclusivo = "Ambiente inclusivo" ;
		}	else
			ambienteinclusivo = "Ambiente não inclusivo";
	}	
	

}
