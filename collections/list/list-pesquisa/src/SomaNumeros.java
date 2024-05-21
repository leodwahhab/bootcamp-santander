import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SomaNumeros {
    List<Integer> numeros;

    public SomaNumeros() {
        numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) { numeros.add(numero); }

    public int calcularSoma() {
        int n = 0;
        for(int i : numeros)
            n += i;
        return n;
    }

    public int encontrarMaiorNumero() {
        numeros.sort(null);
        return numeros.getLast();
    }

    public int encontrarMenorNumero() {
        numeros.sort(null);
        return numeros.getFirst();
    }

    public String exibirNumeros() {
        String s = "";
        for(int i : numeros)
            s += i + "\n";
        return s;
    }

    public static void main(String[] args) {
        Random rd = new Random();
        SomaNumeros listaNumeros = new SomaNumeros();

        for(int i = 0; i < 10; i++)
            listaNumeros.adicionarNumero(rd.nextInt(10));

        System.out.println(listaNumeros.exibirNumeros());
        System.out.println("soma: " + listaNumeros.calcularSoma());
        System.out.println("maior: " + listaNumeros.encontrarMaiorNumero());
        System.out.println("menor: " + listaNumeros.encontrarMenorNumero());
        
    }
}
