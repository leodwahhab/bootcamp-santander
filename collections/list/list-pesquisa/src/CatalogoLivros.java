import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> catalogo;

    public CatalogoLivros() {
        catalogo = new ArrayList<>();
    }

    public void adicionarLivros(String titulo, String autor, int ano_publicacao) {
        catalogo.add(new Livro(titulo, autor, ano_publicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> listaResultado = new ArrayList<>();
        if(!catalogo.isEmpty()) {
            for(Livro l : catalogo) {
                if(l.getAutor().equalsIgnoreCase(autor))
                    listaResultado.add(l);
            }
        }
        return listaResultado;
    }

    public List<Livro> pesquisarPorIntervaloAno(int ano_min, int ano_max) {
        List<Livro> listaResultado = new ArrayList<>();
        if(!catalogo.isEmpty()) {
            for(Livro l : catalogo) {
                if(l.getAnoPublicacao() >= ano_min && l.getAnoPublicacao() <= ano_max)
                    listaResultado.add(l);
            }
        }
        return listaResultado;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        if(!catalogo.isEmpty()) {
            for(Livro l : catalogo) {
                if(l.getTitulo().equalsIgnoreCase(titulo))
                    return l;
                
            }
        }
        return null;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogo = new CatalogoLivros();

        catalogo.adicionarLivros("A Metamorfose", "Franz Kafka", 1915);
        catalogo.adicionarLivros("A Novela", "Franz Kafka", 1918);
        catalogo.adicionarLivros("1987", "George Orwell", 1945);

        for(Livro l : catalogo.pesquisarPorAutor("Franz Kafka"))
            System.out.println(l);
        
        System.out.println(catalogo.pesquisarPorTitulo("A metamorfose"));      
    }
}
