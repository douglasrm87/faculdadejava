package programacao1.terca.aula13.aovivo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aluno {

	Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		new Aluno().processar();
	}

	List<String> listaAlunos = new ArrayList<>();

	private void processar() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o valor do aluno: " + (i + 1) + " - ");
			String nome = this.leia.next();
			this.listaAlunos.add(nome);
//			this.listaAlunos.add(this.leia.next());
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Nome:" + this.listaAlunos.get(i));
		}
	}
}
