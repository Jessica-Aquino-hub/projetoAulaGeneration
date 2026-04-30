package pooHeranca;

//Atributos
public class Instrutor extends Pessoa { //extends Classe Mãe
	private String especialidade;

	//metodo Construtor
	public Instrutor(String nome, int idade, String email, String especialidade) {
		super(nome, idade, email); // Busca na Classe mãe os atributos nome, idade, email
		this.especialidade = especialidade;
	}

	//metodos de acesso especiais get e set
	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
		}
