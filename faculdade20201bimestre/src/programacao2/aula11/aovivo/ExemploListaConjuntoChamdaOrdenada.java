package programacao2.aula11.aovivo;

import java.util.Set;
import java.util.TreeSet;

public class ExemploListaConjuntoChamdaOrdenada {
	public static void main(String[] args) {
		System.out.println("_______________________________");
		ChamadaOrdenada c;// referencia a classe
		Set<ChamadaOrdenada> setChamada = new TreeSet<>();
		c = new ChamadaOrdenada(1, "Douglas");
		setChamada.add(c);

		c = new ChamadaOrdenada(12, "Pedro");
		setChamada.add(c);

		c = new ChamadaOrdenada(5, "João");
		setChamada.add(c);

		c = new ChamadaOrdenada(3, "Mendes");
		setChamada.add(c);
		for (ChamadaOrdenada chamada : setChamada) {
			System.out.println("Item");
			System.out.println(chamada.getMatricula());
			System.out.println(chamada.getNome());
		}

	}

}
