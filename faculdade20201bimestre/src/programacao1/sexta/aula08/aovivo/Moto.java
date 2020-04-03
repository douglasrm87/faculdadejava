package programacao1.sexta.aula08.aovivo;

public class Moto extends Veiculo {
	private int cilindrada;

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	@Override
	public String toString() {
		return "Moto [cilindrada=" + cilindrada + "]";
	}
	
}
