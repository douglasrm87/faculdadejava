package programacao1.sexta.aula14.aovivo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
	private double valorPed;
	private Date date;
	private List<Itens> lista = new ArrayList<Itens>();
	public double getValorPed() {
		return valorPed;
	}
	public void setValorPed(double valorPed) {
		this.valorPed = valorPed;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public List<Itens> getLista() {
		return lista;
	}
	public void setLista(List<Itens> lista) {
		this.lista = lista;
	}
	public Pedido(double valorPed, Date date, List<Itens> lista) {
		super();
		this.valorPed = valorPed;
		this.date = date;
		this.lista = lista;
	}
	public Pedido() {}
	@Override
	public String toString() {
		return "Pedido [valorPed=" + valorPed + ", date=" + date + ", lista=" + lista + "]";
	}

}
