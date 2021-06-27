package Aula04;

public class AppHerança {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa p = new Pessoa("Nome1", "email1@email.com");
		System.out.println(p.toString());
		System.out.println(" ");
		
		Funcionario f = new Funcionario("Nome2", "email2@email.com", 5000);
		System.out.println(f.toString());
		System.out.println(" ");
		
		f.setNome("Funcionario01");
		System.out.println(f.toString());
		System.out.println(" ");
		
		Funcionario f2 = new Funcionario("Nome3", "email3@email.com", 21, 5500);
		System.out.println(f2.toString());
		System.out.println(" ");
		
		Aluno a = new Aluno("Aluno1", "aluno1@email.com", 21,"AA2153MG", "03-03-2020", "Sistemas de Informação");
		System.out.println(a.toString());
		System.out.println(" ");
		
		Professor pf = new Professor("Professor1", "professor1@email.com", 44, 15000, "Mestre");
		System.out.println(pf.toString());
		System.out.println(" ");
	}

}
