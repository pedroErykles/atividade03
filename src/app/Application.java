package app;

import entitys.Pessoa;

public class Application {

	public static void main(String[] args) {
		
		
		Pessoa p1 = new Pessoa("Pedro", 21, 'M');
		
		
		System.out.println("Digite seu nome: ");
		
		
		System.out.println(p1);
		System.out.println("Ação: ");
		p1.comer();

		
		

	}

}
