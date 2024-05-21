import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> carrinho;

    public CarrinhoDeCompras() {
        carrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        carrinho.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> item = new ArrayList<>();

        for(Item c : carrinho) {
            if(c.getNome().equals(nome))
                item.add(c);
        }

        carrinho.removeAll(item);
    }

    public double calcularValorTotal() {
        double valor_total = 0;
        for(Item c : carrinho) {
            valor_total += c.getPreco() * c.getQuantidade();
        }
        return valor_total;
    }

    public String exibirItens() {
        String s = "";
        for(Item c : carrinho) {
            s += "item: " + c.getNome() + " | preco: R$ " + String.format("%.2f",c.getPreco()) + " | quantidade: " + c.getQuantidade() + "\n";
        }
        return s;
    }

    public static void main(String[] args) {
        CarrinhoDeCompras car = new CarrinhoDeCompras();
        
        car.adicionarItem("caixa de leite", 1.25, 3);
        car.adicionarItem("pc gamer", 4000, 1);

        System.out.println(car.exibirItens());
    }
}
