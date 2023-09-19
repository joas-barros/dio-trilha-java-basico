import internet.Internet;
import reprodutormusical.ReprodutorMusical;
import telefone.Telefone;

public class IPhone implements Telefone, Internet, ReprodutorMusical{

    @Override
    public void ligar() {
        System.out.println("Ligando o IPhone");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo uma chamada no IPhone");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz no IPhone");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página no IPhone");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no IPhone");
    }

    @Override
    public void atualizarAba() {
        System.out.println("Atualizando aba no IPhone");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música no IPhone");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música no IPhone");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música no IPhone");
    }
    
}
