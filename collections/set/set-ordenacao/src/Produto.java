import java.util.Comparator;

public class Produto implements Comparable<Produto>{
    private String nome;
    private double preco;
    private long cod;
    private int quantidade;

    public Produto(String nome, double preco, long cod, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.cod = cod;
        this.quantidade = quantidade;
    }

    public long getCod() {
        return cod;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto produto)) return false;
        return getCod() == produto.getCod();
    }

    @Override
    public int compareTo(Produto o) {
        return nome.compareToIgnoreCase(o.nome);
    }
}

class ComparatorPreco implements Comparator<Produto> {

    @Override
    public int compare(Produto o1, Produto o2) {
        // TODO Auto-generated method stub
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}
