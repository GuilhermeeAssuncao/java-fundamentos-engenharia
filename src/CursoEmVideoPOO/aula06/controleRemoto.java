package CursoEmVideoPOO.aula06;

public class controleRemoto extends controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;

    // metodos especiais


    public controleRemoto() {
        setVolume(50);
        setLigado(false);
        setTocando(false);
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean isLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean isTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    //sobre escrevendo metodos
}
