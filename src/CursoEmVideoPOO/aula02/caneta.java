package CursoEmVideoPOO.aula02;

public class caneta {
   public String cor;
   public String modelo;
   private float ponta;
   protected int carga;
   private boolean tampada;

   public void status(){
        System.out.println("Cor: " + this.cor);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Tampada: " + this.tampada);
    }

  public  void rabiscar(){
        if (this.tampada == true){
            System.out.println("erro não posso rabiscar.");
        }else {
            System.out.println("Rabiscando");
        }
    }

   protected void tampar(){
            this.tampada = true;

    }

   protected void desTapar(){
        this.tampada = false;
    }
}
