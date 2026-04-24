package vetor; //vetor é uma array unidimencional 

import java.util.Scanner;

public class ExemploVetor2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		//Criando um vetor vazio com 3 posições
		int vetorNumeros[] = new int[3];
		
		//vetorNumero[0]
		for(int indice = 0; indice < 3; indice++) {
			System.out.println("Digite um número: ");
			vetorNumeros[indice] = leia.nextInt();//mesma sixtase da declaração de variaveis	
		}
		
		for(int indice = 0; indice < 3; indice++) {
			System.out.println((indice + 1) + "º elemento: " + vetorNumeros[indice]); // automatiza a saida de dados e a entrada no vetor
		}

		System.out.println("Tamanho do Vetor: " + vetorNumeros.length); // Mostra o tamanho do vetor
	}

}
