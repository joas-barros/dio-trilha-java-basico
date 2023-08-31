public class TiposEVariaveis {
    public static void main(String[] args) throws Exception {
        // Todos os tipos primitivos do JAVA
        byte idade = 123;
		short ano = 2021;
		int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
		long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo
		float pi = 3.14F;
		double salario = 1275.33;

        // Demonstração da tipagem no javinha
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 5;

		/*
		 * na linha abaixo iremos alterar o valor do varíavel para 10 observe que o tipo
		 * não é mais necessário, pois a variável já foi declarada anteriormente
		 */
		numero = 10;

		System.out.println(numero);

		// Constante declarada, não pode ser alterada
		final double VALOR_DE_PI = 3.14;
    }
}
