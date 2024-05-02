import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("digite o primeiro parâmetro: ");
            int n1 = scanner.nextInt();

            System.out.print("digite o segundo parâmetro: ");
            int n2 = scanner.nextInt();

            for(int i = 0; i < validarParametros(n1, n2); i++) {
                System.out.println("contagem: " + (i+1));
            }
        } catch (InputMismatchException e) {
            System.out.println("tipo de dado inválido!");
        } catch (ParametrosInvalidosException e) {
            System.out.println("o segundo parâmetro deve ser maior do que o primeiro!");
        }
        
        scanner.close();
    }

/**
 * @param n1
 * @param n2
 */
    public static int validarParametros(int n1, int n2) throws ParametrosInvalidosException{
        if(n2 < n1)
            throw new ParametrosInvalidosException();
        return (n2 - n1);
    }
}
