package programacao1.sexta.aula08.aovivo;

public class Patinete {
	private boolean eEletrico;
	private int pesoSuportado;
	public boolean iseEletrico() {
		return eEletrico;
	}
	public void seteEletrico(boolean eEletrico) {
		this.eEletrico = eEletrico;
	}
	public int getPesoSuportado() {
		return pesoSuportado;
	}
	public void setPesoSuportado(int pesoSuportado) {
		this.pesoSuportado = pesoSuportado;
	}
	@Override
	public String toString() {
		return "Patinete [eEletrico=" + eEletrico + ", pesoSuportado=" + pesoSuportado + "]";
	}

}
