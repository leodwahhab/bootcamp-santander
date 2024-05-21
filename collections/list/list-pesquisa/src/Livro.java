public class Livro {
    private String titulo;
    private String autor;
    private int ano_publicacao;
    
    public Livro(String titulo, String autor, int ano_publicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano_publicacao = ano_publicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return ano_publicacao;
    }

    @Override
    public String toString() {
        return titulo + " (" + autor + ", " + ano_publicacao + ")\n";
    }
}
