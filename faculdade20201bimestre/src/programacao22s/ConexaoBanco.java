package programacao22s;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBanco {
	public static void main(String[] args) {
		new ConexaoBanco().processar();
	}

	private void processar () {
		try {
			Connection con = new ConexaoBanco().conectarBanco();
			if (con != null) {
				System.out.println("Conectado com sucesso.");
				criarTabelaFAQ();
				con.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Connection conectarBanco() {
		try {
			Class.forName("org.postgresql.Driver");
			String url = "jdbc:postgresql://localhost:5432/faculdade"; // 2
			Connection con = DriverManager.getConnection(url, "postgres", "123456");
			return con;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	private static final String CREATE_TABLE_IF_NOT_EXISTS = " CREATE TABLE IF NOT EXISTS  ";
	protected static final String FAQ_FACULDADE_PAI = " FAQ_FACULDADE_PAI ";
	protected static final String ID_PAI = "id_pai";
	protected static final String DESC_ITEM = "desc_item";

	private static final String INT_NOT_NULL = " INT NOT NULL ";
	private static final String TEXT_NOT_NULL = " TEXT NOT NULL ";
	protected static final String VIRGULA = " , ";
	protected static final String ABRE_PARENTESES = " ( ";
	protected static final String FECHA_PARENTESES = " ) ";
	private static final String PRIMARY_KEY = " PRIMARY KEY ";

	public void criarTabelaFAQ() {
		StringBuilder sql = new StringBuilder();
		sql.append(CREATE_TABLE_IF_NOT_EXISTS);
		sql.append(FAQ_FACULDADE_PAI);
		sql.append(ABRE_PARENTESES);

		sql.append(ID_PAI);
		sql.append(INT_NOT_NULL);
		sql.append(VIRGULA);

		sql.append(DESC_ITEM);
		sql.append(TEXT_NOT_NULL);
		sql.append(VIRGULA);

		sql.append(PRIMARY_KEY);
		sql.append(ABRE_PARENTESES);
		sql.append(ID_PAI);
		sql.append(FECHA_PARENTESES);
		sql.append(FECHA_PARENTESES);

		System.out.println("SQL Criar tabela " + FAQ_FACULDADE_PAI + " - " + sql);

	}
}
