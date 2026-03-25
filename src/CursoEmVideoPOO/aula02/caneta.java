package CursoEmVideoPOO.aula02;

public class caneta {
    String cor;
    String modelo;
    float ponta;
    int carga;
    boolean tampada;

    void status(){
        System.out.println("Cor: " + this.cor);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Tampada: " + this.tampada);
    }

    void rabiscar(){
        if (this.tampada == true){
            System.out.println("erro não posso rabiscar.");
        }else {
            System.out.println("Rabiscando");
        }
    }

    void tampar(){
            this.tampada = true;

    }

    void desTapar(){
        this.tampada = false;
    }
}
