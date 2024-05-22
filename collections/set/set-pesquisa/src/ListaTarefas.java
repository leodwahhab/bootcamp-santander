import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefas;

    public ListaTarefas() { this.tarefas = new HashSet<>(); }

    public void adicionarTarefa(String descricao) { tarefas.add(new Tarefa(descricao)); }

    public void removerTarefa(String descricao) {
        for(Tarefa t : tarefas) {
            if(t.getDescricao().equalsIgnoreCase(descricao))
                tarefas.remove(t);
        }
    }

    public String exibirTarefas() {
        String s = "";
        for(Tarefa t : tarefas)
            s += "descrlção: " + t.getDescricao() + ", concluida? " + t.getConcluida() + "\n";
        return s;
    }

    public int contarTarefas() { return tarefas.size(); }


    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> resultado = new HashSet<>();
        for(Tarefa t : tarefas) {
            if(t.getConcluida() == true)
                resultado.add(t);
        }
        return resultado;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> resultado = new HashSet<>();
        for(Tarefa t : tarefas) {
            if(t.getConcluida() == false)
                resultado.add(t);
        }
        return resultado;
    }

    public void marcarTarefaConcluida(String descricao) {
        for(Tarefa t : tarefas) {
            if(t.getDescricao().equalsIgnoreCase(descricao))
                t.setConcluida(true);
        }
    }

    public void marcarTarefaPendente(String descricao) {
        for(Tarefa t : tarefas) {
            if(t.getDescricao().equalsIgnoreCase(descricao))
                t.setConcluida(false);
        }
    }

    public void limparListaTarefas() { tarefas.clear(); }
}
