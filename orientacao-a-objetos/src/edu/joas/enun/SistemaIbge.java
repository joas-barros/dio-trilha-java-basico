package edu.joas.enun;

public class SistemaIbge {
    public static void main(String[] args) {
        for (EstadoBrasileiro estado : EstadoBrasileiro.values()) {
            System.out.println(estado.getSigla() + " - " + estado.getNome());
        }

        EstadoBrasileiro estado = EstadoBrasileiro.valueOf("RIO_GRANDE_DO_NORTE");
        System.out.println("Estado: " + estado.getNome());
        System.out.println("Sigla: " + estado.getSigla());
        System.out.println("IBGE: " + estado.getIbge());
    }
}
