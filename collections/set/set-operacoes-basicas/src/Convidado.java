public class Convidado {
    private String nome;
    private int cod;

    public Convidado(String nome, int cod) {
        this.nome = nome;
        this.cod = cod;
    }

    public int getCod() {
        return cod;
    }

    public String getNome() {
        return nome;
    }
}
