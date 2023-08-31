package edu.joas.operadores;

public class Ternario {
    public static void main(String[] args) {
        int a, b;

        a = 5;
        b = 6;

        String resultado = "";
        // EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
        /* 
        if(a==b){
            resultado = "verdadeiro";
        }
        else{
            resultado = "falso";
        }
        */

        // EXEMPLO DE CONDICIONAL UTILIZANDO UM TERNÁRIO
        resultado = a==b ? "verdadeiro" : "falso";
        System.out.println(resultado);
    }
}
