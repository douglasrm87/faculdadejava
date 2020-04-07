package programacao1.terca.aula11.aovivo;

public class Prato {
	protected static int numeroPedidoGeral;
	
	private double idPedido;
	private double preco;
	private String nomeGarcom;
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getNumeroPedido() {
		return numeroPedidoGeral;
	}
	protected void setNumeroPedido(int numeroPedido) {
		this.numeroPedidoGeral = numeroPedido;
	}
	public String getNomeGarcom() {
		return nomeGarcom;
	}
	public void setNomeGarcom(String nomeGarcom) {
		this.nomeGarcom = nomeGarcom;
	}
	
	
	public double getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(double idPedido) {
		this.idPedido = idPedido;
	}  
	@Override
	public String toString() {
		return "Prato [preco=" + preco + ", numeroPedido=" + idPedido + ", nomeGarcom=" + nomeGarcom + "]";
	}
	public Prato() {
		super();
		Prato.numeroPedidoGeral ++;
	}

	
	
}
