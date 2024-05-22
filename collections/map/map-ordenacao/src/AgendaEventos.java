import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * AgendaEventos
 */
public class AgendaEventos {

    private Map<LocalDate, Evento> eventos;

    public AgendaEventos() {
        eventos = new HashMap<>();
    }

    public adicionarEvento(LocalDate data, String nome, String atracao) {
        eventos.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosOrganizados = new TreeMap<>(eventos);
    }

    public obterProximoEvento() {
        
    }
}