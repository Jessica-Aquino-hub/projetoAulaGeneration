package pooPolimorfismo;

public class TriAtleta extends Pessoa implements iCiclista{ //implements adciona a lógica/métodos 
	int competicoes;

	public TriAtleta(String nome, int idade, int competicoes) {// assinatura
		super(nome, idade); // Atributos da superClasse || metodos Construtor || métodos
		this.competicoes = competicoes;
	}

	public TriAtleta(String nome, int idade) {// assinatura
		super(nome, idade); // Atributos da superClasse || metodos Construtor || métodos
	}
	
	
	public int getCompeticoes() { 
		return competicoes;
	}

	public void setCompeticoes(int competicoes) {
		this.competicoes = competicoes;
	}
	
	public void competicoesConcluidas() {
		System.out.println("Competições Concluídas: " + this.competicoes);
	}
	
	//polimorfidmo de Sobrecarga (Sobrecarga de método) || /quantidade de parametros diferentes
	public void competicoesConcluidas(int numero) { 
		System.out.println("Competições Concluídas: " + numero);
	}
	
	//Polimorfismo de Sobrescrita (Sobrescrita de método)
	public void visualizar() {
		super.visualizar();
		System.out.println("Competições Concluídas: " + this.competicoes);
	}
	
	//Métodos Implementados das Interfaces
	@Override //Anotação - Etiqueta de Dado/Informação
	public String aquecer() {
		return "Estou me aquecendo!";
	}
	public void pedalar() {
		System.out.println("Estou pedalando :D!");
	}
}
