package edu.joas.pilares.heranca;

public class Zubalo extends ServicoMenssagemInstantanea {
    public void enviarMensagem() {
		this.validarConectadoInternet();
		System.out.println("Enviando mensagem pelo MSN Messenger");
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo MSN Messenger");
	}
}
