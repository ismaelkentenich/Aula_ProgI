package Aula04;

public class Aluno extends Pessoa{
	//Argumentos
	private String matricula;
	private String dataMatricula;
	private String curso;
	
	//Construtor
	public Aluno(String nome, String email, Integer idade, String matricula, String dataMatricula, String curso) {
		super(nome, email, idade); // linha OBRIGATÓRIA!!!!
		this.matricula = matricula;
		this.dataMatricula = dataMatricula;
		this.curso = curso;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "* Aluno: \n"
				+ "Nome = "               + super.getNome()     + "\n"
				+ "E-mail = "             + super.getEmail()    + "\n"
				+ "Idade = "              + super.getIdade()    + "\n"
				+ "Matrícula = "          + this.matricula      + "\n"
				+ "Data da Matrícula = "  + this.dataMatricula  + "\n"
				+ "Curso = "              + this.curso;
	}
	
}
