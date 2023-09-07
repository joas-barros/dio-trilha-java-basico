package edu.joas.pilares.heranca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(
                    "Escolha uma das opções abaixo:\n1 - Enviar mensagem pelo MSN Messenger\n2 - Enviar mensagem pelo Facebook Messenger\n3 - Enviar mensagem pelo Telegram");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    ServicoMenssagemInstantanea msn = new Zubalo();
                    msn.enviarMensagem();
                    msn.receberMensagem();
                    break;
                case 2:
                    ServicoMenssagemInstantanea facebook = new Facebook();
                    facebook.enviarMensagem();
                    facebook.receberMensagem();
                    break;
                case 3:
                    ServicoMenssagemInstantanea telegram = new Telegram();
                    telegram.enviarMensagem();
                    telegram.receberMensagem();
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }
}
