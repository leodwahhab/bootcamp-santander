import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoque;

    public EstoqueProdutos() {
        estoque = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        estoque.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirEstoque() {
        System.out.println(estoque);
    }

    public double calcularValorTotal() {
        double v = 0;
        if(!estoque.isEmpty()) {
            for(Produto p : estoque.values()) {
                v += p.getPreco() * p.getQuantidade();
            }
        }
        return v;
    }

    public Produto obterPodutoMaisCaro() {
        Produto produto = null;
        double maior = Double.MIN_VALUE;
        for(Produto p : estoque.values()) {
            if(p.getPreco() > maior) {
                produto = p;
            }
        }
        return produto;
    }
}
