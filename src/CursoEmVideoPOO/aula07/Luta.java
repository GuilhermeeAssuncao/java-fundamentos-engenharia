package CursoEmVideoPOO.aula07;

public class Luta {
    private String desafiado;
    private String desafiante;
    private int rouds;
    private boolean aprovada;


    public void marcarLuta(){

    }

    public void lutar(){
        System.out.println("O " + this.getDesafiado() + " esta lutando com o" +
                this.getDesafiante());
    }

    public String getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(String desafiado) {
        this.desafiado = desafiado;
    }

    public String getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(String desafiante) {
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
