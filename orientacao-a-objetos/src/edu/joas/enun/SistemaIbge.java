package edu.joas.enun;

public class SistemaIbge {
    public static void main(String[] args) {
        for (EstadoBrasileiro estado : EstadoBrasileiro.values()) {
            System.out.println(estado.getSigla() + " - " + estado.getNome());
        }

        EstadoBrasileiro estado = EstadoBrasileiro.valueOf("PIAUI");
        System.out.println("Estado: " + estado.getNome());
    }
}
