import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.print("Por favor! Digite o número de sua conta: ");
            int numero = teclado.nextInt();

            System.out.print("Por favor! Digite o número de sua agencia: ");
            String agencia = teclado.next();

            System.out.print("Por favor! Digite o seu nome: ");
            String nomeCliente = teclado.next();

            System.out.print("Por favor! Digite seu saldo: ");
            double saldo = teclado.nextDouble();

            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponivel para saque");
        }
    }
}
