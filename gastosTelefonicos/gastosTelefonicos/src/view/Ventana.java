package view;

import java.util.Scanner;

public class Ventana {
    static Scanner sc = new Scanner(System.in);

    public void mostrarOpciones() {
        System.out.println("Bien venido al sistema de llamadas ");
        System.out.println("Selecione tipo de llamada:");
        System.out.println("1. Llamada local: ");
        System.out.println("2.Llamada larga Distancia: ");
        System.out.println("3. Llamada celular: ");
        System.out.println("0.Mostrar tabla de llamadas: ");
        System.out.println("\n");

    }

    public int pedirOpcion() {
        int opcion = sc.nextInt();
        return opcion;
    }

    public long pedirNumeroLlamadas() {
        System.out.println("Ingrege numero de llamadas: ");
        long numeroLlamadas = sc.nextInt();
        return numeroLlamadas;
    }

    public long pedirDuracionLlamadas() {
        System.out.println("Ingregese duracion llamada:  ");
        long duracionLlamadas = sc.nextInt();
        return duracionLlamadas;
    }

    public static void imprimirTabla(String tipoLlamada, long numeroTotalLlamadas, long duracionLlamadas,
            long costoPromedioPorMinuto, long costoLlamadas) {
        System.out.format("%20s %20d  %20d %20d %20d %n ", tipoLlamada, numeroTotalLlamadas, duracionLlamadas,
                costoPromedioPorMinuto, costoLlamadas);
                System.out.println(
                    "-----------------------------------------------------------------------------------------------------------------");
    }

    public static void imprimirTitulo() {
        System.out.println(
            "-----------------------------------------------------------------------------------------------------------------");
        System.out.format("%20s %20s  %20s %20s %20s %n ", "Tipo llamada", "Numero total llamadas", "Duracion llamadas",
                "Costo promedio por minuto", "Costo llamadas");
        System.out.println(
                "-----------------------------------------------------------------------------------------------------------------");
    }

}
