package excecoes;

import java.util.Scanner;

public class Exemplo2 {
	static Scanner leia = new Scanner(System.in); // pode ser usado em qualquer lugar dentro dessa classe

	public static void main(String[] args) {

		int idade;
		try {
			System.out.println("\nDigite uma idade: ");
			idade = leia.nextInt();
			validarIdade(idade);
		} catch (ArithmeticException e) {
			System.err.println("Exceção: " + e.getMessage()); // getMessage pega so a mensagem da exceção
		}
		
		System.out.println("Rodou até aqui...");
	}

	public static void validarIdade(int idade) {

		if (idade < 18) {
			throw new ArithmeticException("A Pessoa não pode dirigir!!"); // lança uma nova exceção aritmética
																			// customizável

		} else {
			System.out.println("A Pessoa pode dirigir!!");
		}

	}
}
