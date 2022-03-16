package entitys;

public class Professor extends Pessoa {
	
	private Double salario;
	private String formacao;
	
	public Professor(String nome, Integer idade, char sexo, Double salario, String formacao) {
		super(nome, idade, sexo);
		this.salario = salario;
		this.formacao = formacao;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	
	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}
	
	@Override
	public String toString() {
		return "Professor [salario=" + salario + ", formacao=" + formacao + "]";
	}

	public void ensinar() {
		System.out.println("Ensinar!");
	}

}


