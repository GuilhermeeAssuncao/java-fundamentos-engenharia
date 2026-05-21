package mes2_ESTRUTURA.semana1.dia2;

public class Produto {
    private String nome;
    private double preco;
    private int estoque;

    //metodos
    public void alterarPreco(double p){
    if (p > 0){
        this.preco = p;
    }else {
        System.out.println("preço negativo altere novamente");
    }
    }

    public void addEstoque(int n){
        if (n > 0){
            this.estoque += n;
        }else  {
            System.out.println("estoque negativo altere novamente");
        }
    }

    public void removerEstoque(int n){
        if (n <= estoque){
            this.estoque -= n;
        }else{
            System.out.println("não temos essa quantidade!");
        }
    }


    //metodos especiais


    public Produto(String nome, double preco, int estoque) {
        this.nome = nome;
       if (this.preco > 0){
           this.preco = preco;
       }
        if (this.estoque >= 0){
            this.estoque = estoque;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getEstoque() {
        return estoque;
    }
}
