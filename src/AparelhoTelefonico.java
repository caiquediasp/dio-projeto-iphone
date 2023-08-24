public interface AparelhoTelefonico {
    public default void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    public default boolean atender(boolean escolha) {
         if (escolha) {
            return true;
         } 
         return false;
    }

    public default void iniciarCorreioVoz(String numero) {
        System.out.println("Correio de voz iniciado para: " + numero);
    }
}
