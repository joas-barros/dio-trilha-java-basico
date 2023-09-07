package edu.joas.pilares.heranca;

public class Telegram  extends ServicoMenssagemInstantanea{
    public void enviarMensagem() {
        this.validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Telegram");
    }
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Telegram");
    }

}
