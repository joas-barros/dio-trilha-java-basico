package edu.joas.pilares.heranca;

public class Facebook extends ServicoMenssagemInstantanea {
    public void enviarMensagem() {
        this.validarConectadoInternet();
		System.out.println("Enviando mensagem pelo Facebook Messenger");
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Facebook Messenger");
	}
}
