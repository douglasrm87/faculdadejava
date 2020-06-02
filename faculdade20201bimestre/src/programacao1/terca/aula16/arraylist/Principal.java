package programacao1.terca.aula16.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Principal {
	public static void main(String[] args) {
		new Principal().processar();
	}

	public void processar() {
//		List<ItemPedido> - Generics ou Tipos PArametrizados.s
		List<ItemPedido> listaItens = new ArrayList<>();
		ItemPedido item = new ItemPedido("sapato", 10);
		listaItens.add(item);
		item = new ItemPedido("Camisa", 50);
		listaItens.add(item);
		item = new ItemPedido("Cinto", 60);
		listaItens.add(item);
		item = new ItemPedido("chapeu", 160);
		listaItens.add(item);
		double totalPed = 0.0;
		for (ItemPedido itemPedido : listaItens) {
			totalPed = totalPed + itemPedido.getValorItem();
		}
		Pedido p = new Pedido(totalPed, 1, listaItens);
		System.out.println("Pedido" + p);

	}

}
