package programacao1.sexta.aula08.aovivo;

//https://github.com/douglasrm87/Programacao1e2
public class Bicicleta extends Veiculo {
	private int raioAro;
	private String tpFreio;
	private String tpMarcha;
	public int getRaioAro() {
		return raioAro;
	}
	public void setRaioAro(int raioAro) {
		this.raioAro = raioAro;
	}
	public String getTpFreio() {
		return tpFreio;
	}
	public void setTpFreio(String tpFreio) {
		this.tpFreio = tpFreio;
	}
	public String getTpMarcha() {
		return tpMarcha;
	}
	public void setTpMarcha(String tpMarcha) {
		this.tpMarcha = tpMarcha;
	}
	@Override
	public String toString() {
		return "Bicicleta [raioAro=" + raioAro + ", tpFreio=" + tpFreio + ", tpMarcha=" + tpMarcha + "]";
	}

	
	
}
