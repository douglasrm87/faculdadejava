package programacao1.sexta.aula14.aovivo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Principal {
	public static void main(String[] args) {
		new Principal().processar();
	}
	int atributo= 0 ;
	private void processar() {
		
		Cliente c = new Cliente("Douglas", "123456");
		
		List<Itens> lista = new ArrayList<>();
		
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
		double total = 0.0;
		for (Itens itens : lista) {
			total = total + itens.getValorItem();
		}
		
		Pedido p = new Pedido(total, new Date(),lista);
		
		c.setP(p);
		
	}

}
