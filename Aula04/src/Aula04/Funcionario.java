package Aula04;

public class Funcionario extends Pessoa{
	private float salario;
	
	public Funcionario(String nome, String email, float salario) {
		super(nome, email); // linha OBRIGATÓRIA!!!!
		this.salario = salario;
	}
	
	public Funcionario(String nome, String email, Integer idade, float salario) {
		super(nome, email, idade); // linha OBRIGATÓRIA!!!!
		this.salario = salario;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "* Funcionario: \n"
				+ "Nome = "     + super.getNome()   + "\n"
				+ "E-mail = "   + super.getEmail()  + "\n"
				+ "Idade = "    + super.getIdade()  + "\n"
				+ "Salário = "  + salario;
	}
	
	
}
