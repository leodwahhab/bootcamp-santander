import java.util.HashSet;
import java.util.Set;

public class ConviteConvidados {
    private Set<Convidado> convidados;

    public ConviteConvidados() {
        this.convidados = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int cod) {
        convidados.add(new Convidado(nome, cod));
    }

    public void removerConvidadoPorCodigo(int cod) {
        for(Convidado c : convidados) {
            if(c.getCod() == cod) {
                convidados.remove(c);
                break;
            }
        }
    }

    public int contarConvidados() {
        return convidados.size();
    }

    public String exibirConvidados() {
        String s = "";
        for(Convidado c : convidados)
            s += "convidado: " + c.getNome() + " (cod. " + c.getCod() + ")\n";
        return s;
    }
    
    public static void main(String[] args) {
        ConviteConvidados cv = new ConviteConvidados();
        cv.adicionarConvidado("leo", 1);    
        cv.adicionarConvidado("rapha", 2);    
        cv.adicionarConvidado("antonio", 3);    
        cv.adicionarConvidado("matheus", 4);    
        cv.adicionarConvidado("kleber", 5);    

        System.out.println(cv.exibirConvidados());
        
        cv.removerConvidadoPorCodigo(5);
        
        System.out.println(cv.exibirConvidados());
        
    }
}
