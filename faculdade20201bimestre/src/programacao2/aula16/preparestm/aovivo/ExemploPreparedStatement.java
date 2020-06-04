package programacao2.aula16.preparestm.aovivo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import programacao2.aula14.jdbc.aovivo.Conexao;

public class ExemploPreparedStatement {

	public static void main(String[] args) {

		new ExemploPreparedStatement().processar();

	}

	private void processar() {
//		inserirVenda();
//		selecionarTodos();
//		selecionarByMatricula();
		List<Venda> listaVendas =  selecionarByMatriculaList();
		for (Venda venda : listaVendas) {
			System.out.println("Matricula:" + venda.getMatricula());
			System.out.println("Nome:" + venda.getNome());
			System.out.println("Data:" + venda.getData());
		}
	}

	private List<Venda> selecionarByMatriculaList() {
		Venda v1 = new Venda(123, "Douglas", new Date());
		List <Venda> listaRetorno = new ArrayList<Venda>();
		String sql = " SELECT matricula , nome , data FROM venda where matricula = ?";
		Conexao minhaCon = new Conexao();
		try (Connection con = minhaCon.conectarPostGree(); PreparedStatement stmt = con.prepareStatement(sql);) {
			stmt.setInt(1, v1.getMatricula());
			try (ResultSet rs = stmt.executeQuery();) {
				while (rs.next()) {
					Venda v = new Venda(rs.getInt(1),rs.getString(2),rs.getDate(3));
					listaRetorno.add(v);
				}
				con.commit();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listaRetorno;
	}
	
	
	private void selecionarByMatricula() {
		Venda v1 = new Venda(123, "Douglas", new Date());
		String sql = " SELECT matricula , nome , data FROM venda where matricula = ?";
		Conexao minhaCon = new Conexao();
		try (Connection con = minhaCon.conectarPostGree(); PreparedStatement stmt = con.prepareStatement(sql);) {
			stmt.setInt(1, v1.getMatricula());
			try (ResultSet rs = stmt.executeQuery();) {
				while (rs.next()) {
					System.out.println("Matricula:" + rs.getInt(1));
					System.out.println("Nome:" + rs.getString(2));
					System.out.println("Data:" + rs.getDate(3));
				}
				con.commit();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	private void selecionarTodos() {
		String sql = " SELECT matricula , nome , data FROM venda ";
		Conexao minhaCon = new Conexao();
		try (Connection con = minhaCon.conectarPostGree(); PreparedStatement stmt = con.prepareStatement(sql);) {
			try (ResultSet rs = stmt.executeQuery();) {
				while (rs.next()) {
					System.out.println("Matricula:" + rs.getInt(1));
					System.out.println("Nome:" + rs.getString(2));
					System.out.println("Data:" + rs.getDate(3));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void inserirVenda() {
		Venda v1 = new Venda(990, "Alexandre", new Date());
		// obter conexao
		Conexao minhaCon = new Conexao();

		String sql = " INSERT INTO venda ( matricula , nome , data )  VALUES (?,?,?) ";

		// try-with-resource
		try (Connection con = minhaCon.conectarPostGree(); PreparedStatement stmt = con.prepareStatement(sql);) {
			stmt.setInt(1, v1.getMatricula());
			stmt.setString(2, v1.getNome());
			stmt.setDate(3, new java.sql.Date(v1.getData().getTime()));
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
