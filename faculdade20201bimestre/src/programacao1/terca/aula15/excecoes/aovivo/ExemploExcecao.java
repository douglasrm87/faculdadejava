package programacao1.terca.aula15.excecoes.aovivo;

public class ExemploExcecao {

	public static void main(String[] args) {
		new ExemploExcecao().processar();
	}

	private void processar() {

		System.out.println("Soma: " + calculadora(10, 10, "+"));
		try {
			System.out.println("Soma: " + calculadora(10, 0, "/"));	
		} catch (Exception e) {
			System.out.println("\nMSG:" + e.getMessage());
			System.out.println();

		}
		

		try {
			avaliarIdade02(90);	
		} catch (Exception e) {
			System.out.println("\nMSG:" + e.getMessage());
			System.out.println();

		}
		

		try {
			avaliarIdade(18);
		} catch (Exception e) {
			System.out.println("\nMSG:" + e.getMessage());
			System.out.println();
		}

	}

	private void avaliarIdade(int idade) throws Exception {
		if (idade >= 16 && idade < 18) {
			throw new Exception("Pode votar - Facultativo");
		}
		if (idade >= 18) {
			throw new Exception("Pode dirigir");
		}
		if (idade >= 60) {
			throw new Exception("voto Facultativo");
		}
	}

	private void avaliarIdade02(int idade) {
		if (idade >= 16 && idade < 18) {
			throw new IllegalArgumentException("Pode votar - Facultativo");
		}
		if (idade >= 18) {
			throw new IllegalArgumentException("Pode dirigir");
		}
		if (idade >= 60) {
			throw new IllegalArgumentException("voto Facultativo");
		}
	}

	private double calculadora(int a, int b, String operacao) {
		switch (operacao) {
		case "+":
			return a + b;
		case "-":
			return a - b;
		case "*":
			return a * b;
		case "/":
			return a / b;

		default:
			break;
		}
		return 0.0;
	}

}
