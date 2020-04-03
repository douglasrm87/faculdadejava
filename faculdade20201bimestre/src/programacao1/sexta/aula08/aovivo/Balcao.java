package programacao1.sexta.aula08.aovivo;

import java.util.Scanner;

public class Balcao {

	public static void main(String[] args) {
		Balcao b = new Balcao();
		b.processar();
	}

	Scanner leia = new Scanner(System.in);

	private void processar() {
		System.out.println("1-Adicionar Moto");
		System.out.println("2-Adicionar Bicicleta");
		System.out.println("3-Adicionar Patinete");
		System.out.println("4-Adicionar Carro");
		System.out.println("7-Encerrar vigencia");
		System.out.println("9 - encerrar aplicação");
		System.out.println("Digite sua opção:");
		int op = leia.nextInt();
		switch (op) {
		case 1:
			System.out.println("Adicionar Moto");
			break;
		case 2:
			System.out.println("Adicionar Bicicleta");
			break;
		case 3:
			System.out.println("Adicionar Patinete");
			break;
		case 4:
			System.out.println("Adicionar Carro");
			break;
		case 7:
			System.out.println("Encerrar vigencia Contrato");
			break;
		case 9:
			System.out.println("Encerrar aplicação");
			break;
		default:
			break;
		}
		
	}
}
