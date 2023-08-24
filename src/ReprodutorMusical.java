public class ReprodutorMusical {
    String musica;

    public void tocar() {
        System.out.println("Musica tocando!");
    }

    public void pausar() {
        System.out.println("Musica pausada!");
    }

    public void selecionarMusica(String musica) {
        this.musica = musica; 
        System.out.println("Musica selecionada: " + musica);
    }
}
