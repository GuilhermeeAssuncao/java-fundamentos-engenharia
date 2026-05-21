package mes2_ESTRUTURA.semana1.dia2;

public class Main {
    public static void main(String[] args){
    ProdutoRepository produtoRepository = new ProdutoRepository();

    Produto p = new Produto("jarro", 12.3f,21);

    p.alterarPreco(12.3f);
    p.addEstoque(3);
    p.removerEstoque(2);
    produtoRepository.salvarProduto(p);
    produtoRepository.listarProdutos(p);
    }
}
