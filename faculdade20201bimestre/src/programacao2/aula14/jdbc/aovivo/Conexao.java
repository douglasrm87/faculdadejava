package programacao2.aula14.jdbc.aovivo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	public static void main(String[] args) {
		new Conexao().processar();
	}

	private void processar() {
		System.out.println("Ola minha primeira conexão.");
		try {
			// para mysql
//			Class.forName("com.mysql.jdbc.Driver");
			// para postgree
			Class.forName("org.postgresql.Driver");
			System.out.println("Apos Class.forname().");
			
//			String url = "jdbc:mysql://localhost:3306/seguro?createDatabaseIfNotExist=true";
			String url = "jdbc:postgresql://localhost:5432/faculdade";
			Connection con = DriverManager.getConnection(url, "postgres", "1234567");
			System.out.println("Apos obter conexao.");
			con.close();
			
		} catch (ClassNotFoundException e) {
			System.out.println("Diver inválido.");
			e.printStackTrace();
		} catch (SQLException e) {
			
			if (e instanceof SQLException) {
				System.out.println("MSG:" + e.getErrorCode());
				System.out.println("MSG:" + e.getMessage());
				System.out.println("MSG:" + e.getSQLState());
				
			}
			System.out.println("local do banco incorreto, ou nome do banco incorreto, ou porta incorreta, ou usuario invalido ou senha invalida");
			e.printStackTrace();
		}

		
		
	}

}
