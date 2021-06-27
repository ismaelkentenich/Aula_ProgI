package Aula04;

public class Professor extends Funcionario{
	// Argumentos
	private String titulo;
	
	//Construtor
	public Professor(String nome, String email, Integer idade, float salario, String titulo){
		super(nome, email, idade, salario);
		this.titulo = titulo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		return "*Professor: \n" 
				+ "Nome = "    + super.getNome()    + "\n"
				+ "E-mail = "  + super.getEmail()   + "\n"
				+ "Idade = "   + super.getIdade()   + "\n"
				+ "Salário = " + super.getSalario() + "\n"
				+ "Título = "  + this.titulo;
	}
	

}
