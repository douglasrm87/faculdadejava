package programacao1.sexta.aula10.aovivo;

public class Televisao {
	private int volume = 10;
	private int canal = 12;
	private boolean estado = false; // comeca desligada

	private int ultimoCanal = 0;
	private int ultimos10Canais[] = new int[10];
	private int contador = 0;

	public int[] getUltimos10Canais() {
		return ultimos10Canais;
	}

	public void setUltimoCanal(int ultimoCanal) {
		this.ultimoCanal = ultimoCanal;
	}

	public void mute() {
		this.volume = 0;
	}

	private void setUltimos10Canais(int c) {
		if (this.contador < 10) {
			this.ultimos10Canais[this.contador] = c;
			this.contador++;
		} else {
			this.contador = 0;
			this.ultimos10Canais[this.contador] = c;
		}
	}

	public void aplicaCanal(int parametroCanal) {
		this.ultimoCanal = this.canal;
		setUltimos10Canais(this.canal);
		this.canal = parametroCanal;

	}

	// criar os metodos
	public void ligarTV() {
		this.estado = true; // ligando a aTV
	}

	public void aumentarVolume() {
		// implementar regra de negocio
		if (this.volume < 100) {
			this.volume = this.volume + 1;
		} else {
			System.out.println("Volume aumentado ao máximo.");
		}
	}

	public void reduzirVolume() {
		if (this.volume < 0) {
			this.volume = this.volume - 1;
		} else {
			System.out.println("Volume reduzido ao máximo.");
		}
	}

	public void aumentarCanal() {
		if (this.canal < 999) {
			this.ultimoCanal = this.canal;
			setUltimos10Canais(this.canal);
			this.canal = this.canal + 1;
		} else {
			this.canal = 1;
		}
	}

	public void reduziCanal() {
		if (this.canal < 0) {
			this.ultimoCanal = this.canal;
			setUltimos10Canais(this.canal);
			this.canal = this.canal - 1;
		} else {
			this.canal = 999;
		}
	}

	public Televisao() {
		super();
	}

	public Televisao(int volume, int canal, boolean estado) {
		super();
		this.volume = volume;
		this.canal = canal;
		this.estado = estado;
	}

	public String listarUltimoscanais() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < this.contador; i++) {
			sb.append((i + 1) + " - " + this.ultimos10Canais[i] + "\n");
		}
		return sb.toString();
	}

	@Override
	public String toString() {
		return "Televisao [volume=" + volume + ", canal=" + canal + ", estado=" + estado + "]";
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public int getUltimoCanal() {
		return ultimoCanal;
	}
}
