package optional;

import java.util.Optional;

public class ExemploOptional2 {

	public static void main(String[] args) {
		
		String[] frases = new String[5];
		frases[2] = "Generation Brasil";

		Optional<String> optionalVazio = Optional.empty(); // inicializando um Optional vazio

		System.out.println("\n Exibir optionalVazio: " + optionalVazio);
		System.out.println("\n optionalVazio está vazio? " + optionalVazio.isEmpty());// tem algo vazio?

		Optional<String> valor_indice_02 = Optional.of(frases[2]); // inicializando Optional, já com valor 
		System.out.println("\n Exibir valor_indice_02: " + valor_indice_02); //mostra o Optiona[Valor]
		System.out.println("\n Obter o conteúdo de valor_indice_02: " + valor_indice_02.get()); // só o valor
		System.out.println("\n valor_indice_02 está presente? " + valor_indice_02.isPresent());
		
		//Se quiser um monte de de informação dentro você deve utilizar um objeto 

	}

}
