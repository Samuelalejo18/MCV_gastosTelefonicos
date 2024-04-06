package controller;

import java.util.ArrayList;

import model.Llamada;
import model.LlamadaCelular;
import model.LlamadaDistancia;
import model.LlamadasLocal;
import view.Ventana;

public class Controller {

    ArrayList<Llamada> llamadas = new ArrayList<>();
    Ventana objV = new Ventana();

    public void funcionar() {
        registrarLlamadas();

        int opcion = -1;
        while (opcion != 0) {
            objV.mostrarOpciones();
            opcion = objV.pedirOpcion();

            switch (opcion) {
                case 1:

                    LlamadasLocal objLocal = new LlamadasLocal(objV.pedirNumeroLlamadas(),
                            objV.pedirDuracionLlamadas());
                    llamadas.add(objLocal);
                    break;
                case 2:
                    LlamadaDistancia objDistancia = new LlamadaDistancia(objV.pedirNumeroLlamadas(),
                            objV.pedirDuracionLlamadas());
                    llamadas.add(objDistancia);
                    break;
                case 3:
                    LlamadaCelular objCelular = new LlamadaCelular(objV.pedirNumeroLlamadas(),
                            objV.pedirDuracionLlamadas());
                    llamadas.add(objCelular);
                    break;
                default:

            }
        }

        objV.imprimirTitulo();

        for (Llamada llamada : llamadas) {
            String tipoLlamada = hallarTipoLlamada(llamada);
            int tipoCosto = hallarCostoMinuto(llamada);
            objV.imprimirTabla(tipoLlamada, llamada.getNumeroLlamadas(), llamada.getDuracionLamadas(), tipoCosto,
                    llamada.getCostoLlamadas());
        }

    }

    public String hallarTipoLlamada(Llamada llamada) {
        String tl = "No existe";
        if (llamada instanceof LlamadaCelular) {
            tl = "llamada Celular";

        } else if (llamada instanceof LlamadaDistancia) {
            tl = "Llamada Distancia";

        } else if (llamada instanceof LlamadasLocal) {
            tl = "Llamada Local";

        } else if (llamada instanceof Llamada) {
            tl = "Llamada";

        }
        return tl;

    }

    public int hallarCostoMinuto(Llamada llamada) {
        int tl = 0;
        if (llamada instanceof LlamadaCelular) {
            tl = 200;

        } else if (llamada instanceof LlamadaDistancia) {
            tl = 150;

        } else if (llamada instanceof LlamadasLocal) {
            tl = 100;

        } else if (llamada instanceof Llamada) {
            tl = 0;

        }
        return tl;

    }

    public void registrarLlamadas() {
        llamadas.add(new Llamada(10, 50));
        llamadas.add(new LlamadaCelular(5, 300));
        llamadas.add(new LlamadaDistancia(4, 100));
        llamadas.add(new LlamadasLocal(3, 60));
    }
}
