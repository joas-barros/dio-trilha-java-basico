package telefone;

public class Phone implements Telefone{
    @Override
    public void ligar() {
        System.out.println("Ligando para o número");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }
    
}
