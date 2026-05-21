package mes2_ESTRUTURA.semana1.dia2;

public class ProdutoRepository {
    public void salvarProduto(Produto produto){
        System.out.println("Salvando o produto " + produto.getNome());
    }

    public void listarProdutos(Produto produto){
        System.out.println(produto.getNome());
        System.out.println(produto.getPreco());
        System.out.println(produto.getEstoque());
    }
}
