package programacao2.aula15.jdbc.aovivo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import programacao2.aula14.jdbc.aovivo.Conexao;

public class TabelaVenda {
	public static void main(String[] args) {
		new TabelaVenda().processar();
	}

	private void processar() {
//		criarTabelaVenda();
		inserirTabelaVenda();
		selecionarTabelaVenda();
	}
	private void selecionarTabelaVenda() {
		try {
			Conexao c = new Conexao();
			Connection con = c.conectarPostGree();
			Statement stmt = con.createStatement();
			
			ResultSet rs = stmt.executeQuery("Select nome_vendedor , matricula from venda");
			while (rs.next()) {
				System.out.println("*************************");
				System.out.println("nome_vendedor: " + rs.getString("nome_vendedor"));
				System.out.println("matricula: " + rs.getInt("matricula"));

				
			}


			
			rs.close();
			stmt.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		
	}
	private void inserirTabelaVenda() {
		String createString = "insert into venda ( nome_vendedor,matricula ) VALUES ( 'Joao Pedro' , 222253333 )";
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
