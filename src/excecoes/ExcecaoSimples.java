package excecoes;

public class ExcecaoSimples extends Exception{
	
	//Atributo
	private static final long serialVersionUID = 1L; // final- impede de ser herdado| long- tipagem relacionada a número| serialVersion- qual versão ele é 
	
	public ExcecaoSimples() {} //
	
	public ExcecaoSimples(String mensagem) {
		super(mensagem);
	}
}
