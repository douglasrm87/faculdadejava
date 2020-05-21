package programacao2.aula14.jdbc.aovivo;

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
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
	}

}
