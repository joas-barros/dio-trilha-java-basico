package edu.joas.pilares.heranca;

public abstract class ServicoMenssagemInstantanea {
    public abstract void enviarMensagem();
	public abstract void receberMensagem();	

    //somente os filhos conhecem este método
	protected void validarConectadoInternet() {
		System.out.println("Validando se está conectado a internet");
	}
}
