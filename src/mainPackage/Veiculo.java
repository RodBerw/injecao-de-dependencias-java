package mainPackage;

public class Veiculo {
	public String marca;
	public String modelo;
	public int anoFabricacao;
	public double preco;
	public int outro;
	
	public Veiculo(String marca, String modelo, int anoFabricacao, double preco, int outro) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.preco = preco;
        this.outro = outro;
    }
	
	public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public double getPreco() {
        return preco;
    }
    
    public int getOutro() {
    	return outro;
    }
}
