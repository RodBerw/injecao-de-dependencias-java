package mainPackage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ArquivoArmazenamento implements Armazenamento {
	private List<Veiculo> veiculos = new ArrayList<>();
	File arquivo = new File("veiculos.txt");

	public void adicionarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
        
		try {
			
			if (!arquivo.exists()) {
	            arquivo.createNewFile(); 
	        }

	        FileWriter arq = new FileWriter(arquivo, true); //
	        PrintWriter gravarArq = new PrintWriter(arq);
		
	                
	        gravarArq.printf("Marca: " + veiculo.marca + ", Modelo: " + veiculo.modelo + ", Ano de fabricação: " + veiculo.anoFabricacao + ", Preço: " + veiculo.preco);

	        arq.close();
	
	        System.out.println("Veículo adicionado ao arquivo banco de dados.");
		}
        
        catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @Override
    public void recuperarVeiculos() {
    	System.out.println("Banco de dados no aquivo:");
        for(Veiculo v : veiculos) {
        	System.out.println("Marca: " + v.marca + ", Modelo: " + v.modelo + ", Ano de fabricação: " + v.anoFabricacao + ", Preço: " + v.preco + "%n");
        }
    }
	
}
