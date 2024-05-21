import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> pessoas;

    public OrdenacaoPessoas() {
        this.pessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, double altura, int idade) {
        pessoas.add(new Pessoa(nome, altura, idade));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> resultado = new ArrayList<>(pessoas);
        Collections.sort(resultado);
        return resultado;
    }

    public void ordenarPorAltura() {
        pessoas.sort(new ComparatorPorAltura());
    }

    @Override
    public String toString() {
        String s ="";
        for(Pessoa p : pessoas) {
            s += p;
        }
        return s;
    }
}