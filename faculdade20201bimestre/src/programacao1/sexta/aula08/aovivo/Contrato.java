package programacao1.sexta.aula08.aovivo;

import java.util.Date;

public class Contrato {
	private Veiculo vet[] = new Veiculo[4];
	private int contador = 0;
	private Date dataInicio;
	private Date dataFim;
	
	
	
	public Contrato() {
		super();
		this.dataInicio = new Date();
	}
	public void adicionarVeiculo(Veiculo veic) {
		this.vet[this.contador] = veic;
		this.contador ++;
	}
	public double fecharContrato() {
		System.out.println("Data inicio contrado" + this.dataInicio);
		double total=0.0;//variavel local
		for (int i = 0; i < this.contador; i++) {
			total = total + this.vet[i].getPreco();
			System.out.println(this.vet[i]);
		}
		this.dataFim = new Date();
		System.out.println("Data Fim contrado" + this.dataFim);
		return total;
	}
	public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	public Date getDataFim() {
		return dataFim;
	}
	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

}
