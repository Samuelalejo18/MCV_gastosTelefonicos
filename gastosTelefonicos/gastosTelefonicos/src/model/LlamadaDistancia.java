package model;

public class LlamadaDistancia extends Llamada {

	private long minutoLLamadaDistancia;

	public LlamadaDistancia(long numeroLlamadas, long duracionLamadas) {
		super(numeroLlamadas, duracionLamadas);
		this.minutoLLamadaDistancia = 150;
		calcularCosto();
	}

    public LlamadaDistancia(long minutoLLamadaDistancia, long numeroLlamadas, long duracionLamadas) {
        super(numeroLlamadas, duracionLamadas);
        this.minutoLLamadaDistancia = minutoLLamadaDistancia;
    }

	

	public long getMinutoLLamadaDistancia() {
		return minutoLLamadaDistancia;
	}

	public void setMinutoLLamadaDistancia(long minutoLLamadaDistancia) {
		this.minutoLLamadaDistancia = minutoLLamadaDistancia;
	}
	
	@Override
	public long calcularCosto() {
		CostoLlamadas = minutoLLamadaDistancia * DuracionLlamadas;
		return CostoLlamadas;
	
}

}