import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> agenda;

    public AgendaContatos() {
        agenda = new HashSet<>();
    }

    public void adicionarContato(String nome, int telefone) {
        agenda.add(new Contato(nome, telefone));
    }

    public String exibirContatos() {
        String s = "";
        for(Contato ac : agenda)
            s += "nome: " + ac.getNome() + ", tel.: " + ac.getTelefone() + "\n";
            return s;
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> resultado = new HashSet<>();
        for(Contato ac : agenda) {
            if(ac.getNome().startsWith(nome))
                resultado.add(ac);
        }
        return resultado;
    }

    public void atualizarNumeroContato(String nome, int novoNumero) {
        for(Contato ac : agenda) {
            if(ac.getNome().equalsIgnoreCase(nome)) {
                ac.setTelefone(novoNumero);
                break;
            }
        }
    }
}
