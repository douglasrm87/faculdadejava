package programacao1.sexta.aula11.aovivo;

public class PrincipalPoliMorfismo {
	public static void main(String[] args) {
		Pet p;// referencia para a classe PET.
		p = new Gato();
		p.emitirSom(); // mesma forma 3 vezes executada
		
		p = new Cachorro();
		p.emitirSom();
		
		p = new Ave();
		p.emitirSom();
		
		
		Pet pVetor[] = new Pet [3];
		pVetor[0] = new Ave();
		pVetor[1] = new Cachorro();
		pVetor[2] = new Gato();
		for (int i = 0; i < pVetor.length; i++) {
			pVetor[i].emitirSom();// para cada execução um resultado diferente
		}
				
				
		
		
		
	}

}
