import java.util.List;

public class AparelhoTelefonico {
    List <String> contatos;

    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    public boolean atender(String escolha) {
         if (escolha == "YES") {
            return true;
         } 
         return false;
    }

    public void iniciarCorreioVoz(String numero) {
        System.out.println("Correio de voz iniciado para: " + numero);
    }
}
