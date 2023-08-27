package edu.joas.operadores;
public class OperadoresUnarios {
    public static void main(String[] args) {
        int numero = 5;

        numero = - numero;
        
        System.out.println(numero);

        numero = numero * -1;

        System.out.println(numero);

        // Repetição
        numero = 5;

        numero++;
        // numero += 1;

        System.out.println(++numero);
        // incrementa e depois imprime

        System.out.println(numero++);
        // imprime e depois incrementa

        // TEMBEM SERVE PARA DECREMENTO
        System.out.println(--numero);

        System.out.println(numero--);
        

        // Invertendo valores booleanos
        boolean variavel = true;
        variavel = !variavel;
        System.out.println(variavel);
    }
}
