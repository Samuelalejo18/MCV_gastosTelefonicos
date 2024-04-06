package model;

public class LlamadaCelular extends Llamada {

	private long minutoLLamadaCelular;

	public LlamadaCelular(long numeroLlamadas, long duracionLamadas) {
		super(numeroLlamadas, duracionLamadas);
		this.minutoLLamadaCelular = 200;
		calcularCosto();
	}

    public LlamadaCelular(long minutoLLamadaCelular, long numeroLlamadas, long duracionLamadas) {
        super(numeroLlamadas, duracionLamadas);
        this.minutoLLamadaCelular = minutoLLamadaCelular;
    }

	

	public long getMinutoLLamadaLocal() {
		return minutoLLamadaCelular;
	}

	public void setMinutoLLamadaLocal(long minutoLLamadaLocal) {
		this.minutoLLamadaCelular = minutoLLamadaLocal;
	}

	@Override
	public long calcularCosto() {
		CostoLlamadas = minutoLLamadaCelular * DuracionLlamadas;
		return CostoLlamadas;

	}

}
