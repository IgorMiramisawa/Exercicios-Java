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
		
		System.out.println("**********   Ol� voc� est� no campo de avalia��o   *************");
		
		System.out.println("Voc� trabalhou na empresa?");
		
		System.out.println("1 - Sim");
		System.out.println("2 - N�o");
		
		System.out.print("Insira a op��o :");
		empresa = leia.nextInt();
		while(empresa != 1 && empresa != 2) {
			System.out.println("Insira a op��o :");
			empresa = leia.nextInt();			
		}
		if (empresa == 1) {
			System.out.print("Nome da empresa trabalhada: ");
			empresatrabalhada = leia.next();
			System.out.print("Quanto tempo trabalhou no local: ");
			tempotrabalhado = leia.next();
		}
		
		System.out.println("Essa experi�ncia � sua ?");
		System.out.println("1 - Sim");
		System.out.println("2 - N�o");
		
		System.out.print("Insira a op��o :");
		experiencia = leia.next();
		while(!experiencia.equals("1") && !experiencia.equals("2")) {
			System.out.print("Insira a op��o :");
			experiencia = leia.next(); 
			}
		experiencia = "A experi�ncia � da pr�pria pessoa que est� fazendo avalia��o";
		
		if(experiencia.equals("2")) {
			experiencia = "";
			System.out.println("� de alguem que voc� conhece ?");
			System.out.println("1 - Sim");
			System.out.println("2 - N�o");
			System.out.print("Insira a op��o :");
			experienciadeoutra = leia.next();
			while(!experienciadeoutra.equals("1") && !experienciadeoutra.equals("2")) {
				System.out.print("Insira a op��o :");
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
		System.out.println("2 - N�o");
		System.out.print("Insira a op��o :");
		banheiro = leia.next();
		while(!banheiro.equals("1") && !banheiro.equals("2")) {
			System.out.println("Insira a op��o :");
			banheiro = leia.next();			
		}
		if(banheiro.equals("1")) {
			banheiro = "Possui banheiro";
		} else {
			banheiro = "N�o possui banheiro";
		}
		
		
		System.out.println("A empresa faz palestra ou educa seus funcionarios sobre inclus�o?");
		System.out.println("1 - Sim");
		System.out.println("2 - N�o");
		System.out.print("Insira a op��o :");
		palestra = leia.next();
		while(!palestra.equals("1") && !palestra.equals("2")) {
			System.out.print("Insira a op��o :");
			palestra = leia.next();
		}
		if(palestra.equals("1")) {
			palestra = "A empresa � inclusiva";
		} else {
			palestra = "A empresa n�o � inclusiva";
		}
		
		System.out.println("O local possui acessibilidade para pessoas com defici�ncias "
				+ " f�sicas de mobilidade? rampa? elevador? corrim�o, acesso a todos os locais (incluindo banheiro) com cadeiras de rodas?");
		
		System.out.println("1 - Sim");
		System.out.println("2 - N�o");
		System.out.print("Insira a op��o :");
		acessibilidade = leia.next();
		while(!acessibilidade.equals("1") && !acessibilidade.equals("2")) {
			System.out.print("Insira a op��o :");
			acessibilidade = leia.next();
		}
		if(acessibilidade.equals("1")) {
			acessibilidade = "Empresa � acess�vel a todos";
		} 
		else {
			acessibilidade = "Empresa n�o � acess�vel";
		}
		
		System.out.println("O local possui acessibilidade para pessoas com defici�ncia visual?");
		
		System.out.println("1 - Sim");
		System.out.println("2 - N�o");
		System.out.print("Insira a op��o :");
		inclusivavisual = leia.next();
		while(!inclusivavisual.equals("1") && !inclusivavisual.equals("2")) {
			System.out.print("Insira a op��o :");
			inclusivavisual = leia.next();
		}
		if(inclusivavisual.equals("1")) {
			inclusivavisual = "Empresa tem facil acesso a pessoas com defici�ncia visual";
		} 
		else {
			inclusivavisual = "Empresa tem dif�cil acesso a pessoas com defici�ncia visual";
		}
		
		System.out.println("Possui acessibilidade para pessoas com defici�ncia intelectual?");
		
		System.out.println("1 - Sim");
		System.out.println("2 - N�o");
		System.out.print("Insira a op��o :");
		inclusivaintelectual = leia.next();
		while(!inclusivaintelectual.equals("1") && !inclusivaintelectual.equals("2")) {
			System.out.print("Insira a op��o :");
			inclusivaintelectual = leia.next();
		}
		if(inclusivaintelectual.equals("1")) {
			inclusivaintelectual = "Empresa tem facil acesso a pessoas com defici�ncia Intelectual";
		} 
		else {
			inclusivaintelectual = "Empresa tem dif�cil acesso a pessoas com defici�ncia Intelectual";
		}
		
		
		System.out.println("Possui acessibilidade para pessoas com defici�ncia auditiva?");
		
		System.out.println("1 - Sim");
		System.out.println("2 - N�o");
		System.out.print("Insira a op��o :");
		inclusivaauditiva = leia.next();
		while(!inclusivaauditiva.equals("1") && !inclusivaauditiva.equals("2")) {
			System.out.print("Insira a op��o :");
			inclusivaauditiva = leia.next();
		}
		if(inclusivaauditiva.equals("1")) {
			inclusivaauditiva = "Empresa tem facil acesso a pessoas com defici�ncia auditiva";
		} 
		else {
			inclusivaauditiva = "Empresa tem dif�cil acesso a pessoas com defici�ncia auditiva";
		}
		
		
		System.out.println("Possui acessibilidade para pessoas com defici�ncia f�sica?");
		
		System.out.println("1 - Sim");
		System.out.println("2 - N�o");
		System.out.print("Insira a op��o :");
		inclusivafisica = leia.next();
		while(!inclusivafisica.equals("1") && !inclusivafisica.equals("2")) {
			System.out.print("Insira a op��o :");
			inclusivafisica = leia.next();
		}
		if(inclusivafisica.equals("1")) {
			inclusivafisica = "Empresa tem facil acesso a pessoas com defici�ncia auditiva";
		} 
		else {
			inclusivafisica = "Empresa tem dif�cil acesso a pessoas com defici�ncia auditiva";
		}
		
		System.out.println("Voc� sofreu algum tipo de ass�dio?");
		
		System.out.println("1 - Sim");
		System.out.println("2 - N�o");
		System.out.print("Insira a op��o :");
		assedio = leia.next();
		while(!assedio.equals("1") && !assedio.equals("2")) {
			System.out.print("Insira a op��o :");
			assedio = leia.next();
		}
		
		if(assedio.equals("1")) {
			System.out.println("Que tipo de ass�dio ?");
			assedio = leia.next();
			
		} else {
			assedio = "N�o sofreu ass�dio";
		}
		
		System.out.println("Voc� acha o ambiente inclusivo para pessoas LGBTQIA+?");
			
		System.out.println("1 - Sim");
		System.out.println("2 - N�o");
		System.out.print("Insira a op��o :");
		ambienteinclusivo = leia.next();
		while(!ambienteinclusivo.equals("1") && !ambienteinclusivo.equals("2")) {
			System.out.print("Insira a op��o :");
			ambienteinclusivo = leia.next(); 
		}
		if (ambienteinclusivo.equals("1")) {
			ambienteinclusivo = "Ambiente inclusivo" ;
		}	else
			ambienteinclusivo = "Ambiente n�o inclusivo";
	}	
	

}
