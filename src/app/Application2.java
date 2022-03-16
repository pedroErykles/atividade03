package app;

import entitys.Aluno;

public class Application2 {

	public static void main(String[] args) {
		
		//(String nome, Integer idade, char sexo, String matricula, String curso)
		Aluno a1 = new Aluno("Eduardo", 35, 'M', "23984", "Informática");
		
		System.out.println(a1);
		System.out.println("Ação: ");
		a1.estudar();

	}

}
