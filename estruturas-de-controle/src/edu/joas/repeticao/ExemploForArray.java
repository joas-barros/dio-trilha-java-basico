package edu.joas.repeticao;

public class ExemploForArray {
    public static void main(String[] args) {
        String alunos [] =  {"FELIPE","JONAS","JULIA","MARCOS"};

        //Forma Normal
        for (int x=0; x<alunos.length; x++){
            System.out.println("O aluno de indice " + x + " é: " + alunos[x]);
        }
	
        //Forma abreviada (For Each)
        for(String aluno : alunos) {
        System.out.println(aluno);
        }
    }
}
