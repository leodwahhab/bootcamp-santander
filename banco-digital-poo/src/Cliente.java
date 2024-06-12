public class Cliente {
    private String nome;
    private static int CPF = 123456700;

    public Cliente(String nome) {
        CPF++;
        this.nome = nome;
    }

    public int getCpf() {
        return CPF;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "cliente: " + getNome() + " | cpf: " + getCpf();
    }
}
