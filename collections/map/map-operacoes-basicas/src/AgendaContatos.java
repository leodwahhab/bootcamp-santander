import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agenda;

    public void AgendaContatos() {
        agenda = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agenda.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if(!(agenda.isEmpty())) {
            agenda.remove(nome);
        }
    }

    public String exibirContatos() {
        return agenda + "";
    }

    public Integer pesquisarPorNome(String nome) {
        if(!(agenda.isEmpty())) {
            return agenda.get(nome);
        }
        return null;
    }
}
