package programacao1.sexta.aula14.aovivo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class PrincipalMenuIncorreta {
	public static void main(String[] args) {
		new PrincipalMenuIncorreta().processar();
	}

	int atributo = 0;
	Scanner leia = new Scanner(System.in);

	private void processar() {
		int op = 0;
		do {
			System.out.println("1 - cadastrar cliente");
			System.out.println("2 - cadastrar pedido");
			System.out.println("3 - Escolher Item");
			System.out.println("9 - sair");
			op = leia.nextInt();
			List<Itens> lista = new ArrayList<>();
			Cliente c = new Cliente();
			switch (op) {
			case 1:
				c = new Cliente("Douglas", "123456");
				break;
			case 2:
				double total = 0.0;
				for (Itens itens : lista) {
					total = total + itens.getValorItem();
				}
				Pedido p = new Pedido(total, new Date(), lista);

				c.setP(p);

				System.out.println("Cliente completo: " + c);

				break;
			case 3:
				Itens i1 = new Itens("sapato", 60);
				lista.add(i1);
				Itens i2 = new Itens("cinto", 160);
				lista.add(i2);
				Itens i3 = new Itens("bolsa", 260);
				lista.add(i3);
				Itens i4 = new Itens("cadarco", 33);
				lista.add(i4);
				Itens i5 = new Itens("camisa", 30);
				lista.add(i5);
				break;
			default:
				break;
			}
		} while (op != 9);
	}

}
