import java.util.ArrayList;
import java.util.List;

public class ListaTarefas{
    private List<Tarefa> listaTarefas;

    public ListaTarefas() {
        this.listaTarefas = new ArrayList<>();
    }

    public void adicionarTarefas(String descricao) {
        listaTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> descricoes  = new ArrayList<>();

        for(Tarefa t : listaTarefas) {
            if(t.getDescricao().equals(descricao)) {
                descricoes.add(t);
            }
        }

        listaTarefas.removeAll(descricoes);
    }

    public int obterTotalTarefas() {
        return listaTarefas.size();
    }

    public List<String> obterDescricoesTarefas() {
        List<String> descricoes = new ArrayList<>();

        for(Tarefa t : listaTarefas) {
            descricoes.add(t.getDescricao());
        }

        return descricoes;
    }
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        System.out.println(listaTarefas.obterTotalTarefas());

        listaTarefas.adicionarTarefas("passear com o cachorro");
        listaTarefas.adicionarTarefas("fazer a lição de casa");

        System.out.println(listaTarefas.obterTotalTarefas());

        listaTarefas.removerTarefa("fazer a lição de casa");

        System.out.println(listaTarefas.obterTotalTarefas());
    }
}