package CursoEmVideoPOO.aula07AND8;

import java.util.Random;

public class Luta  {
    private  Lutador desafiado;
    private  Lutador desafiante;
    private int rouds;
    private boolean aprovada;


    public void marcarLuta(Lutador l1, Lutador l2) {
       if (l1.getCategoria().equals( l2.getCategoria()) && l1 != l2) {
               aprovada = true;
               desafiante = l2;
               desafiado = l1;
       }else {
           aprovada = false;
           desafiante = null;
           desafiado = null;
       }
    }

    public void lutar(){
        if (this.aprovada){
            System.out.println("###Desafiado###");
            this.desafiado.apresentar();
            System.out.println("###Desafiante###");
            this.desafiante.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); //0 1 2

            System.out.println("=====Resulyado da luta=====");
            switch (vencedor){
                case 0: // empate
                    System.out.println("Empatou");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1: // desafiado ganha
                    System.out.println(this.desafiado.getNome() + " Ganhou a luta");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2: // desafiante ganha
                    System.out.println(this.desafiante.getNome() + " Ganhou a luta");
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            }
            System.out.println("==================");
        }else {
            System.out.println("Luta não pode acotecer");
        }
    }

    // metodos especiais
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRouds() {
        return rouds;
    }

    public void setRouds(int rouds) {
        this.rouds = rouds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
