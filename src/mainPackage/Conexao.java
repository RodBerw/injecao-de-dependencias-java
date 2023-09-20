package mainPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Conexao {
	
	public static Connection criarConexao() {
		
		String url = "jdbc:mysql://localhost:3306/banco";
		String user = "root";
		String password = ""; //Colocar sua senha para funcionar
		
		
		try {
        	Class.forName("com.mysql.cj.jdbc.Driver");	
    		
    		Connection connection = DriverManager.getConnection(url, user, password);
    		
    		return connection;
    		
    		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Não foi possível criar uma conexão.");
		}
		return null;
	}

}
