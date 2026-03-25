package CursoEmVideoPOO.aula02;

public class livro {
    String nome;
    int paginas;
    String cor;
    boolean aberto;


    void status(){
        System.out.println("Nome do livro: " + this.nome);
        System.out.println("Paginas: " + this.paginas);
        System.out.println("Cor: " + this.cor);
        System.out.println("Aberto: " + this.aberto);
    }

    void abrir(){
        this.aberto = true;
    }

    void fechar(){
        this.aberto = false;

    }

    void ler(){
        if( this.aberto == true){
            System.out.println("estou lendo");
        }else {
            System.out.println("erro o livro esta fechado");
        }
    }
}
