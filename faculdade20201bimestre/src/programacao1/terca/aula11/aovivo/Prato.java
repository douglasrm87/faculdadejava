package programacao1.terca.aula11.aovivo;

public class Prato {
	private double preco;
	private static int numeroPedido;
	private String nomeGarcom;
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getNumeroPedido() {
		return numeroPedido;
	}
	public void setNumeroPedido(int numeroPedido) {
		this.numeroPedido = numeroPedido;
	}
	public String getNomeGarcom() {
		return nomeGarcom;
	}
	public void setNomeGarcom(String nomeGarcom) {
		this.nomeGarcom = nomeGarcom;
	}
	@Override
	public String toString() {
		return "Prato [preco=" + preco + ", numeroPedido=" + numeroPedido + ", nomeGarcom=" + nomeGarcom + "]";
	}

	
	
}
