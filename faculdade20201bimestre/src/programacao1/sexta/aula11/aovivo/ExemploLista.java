package programacao1.sexta.aula11.aovivo;

import java.util.ArrayList;
import java.util.List;

public class ExemploLista {
	
	public static void main(String[] args) {
		List lista; // apenas uma referencia
		lista = new ArrayList(); // criamso um objeto
		lista.add("Douglas");
		lista.add("Mendes");
		lista.add("Rocha");
		lista.add("João");
		lista.add("Pedro");
		lista.add("Eu");
		lista.add(1);
		lista.add(22);
		lista.add(134);
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		List lista2 = new ArrayList();
		lista2.add(90);
		lista2.add(30);
		lista2.add(90);
		double total = 0.0;
		for (int i = 0; i < lista.size(); i++) {
			total = total + (double) lista2.get(i);
		}
		System.out.println("Media: " + total/lista2.size());
		
		
		
	}

}
