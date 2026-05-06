package lambda;

import java.util.Arrays;
import java.util.List;

public class Exemplo1 {

	public static void main(String[] args) {
		//Colletion - Lista
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		System.out.println("Exibir os itens\n");
		
		/*// Exibir os itens da Lista sem Expressão Lambda
		for(Integer n : numeros) { // : até 
			System.out.println(n);
		}*/
		
		System.out.println("Exibir os itens com lambda\n");
		// Exibir os itens da Lista com Expressão Lambda
			numeros.forEach(n -> System.out.println(n)); // (->) lambda

		
		System.out.println("\nExibir os itens somados com eles mesmos\n");
			numeros.forEach(n -> System.out.println(n + n));
		/*// Exibir os itens da Lista dobrados sem Expressão Lambda
		for(Integer n : numeros) {
			System.out.println(n + n);
		}*/

		System.out.println("\nExibir os itens pares da lista\n");
		numeros.forEach(n -> {
			if (n % 2 == 0)
				System.out.println(n);
		});
	/*	// Exibir apenas os elementos pares da Lista sem Expressão Lambda
		for(Integer n : numeros) {
			if(n%2 == 0) {
				System.out.println(n);
			}*/
			
		}

	}


