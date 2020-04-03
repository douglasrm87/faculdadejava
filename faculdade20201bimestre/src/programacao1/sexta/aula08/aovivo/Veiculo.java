package programacao1.sexta.aula08.aovivo;

public class Veiculo {
	private double preco;
	private String marca;
	private String modelo;
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	@Override
	public String toString() {
		return "Veiculo [preco=" + preco + ", marca=" + marca + ", modelo=" + modelo + "]";
	}
	

}
