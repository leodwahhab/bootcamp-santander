import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<PalavrasUnicas> palavrasunicas;

    public void adicionarPalavra(String palavra) {
        palavrasunicas.add(new PalavrasUnicas(palavra));
    }

    public void removerPalavra(String palavra) {
        for(PalavrasUnicas p : palavrasunicas) {
            if(p.getPalavra().equals(palavra)) {
                palavrasunicas.remove(p);
                break;
            }
        }
    }

    public boolean verificarPalavra(String palavra) {
        for(PalavrasUnicas p : palavrasunicas) {
            if(p.getPalavra().equals(palavra)){
                return true;
            }
        }
        return false;
    }

    public String exibirPalavrasUnicas() {
        String s = "";
        for(PalavrasUnicas c : palavrasunicas)
            s += c.getPalavra() + "\n";
        return s;
    }
}
