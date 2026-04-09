package CursoEmVideoPOO.aula06;

public class controleRemoto implements controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;

    // metodos especiais


    public controleRemoto() {
        setVolume(50);
        setLigado(true);
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

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("----------MENU----------");
        System.out.println("Esta ligado: " +this.isLigado());
        System.out.println( "Esta tocando: " +this.isTocando());
        System.out.print("Volume " +this.getVolume());
        for (int i =0 ; i <= this.getVolume(); i+=10) { System.out.print(" ()");}

    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu");

    }

    @Override
    public void maisVolume() {
        if ( this.isLigado() ) {
            this.setVolume(this.getVolume() + 5);
        }else {
            System.out.println("Impossivel aumentar volume");
        }
    }

    @Override
    public void menosVolume() {
        if (this.isLigado() ) {
            this.setVolume(this.getVolume() -5);
        }else {
            System.out.println("Impossivel Diminuir volume");
        }
    }

    @Override
    public void ligarMudo() {
        if(this.ligado  && this.getVolume() > 0){
            this.setVolume(0);
        }

    }

    @Override
    public void desligarMudo() {
        if (this.ligado  && this.getVolume() == 0) {
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.isLigado() && !(this.isTocando())){
            this.setTocando(true);
        }else {
            System.out.println("Impossivel dar play");
        }
    }

    @Override
    public void pause() {
        if (this.isLigado() && this.isTocando()){
            this.setTocando(false);
        } else{
            System.out.println("Impossivel pausar");
        }
    }


}
