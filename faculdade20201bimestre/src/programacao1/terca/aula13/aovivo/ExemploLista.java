package programacao1.terca.aula13.aovivo;

import java.util.ArrayList;
import java.util.List;

public class ExemploLista {
	public static void main(String[] args) {
		
		String strInt = "10";
		
		int x = Integer.parseInt(strInt);
		
		List <Integer> lista;
		lista = new ArrayList <>();
		
		lista.add (1);
		lista.add (11);
		lista.add (31);
		lista.add (41);
		lista.add (15);
		lista.add (167777);
		int total = 0;
		for (int i = 0; i < lista.size(); i++) {
			total = total + lista.get(i);// downcasting
		}
		System.out.println("Media:" + total/lista.size());
		
		
		
	}

}
