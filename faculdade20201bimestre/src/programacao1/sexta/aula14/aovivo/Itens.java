package programacao1.sexta.aula14.aovivo;

public class Itens {
	private String descricao;
	private double valorItem;
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValorItem() {
		return valorItem;
	}
	public void setValorItem(double valorItem) {
		this.valorItem = valorItem;
	}
	public Itens(String descricao, double valorItem) {
		super();
		this.descricao = descricao;
		this.valorItem = valorItem;
	}
	@Override
	public String toString() {
		return "Itens [descricao=" + descricao + ", valorItem=" + valorItem + "]";
	}
	

}
