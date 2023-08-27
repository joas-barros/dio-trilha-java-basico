package edu.joas.operadores;

public class Relacional {
    public static void main(String[] args) {
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        System.out.println("Número1 é igual a Numero2? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("Número1 é diferente de Numero2? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("Número1 é maior que o Numero2? " + simNao);

        simNao = numero1 < numero2;

        System.out.println("Número1 é menor que o Numero2? " + simNao);
    }
}
