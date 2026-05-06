package excecoes;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Exemplo1 {

	static Scanner ler = new Scanner(System.in);

	public static void main(String[] args) {

		int dividendo = 0;
		int divisor = 0;

		try {

			System.out.println("Digite o Dividendo: ");
			dividendo = ler.nextInt();

			System.out.println("Digite o Divisor: ");
			divisor = ler.nextInt();

			divide(dividendo, divisor);
			
		}	catch (InputMismatchException e) {
			System.err.println("\nExceção: " + e); //isso para outro dev
			System.out.println("\nDigite valores númericos!");

		} catch(ArithmeticException e) { //tratando
			System.err.println("\nExceção: " + e);
			System.out.println("\nDigite números inteiros e positivos!");
			
		} finally { //sempre ocorre, mesmo try dando certo ou o catch ativando
			System.out.println("\nSempre serei executado!");
		}
	}

	public static void divide(int dividendo, int divisor) {
		System.out.println("Divisão = " + (dividendo / divisor));
	}
}
