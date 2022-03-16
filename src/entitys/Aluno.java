package entitys;

public class Aluno extends Pessoa{

	private String matricula;
	private String curso;
	public Aluno(String nome, Integer idade, char sexo, String matricula, String curso) {
		super(nome, idade, sexo);
		this.matricula = matricula;
		this.curso = curso;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	@Override
	public String toString() {
		return "Aluno [matricula=" + matricula + ", curso=" + curso + "]";
	}
	public void estudar() {
		System.out.println("Estudar!");
	}
}
