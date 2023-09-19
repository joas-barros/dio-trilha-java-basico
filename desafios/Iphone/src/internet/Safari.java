package internet;

public class Safari implements Internet{
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página no Safari");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no Safari");
    }

    @Override
    public void atualizarAba() {
        System.out.println("Atualizando aba no Safari");
    }
}
