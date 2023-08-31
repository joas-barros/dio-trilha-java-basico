package edu.joas.operadores;

public class Logicos {
    public static void main(String[] args) {
        boolean condicao1 = true;
        boolean condicao2 = true;

        if (condicao1 && condicao2){
            System.out.println("As duas condições são verdadeiras");
        } else if (condicao1 || condicao2){
            System.out.println("Ao menos uma das condições é verdadeiras");
        } else {
            System.out.println("Nenhuma das condições é verdadeira");
        }

        System.out.println("FIM!!!!");
    }
}
