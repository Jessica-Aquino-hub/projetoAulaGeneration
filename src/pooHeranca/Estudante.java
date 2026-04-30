package pooHeranca;
//Classe Filha ou Classe Derivada de Pessoa

public class Estudante extends Pessoa { // modelo da receita ||extends é herdar
	//Atributos|| ingredientes
	private String matricula;
	private String curso;
    
	
	//metodo Construtor || Define previamente os valores em ordem.|| Batedeira
	public Estudante(String nome, int idade, String email, String matricula, String curso) {
		super(nome, idade, email); // Super representa a Classe Mãe | Método construtor da Classe Mãe
		this.matricula = matricula;
		this.curso = curso;
	}
	//metodo de acesso especial get e set


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
}
