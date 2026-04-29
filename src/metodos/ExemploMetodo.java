package metodos;

import metodoExterno.ExemploMetodoExterno;

public class ExemploMetodo {

	public static void main(String[] args) {
		
		int resultado = somar(2,5); //resultado numerico
		System.out.println("O primeiro resultado: "+ resultado);
		System.out.println("O segundo resultado: "+ somar(4,8));
		
		mensagem();
		
		saudacao("Bom dia, Turma Java84!");
		
		ExemploMetodoExterno.info(); //tem que chamar a classe
		
	}
	
	//criar/declarar  metodo fora public static|| não faz sentindo criar um metodo dentro do metodo
	//public, protected, privade || static (metodo independente) || tipo de retorno || parametro e argurmento são sinonimos
	public static int somar(int num1, int num2) { //bom colocar no verbo infinitivo|| Assinatura do Método 
		return num1 + num2; // toda tipagem diferente de void tem que colocar return
		}
	
	public static void mensagem() { //ausência de valor no retorno, não é possível guardar dentro de uma variável
		System.out.println("Esse método não tem retorno (void)"); // sysout + ctrl+O| faz bem rapido 	
	}
	//um parametro
	public static void saudacao(String msg) {
		System.out.println(msg);
	}
	

}
