package programacao1.sexta.aula14.aovivo;

public class Cliente {
	private String nome;
	private String cpf;
	Pedido p = new Pedido();
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Pedido getP() {
		return p;
	}
	public void setP(Pedido p) {
		this.p = p;
	}
	public Cliente(String nome, String cpf, Pedido p) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.p = p;
	}
	public Cliente(String nome, String cpf ) {
		super();
		this.nome = nome;
		this.cpf = cpf;
 	}
	public Cliente() {}
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cpf=" + cpf + ", p=" + p + "]";
	}
	
	
	
}
