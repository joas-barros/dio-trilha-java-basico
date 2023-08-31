package edu.joas.repeticao;

public class ExemploBreakContinue {
    public static void main(String[] args) {
        for (int numero = 1; numero <= 5; numero++){
            if (numero == 3){
                break;
            }
            System.out.println(numero);
        }

        System.out.println("==========");
        
        for (int x=1; x<=10; x++){
            if (x == 3 || x == 7){
                continue;
            }
            System.out.println(x);
        }
    }
}
