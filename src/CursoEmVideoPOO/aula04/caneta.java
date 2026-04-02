package CursoEmVideoPOO.aula04;

public class caneta {
    public String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;

    public caneta(float ponta, boolean tampada, String cor) {
        this.ponta = ponta;
        this.tampada = tampada;
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Tampada: " + this.tampada);
        System.out.println("Cor: " + this.cor);
    }
}

