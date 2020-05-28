package programacao2.aula15.jdbc.aovivo;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import programacao2.aula14.jdbc.aovivo.Conexao;

public class TabelaVenda {
	public static void main(String[] args) {
		new TabelaVenda().processar();
	}

	private void processar() {
		criarTabelaVenda();
	}

	private void criarTabelaVenda() {
		String createString = "create table venda ( nome_vendedor VARCHAR(32) , matricula int , primary key (matricula) )";
		Conexao c = new Conexao();

		try {
			Connection con = c.conectarPostGree();
			Statement stmt = con.createStatement();
			int ret = stmt.executeUpdate(createString);
			System.out.println("ret criar tabela:" + ret);

			stmt.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
