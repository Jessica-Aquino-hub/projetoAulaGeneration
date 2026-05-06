package pooPolimorfismo;

public class TestaClasse {

	public static void main(String[] args) {

		//Pessoa p = new Pessoa("Maria", 18);  não dar para criar um objeto com uma classe mãe abstract|| Proteção de determinadas funções.
		
		TriAtleta t = new TriAtleta("Elise", 26, 400);
		//TriAtleta t2 = new TriAtleta("João", 30);
		//t2.competicoesConcluidas();
		//t2.competicoesConcluidas(8);
		//t.setNome("Queren"); // troca
		
		//System.out.println(t.getNome()); //mostra com o get
		t.visualizar();

	}

}
