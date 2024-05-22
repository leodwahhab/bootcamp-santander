import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    Set<Produto> produtos;

    public CadastroProdutos() {
        this.produtos = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        produtos.add(new Produto(nome, preco, cod, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> resultado = new TreeSet<>(produtos);
        return resultado;
    }

    public Set<Produto> exibiProdutosPorPreco() {
        Set<Produto> resultado = new TreeSet<>(new ComparatorPreco());
        return resultado;
    }
    //         Crie uma classe chamada "CadastroProdutos" que possui um conjunto de objetos do tipo "Produto" como atributo. Cada produto possui atributos como nome, cod, preço e quantidade. Implemente os seguintes métodos:

// adicionarProduto(long cod, String nome, double preco, int quantidade): Adiciona um produto ao cadastro.
// exibirProdutosPorNome(): Exibe todos os produtos do cadastro em ordem alfabética pelo nome.
// exibirProdutosPorPreco(): Exibe todos os produtos do cadastro em ordem crescente de preço.
}
