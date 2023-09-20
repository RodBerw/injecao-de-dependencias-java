package mainPackage;

public class Motocicleta extends Veiculo {
	private int cilindradas;

	public Motocicleta(String marca, String modelo, int anoFabricacao, double preco, int outro) {
		super(marca, modelo, anoFabricacao, preco, outro);
		this.outro = cilindradas;
		// TODO Auto-generated constructor stub
	}

	public int getCilindradas() {
		return cilindradas;
	}
}
