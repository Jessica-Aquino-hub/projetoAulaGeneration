package poo;

public class TestaCarro {

	public static void main(String[] args) {
		//Instanciamento | Instanciar um objeto
		Carro c1 = new Carro("Kombi", 4, 4, "Modelo XYZ");
		Carro c2 = new Carro("Toyota", 2, 4, "Modelo Supra");
		
		/*	c1.setMarca("Kombi");//se variavel é String ""
		c1.setPortas(4);
		*/
		c1.locomover();
		
		System.out.println("Marca: "+ c1.getMarca());
		System.out.println("Qtd. Portas: "+ c1.getPortas());
		System.out.println(c1.parar());
		System.out.println("");
		System.out.println("Marca: "+ c2.getMarca());
		System.out.println("Qtd. Portas: "+ c2.getPortas());
		
	}

}
