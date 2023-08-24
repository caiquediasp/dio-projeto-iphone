public interface NavegadorInternet {
    public default void exibirPagina(String url) {
        System.out.println("Pagina sendo exibida!");
    }

    public default void adicionarNovaAba() {
        System.out.println("Nova aba adicionada!");
    }

    public default void atualizarPagina() {
        System.out.println("Pagina atualizada!");
    }
}
