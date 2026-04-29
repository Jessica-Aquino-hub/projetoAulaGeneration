package poo;
// Classe é o Molde; is
public class Carro { 
 //atributos
	private String marca, modelo_motor;
	private int rodas, portas; // só da para usar na class carro
	
	//Método Construtor
	public Carro(String marca, int rodas, int portas, String modelo_motor) { //pulic e nome da classe
		this.marca = marca; // This => Classe
		this.rodas = rodas;
		this.portas = portas;
		this.modelo_motor = modelo_motor;
	}
	
	//metodos de acesso/Especiais -(Get(pega)/Set(coloca/atualiza))
	public String getMarca(){
		return marca; //devolve o valor para o usuário
	}
	public void setMarca(String marca) { // acessa, atualiza mas sem o acesso do usuário
		this.marca = marca; // essa classe
		//Carro.marca = parametro marca
	}
	public String getModelo_motor() {
		return modelo_motor;
	}
	public void setModelo_motor(String modelo_motor) {
		this.modelo_motor = modelo_motor;
	}
	public int getRodas() {
		return rodas;
	}
	public void setRodas(int rodas) {
		this.rodas = rodas;
	}
	public int getPortas() {
		return portas;
	}
	public void setPortas(int portas) {
		this.portas = portas;
	}

	
	//metodos
	public void locomover() { //esse fica sem o static pq ele é um metódo próprio da class carro, tornando exclusivo a ela.
	System.out.println("Estou me locomovendo...");	
	}
	
	public String parar() {
		return "Estou parando";
	}
	
	}

