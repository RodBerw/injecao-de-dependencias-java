package mainPackage;
import java.util.ArrayList;
import java.util.List;

public class BancoDeDadosArmazenamento implements Armazenamento {
	private List<Veiculo> veiculos = new ArrayList<>();

	public void adicionarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);

        System.out.println("Veículo adicionado ao banco de dados.");
    }

    @Override
    public List<Veiculo> recuperarVeiculos() {
        return veiculos;
    }

}
