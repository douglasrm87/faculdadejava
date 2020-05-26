package programacao1.terca.aula15.excecoes.aovivo;

public class ExemploExcecaoIncorreto {

	public static void main(String[] args) {
		new ExemploExcecaoIncorreto().processar();
	}

	private void processar() {
		avaliarIdade(18);
	}

	private int avaliarIdade(int idade) {
		if (idade >= 16 && idade < 18) {
			System.out.println("Pode votar - Facultativo");
			return 2;
		}
		if (idade >= 18) {
			System.out.println("Pode dirigir");
			return 1;
		}
		if (idade >= 60) {
			System.out.println("voto Facultativo");
			return 3;
		}
		
		return 0;
	}

}
