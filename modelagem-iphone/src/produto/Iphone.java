package produto;

import funcionalidade.NavegadorInternet;
import funcionalidade.ReprodutorMusical;
import funcionalidade.Telefone;

public class Iphone implements NavegadorInternet, ReprodutorMusical, Telefone {
    public void exibirPagina(String url) {}
    public void adicionarNovaPagina() {}
    public void atualizarPagina() {}

    public void tocar() {}
    public void pausar() {}
    public void selecionarMusica(String musica) {}

    public void ligar(String numero) {}
    public String atender() {
        return "Hello?";
    }
    public void iniciarCorreioVoz() {}
}
