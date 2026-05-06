package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploStream {

	public static void main(String[] args) {
		
		List<String> estados = Arrays.asList("São Paulo", "Rio de Janeiro", "Minas Gerais", "Espirito Santo",
				"São Paulo", "Rio de Janeiro", "Minas Gerais", "São Paulo", "Rio de Janeiro");
		//Stream
		List<String> estadosEmMaiusculo = estados.stream()
				//Operação Intermediária (Processamento)
				.map(x -> x.toUpperCase()) //percorre a String fazendo um processamento em cada item da colletion, Relembra o interator||lambdas são bastante utilizadas na stream
				.collect(Collectors.toList()); //Agrupou e formou uma lista
		List<String> estadosUnicos = estados.stream()
				.distinct()
				.collect(Collectors.toList()); 
		long quantidadeDeEstados = estados.stream()
				.distinct()
				.count(); //Operação Terminal
		
		System.out.println("Estados em Maiúsculo: " + estadosEmMaiusculo);
		System.out.println("Coleção/Dados Inicial: " + estados);
		System.out.println("Estados: " + estadosUnicos);
		
		System.out.println("\n Quantidade de Estados: " + quantidadeDeEstados);
	}

}
