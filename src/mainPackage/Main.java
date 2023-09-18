package mainPackage;

import java.util.List;

public class Main {
	public static void main(String[] args) {
		//Cria os tipos de banco de dados disponíveis
		Armazenamento bancoDeDados = new BancoDeDadosArmazenamento();
		Armazenamento arquivo = new ArquivoArmazenamento();
		
		//Crie as instancias de concessionaria disponíveis
		Concessionaria concessionariaBancoDeDados = new Concessionaria(bancoDeDados);
		Concessionaria concessionariaArquivo = new Concessionaria(arquivo);
		
		//Cria os veículos disponíveis
		Veiculo carro1 = new Carro("Toyota", "Corolla", 2022, 50000.0);
		Veiculo moto1 = new Motocicleta("Honda", "CBR", 2021, 8000.0);
		
		//Funcionamento
		
		concessionariaBancoDeDados.adicionarVeiculo(carro1);
		concessionariaBancoDeDados.adicionarVeiculo(moto1);
		concessionariaArquivo.adicionarVeiculo(carro1);
		concessionariaArquivo.adicionarVeiculo(moto1);
		
		//Adiciona os veículos do banco de dados ou arquivo as respectivas listas
		List<Veiculo> veiculosBancoDeDados = concessionariaBancoDeDados.listarVeiculosEmEstoque();
        List<Veiculo> veiculosArquivo = concessionariaArquivo.listarVeiculosEmEstoque();

        System.out.println("Veículos em estoque (Banco de Dados):");
        for (Veiculo veiculo : veiculosBancoDeDados) {
            System.out.println(veiculosBancoDeDados.indexOf(veiculo) + 1 + ": Marca: " + veiculo.getMarca() + ", Modelo: " + veiculo.getModelo() + ", Ano de fabricação: " + veiculo.getAnoFabricacao() + ", Preço: " + veiculo.getPreco());
        }

        System.out.println("\nVeículos em estoque (Arquivo):");
        for (Veiculo veiculo : veiculosArquivo) {
        	System.out.println(veiculosArquivo.indexOf(veiculo) + 1 + ": Marca: " + veiculo.getMarca() + ", Modelo: " + veiculo.getModelo() + ", Ano de fabricação: " + veiculo.getAnoFabricacao() + ", Preço: " + veiculo.getPreco());
        }
	}
}
