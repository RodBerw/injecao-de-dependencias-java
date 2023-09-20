package mainPackage;

public class Carro extends Veiculo {
	private int numeroPortas;

	public Carro(String marca, String modelo, int anoFabricacao, double preco, int outro) {
		super(marca, modelo, anoFabricacao, preco, outro);
		this.outro = numeroPortas;
		// TODO Auto-generated constructor stub
	}
	
	public int getNumeroPortas() {
		return numeroPortas;
	}

}
