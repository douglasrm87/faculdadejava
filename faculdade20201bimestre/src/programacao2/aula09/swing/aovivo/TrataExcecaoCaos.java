package programacao2.aula09.swing.aovivo;

import java.util.Scanner;

public class TrataExcecaoCaos {
	public static void main(String[] args) {
		new TrataExcecaoCaos().processar();
	}

	Scanner leia = new Scanner(System.in);

	private void processar() {
		System.out.println("Digite dua idade:");
		int idade = this.leia.nextInt();
		int ret = validarDirecao(idade);
		if (ret == 0) {
			System.out.println("Voce ainda não foi autorizado a dirigir");
		} else {
			if (ret == 2) {
				System.out.println("Voce esta com a idade ok, mas esta suspenso");
			} else {
				if (ret == 4) {
					System.out.println("Voce esta com a idade ok, nao esta suspenso mas nao pagou a ataxa");
				} else {
					System.out.println("Voce esta autorizado a dirigir");
				}
			}
		}
	}

	private int validarDirecao(int idade) {
		if (idade >= 18) {
			int pontos = leia.nextInt();
			int ret = validarRetencaoCarteira(pontos);
			if (ret == 0) {
				System.out.println("PAgou a ataxa?");
				String taxa = this.leia.next();
				if (taxa.contentEquals("s")) {
					return 3;
				}
				return 1;
			} else {
				return 2;
			}
		}
		return 0;
	}

	private int validarRetencaoCarteira(int pontos) {
		if (pontos >= 40) {
			System.out.println("Esta suspenso");
			return 1;
		}
		System.out.println("Não esta suspenso");
		return 0;

	}

}
