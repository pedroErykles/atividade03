package entitys;

public class Bolsista extends Aluno{
	
	private String disciplina;

	public Bolsista(String nome, Integer idade, char sexo, String matricula, String curso, String disciplina) {
		super(nome, idade, sexo, matricula, curso);
		this.disciplina = disciplina;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	@Override
	public String toString() {
		return "Bolsista [disciplina=" + disciplina + "]";
	}
	
	public void pesquisar() {
		System.out.println("Pesquisar!");
	}
}
