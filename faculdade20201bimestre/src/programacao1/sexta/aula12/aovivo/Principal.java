package programacao1.sexta.aula12.aovivo;

import java.util.ArrayList;
import java.util.List;

public class Principal {
	public static void main(String[] args) {
		new Principal().processar();
	}

	private void processar() {
		List<Sapato> listaSapato = new ArrayList<>();
		Sapato s1 = new Sapato("salto alto", 34);
		listaSapato.add(s1); // adicionar em memoria
		s1 = new Sapato("salto baixo", 33);
		listaSapato.add(s1);// adicionar em memoria
		s1 = new Sapato("tennis", 37);
		listaSapato.add(s1);// adicionar em memoria
		s1 = new Sapato("chinello", 39);
		listaSapato.add(s1);
		for (Sapato sapato : listaSapato) {
			System.out.println(sapato);
		}
	}
}
