public class NavegadorInternet {
    String urlSite;

    public void exibirPagina(String url) {
        this.urlSite = url;
        System.out.println("Pagina sendo exibida!");
    }

    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada!");
    }

    public void atualizarPagina() {
        System.out.println("Pagina atualizada!");
    }
}
