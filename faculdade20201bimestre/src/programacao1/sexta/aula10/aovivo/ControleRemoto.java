package programacao1.sexta.aula10.aovivo;

import java.util.Scanner;

public class ControleRemoto {
	/*
	 * script metodo main por que interagimos por esta classe preciso de um leia um
	 * switch preciso de um loop
	 */
	Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		ControleRemoto c = new ControleRemoto();
		c.processar();
	}

	private void processar() {
		int op = 0;
		Televisao cr = new Televisao();
		do {
			System.out.println("1 - Aumenar Volume");
			System.out.println("2 - Reduzir Volume");
			System.out.println("3 - Aumentar Canal");
			System.out.println("4 - Reduzir Canal");
			System.out.println("5 - Ligar TV");
			System.out.println("6 - Escolher canal");
			System.out.println("7 - Mute");
			System.out.println("8 - Configurações");
			System.out.println("9 - Sair");
			System.out.println("10 - Ultimo Canal");
			System.out.println("11 - Ultimos Canais");
			System.out.println("Digite sua opção");
			op = this.leia.nextInt();
			switch (op) {
			case 1:
				cr.aumentarVolume();
				break;
			case 2:
				cr.reduzirVolume();
				break;
			case 3:
				cr.aumentarCanal();
				break;
			case 4:
				cr.reduziCanal();
				break;
			case 5:
				cr.ligarTV();
				break;
			case 6:
				int canalNovo = this.leia.nextInt();
				cr.aplicaCanal(canalNovo);
				break;
			case 7:
				cr.mute();
				break;
			case 8:
				System.out.println(cr.toString());
				break;

			case 9:
				System.out.println("Saindo do sistema");
				break;

			case 10:
				System.out.println("Último canal:" + cr.getUltimoCanal());
				break;
			case 11:
				System.out.println("Últimos canais:" + cr.listarUltimoscanais());
				break;
				
				
			default:
				System.out.println("Opção inálida");
				break;
			}
		} while (op != 9);
	}

}
