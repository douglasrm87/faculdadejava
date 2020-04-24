package programacao2.aula11.aovivo;

public class ChamadaOrdenada implements Comparable<ChamadaOrdenada> {
	private int matricula;
	private String nome;

	// Para comparar via String
	@Override
	public int compareTo(ChamadaOrdenada parametro) {
		String outroValor = parametro.getNome();
		return this.getNome().compareTo(outroValor);
	}
	// Para comparar via int
//	@Override
//	public int compareTo(ChamadaOrdenada parametro) {
//		int outroValor = parametro.getMatricula();
//		if (this.getMatricula() > outroValor) {
//			return 1;
//		}else {
//			if (this.getMatricula() < outroValor) {
//				return -1;
//			}
//		}
//		return 0;
//	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + matricula;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChamadaOrdenada other = (ChamadaOrdenada) obj;
		if (matricula != other.matricula)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	public ChamadaOrdenada(int matricula, String nome) {
		super();
		this.matricula = matricula;
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
