package app;

import entitys.Professor;

public class Application3 {

	public static void main(String[] args) {
		
		//(String nome, Integer idade, char sexo, Double salario, String formacao) 
		Professor p1 = new Professor("João", 51, 'F', 1200.0, "Matemática");
		
		System.out.println(p1);
		System.out.println("Ação: ");
		p1.ensinar();

	}

}
