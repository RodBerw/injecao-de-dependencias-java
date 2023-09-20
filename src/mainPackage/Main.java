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
		Veiculo carro1 = new Carro("Toyota", "Corolla", 2022, 50000.0, 4);
		Veiculo moto1 = new Motocicleta("Honda", "CBR", 2021, 8000.0, 1000);
		
		//Funcionamento
		
		concessionariaBancoDeDados.adicionarVeiculo(carro1);
		concessionariaBancoDeDados.adicionarVeiculo(moto1);
		concessionariaArquivo.adicionarVeiculo(carro1);
		concessionariaArquivo.adicionarVeiculo(moto1);
		
		//Adiciona os veículos do banco de dados ou arquivo as respectivas listas
		concessionariaBancoDeDados.listarVeiculosEmEstoque();
        concessionariaArquivo.listarVeiculosEmEstoque();


	}
}
