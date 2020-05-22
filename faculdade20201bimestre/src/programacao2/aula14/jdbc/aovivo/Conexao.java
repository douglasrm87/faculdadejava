package programacao2.aula14.jdbc.aovivo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	public static void main(String[] args) {
		new Conexao().testarConexao();
	}

	public void testarConexao() {
		Connection c = conectarPostGree();
		if (c != null) {
			System.out.println("Conectado com sucesso.");
			try {
				c.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("problemas na conexão.");
		}

	}

	public Connection conectarPostGree() {
		System.out.println("Ola minha primeira conexão.");
		try {
			// para mysql
//			Class.forName("com.mysql.jdbc.Driver");
			// para postgree
			Class.forName("org.postgresql.Driver");
			System.out.println("Apos Class.forname().");

//			String url = "jdbc:mysql://localhost:3306/seguro?createDatabaseIfNotExist=true";
			String url = "jdbc:postgresql://localhost:5432/faculdade";
			Connection con = DriverManager.getConnection(url, "postgres", "123456");
			System.out.println("Apos obter conexao.");
			return con;
		} catch (ClassNotFoundException e) {
			Conexao.printSQLException(null, e);
		} catch (SQLException e) {
			Conexao.printSQLException(e, null);
		}
		return null;
	}

	public static void printSQLException(SQLException ex, Exception exception) {
		for (Throwable e : ex) {
			if (e instanceof SQLException) {
				e.printStackTrace(System.err);
				if (((SQLException) e).getSQLState().equalsIgnoreCase("42P01")) {
					System.err.println("Tabela não existe: ");
					break;
				} else {
					System.err.println("SQLState: " + ((SQLException) e).getSQLState());
					System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
					System.err.println("Message: " + e.getMessage());
					Throwable t = ex.getCause();
					while (t != null) {
						System.out.println("Cause: " + t);
						t = t.getCause();
					}
				}
			}
		}
		if (exception != null) {
			exception.toString();
			System.out.println("\n");
			exception.printStackTrace();
		}
	}
}
