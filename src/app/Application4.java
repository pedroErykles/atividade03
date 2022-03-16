package app;

import entitys.Bolsista;

public class Application4 {

	public static void main(String[] args) {
		//(String nome, Integer idade, char sexo, String matricula, String curso, String disciplina)
		Bolsista b1 = new Bolsista("Juliana", 24, 'F', "78473", "Ciências Humanas", "História");
		
		System.out.println(b1);
		System.out.println("Ação: ");
		b1.pesquisar();
	}

}
