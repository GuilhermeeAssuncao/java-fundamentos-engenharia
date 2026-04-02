package CursoEmVideoPOO.aula02;

public class aula2 {
    public static void main(String[] args){
        caneta c1 = new caneta();
        c1.modelo = "Bic Cristal";
        c1.cor = "Azul";
//        c1.ponta = 0.5f;
        c1.carga = 80;
        c1.desTapar();
        c1.status();
        c1.rabiscar();

        System.out.println("---------------------------------------------");
        caneta c2 = new caneta();
        c2.modelo = "Assunta";
        c2.cor = "verde";
//        c2.ponta = 0.7f;
        c2.tampar();
        c2.status();
        c2.rabiscar();

        System.out.println("-------------------------------------------------");

        livro l1 = new livro();
        l1.nome = "filoteia";
        l1.cor = "vermelho";
        l1.paginas = 386;
        l1.fechar();
        l1.status();
        l1.ler();

    }
}
