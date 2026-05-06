package optional; // é utilizado para evitar de quebrar o programa, quando dá null|| elimina a verificação com o if|| código mais limpo e elegante|| Optional é mais utilizado para interar banco de dados

import java.util.Optional;

public class ExemploOptional {

	public static void main(String[] args) {
		String[] palavras = new String[10];
		palavras[5] = "Turma";
		
		Optional<String> checaNulo = Optional.ofNullable(palavras[5]);
		if(checaNulo.isPresent()) { // verifica se tem um objeto dentro do objeto palavra
			String palavra = palavras[5].toLowerCase();
			System.out.println(palavra);
		}else {
			System.out.println("A palavra é nula!");
		}
		
	}

}
