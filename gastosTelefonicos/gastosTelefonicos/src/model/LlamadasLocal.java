package model;

public class LlamadasLocal extends Llamada {

    private long minutoLLamadaLocal;

    public LlamadasLocal(long numeroLlamadas, long duracionLamadas) {
        super(numeroLlamadas, duracionLamadas);
        this.minutoLLamadaLocal = 100;
        calcularCosto();
    }

    public LlamadasLocal(long minutoLLamadaLocal, long numeroLlamadas, long duracionLamadas) {
        super(numeroLlamadas, duracionLamadas);
        this.minutoLLamadaLocal = minutoLLamadaLocal;
    }

    public long getMinutoLLamadaLocal() {
        return minutoLLamadaLocal;
    }

    public void setMinutoLLamadaLocal(long minutoLLamadaLocal) {
        this.minutoLLamadaLocal = minutoLLamadaLocal;
    }

    @Override
    public long calcularCosto() {
        CostoLlamadas = minutoLLamadaLocal * DuracionLlamadas;
        return CostoLlamadas;

    }

}
