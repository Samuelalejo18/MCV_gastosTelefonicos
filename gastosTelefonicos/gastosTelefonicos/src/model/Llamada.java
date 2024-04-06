package model;

public class Llamada {

	private long numeroLlamadas;
	protected long DuracionLlamadas;
	protected long CostoLlamadas;

	public Llamada(long numeroLlamadas, long duracionLamadas) {
		super();
		this.numeroLlamadas = numeroLlamadas;
		this.DuracionLlamadas = duracionLamadas;
		
	}

	public long getNumeroLlamadas() {
		return numeroLlamadas;
	}

	public void setNumeroLlamadas(long numeroLlamadas) {
		this.numeroLlamadas = numeroLlamadas;
	} 

	public long getDuracionLamadas() {
		return DuracionLlamadas;
	}

	public void setDuracionLamadas(long duracionLamadas) {
		DuracionLlamadas = duracionLamadas;
	}

	public long getCostoLlamadas() {
		return CostoLlamadas;
	}

	public void setCostoLlamadas(long costoLlamadas) {
		CostoLlamadas = costoLlamadas;
	}

	public long calcularCosto() {
		return 0;
	}

	@Override
	public String toString() {
		return "Llamadas [getNumeroLlamadas()=" + getNumeroLlamadas() + ", getDuracionLamadas()=" + getDuracionLamadas()
				+ ", getCostoLlamadas()=" + getCostoLlamadas() + "]";
	}

}
