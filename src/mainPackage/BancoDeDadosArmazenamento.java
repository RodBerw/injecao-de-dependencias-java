package mainPackage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.xdevapi.Statement;

public class BancoDeDadosArmazenamento implements Armazenamento {
	private List<Veiculo> veiculos = new ArrayList<>();
	
	Conexao conexaoClass = new Conexao();

	public void adicionarVeiculo(Veiculo veiculo) {
        
        String sql = "INSERT INTO VEICULO (MARCA, MODELO, ANOFABRICACAO, PRECO) VALUES (?, ?, ?, ?)";
        
        PreparedStatement ps = null;
        
        try {
        	ps = Conexao.criarConexao().prepareStatement(sql);
        	ps.setString(1, veiculo.modelo);
        	ps.setString(2, veiculo.modelo);
        	ps.setInt(3, veiculo.anoFabricacao);
        	ps.setDouble(4, veiculo.preco);
        	
        	ps.execute();
        	ps.close();
        	System.out.println("Veículo adicionado ao banco de dados.");
        } catch(SQLException e) {
        	e.printStackTrace();
        	System.out.println("Esse veículo não pertence a nenhuma classe válida...");
        }
        
        
        
    }


    @Override
    public void recuperarVeiculos() {
    	
    	String sql = "SELECT * FROM VEICULO";
        
        PreparedStatement ps = null;
    	
    	try {
        	ps = Conexao.criarConexao().prepareStatement(sql);
        	
        	System.out.println("Banco de dados MySQL:");
        	ResultSet r = ps.executeQuery();
        	while(r.next()) {
        		System.out.println("Marca: " + r.getString("marca") + ", Modelo: " + r.getString("modelo") + ", Ano de fabricação: " + r.getString("anoFabricacao") + ", Preço: " + r.getString("preco"));
        	}
        	
        	ps.close();
        	
        	
        } catch(SQLException e) {
        	e.printStackTrace();
        	System.out.println("Esse veículo não pertence a nenhuma classe válida...");
        }
    	
    	
       
    }

}
