package edu.joas.condicional;

// Modo condicional switch / case
// Como não tem o break ele imprimir tudo depois que a condição é verdadeira

public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "T"; // M / T

		switch (plano) {
			case "T": {
				System.out.println("5Gb Youtube");
			}
			case "M": {
				System.out.println("WhatsApp e Instagram grátis");
			}
			case "B": {
				System.out.println("100 minutos de ligação");
			}
            default:
                System.out.println("Não tem esse plano rei");
		}
    }
}
