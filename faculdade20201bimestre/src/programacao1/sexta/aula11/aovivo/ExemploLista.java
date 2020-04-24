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
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		
		
		
	}

}
