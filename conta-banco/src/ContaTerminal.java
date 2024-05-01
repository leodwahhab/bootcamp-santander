import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Por favor, digite o numero da agencia: ");
        int numero = scanner.nextInt();

        scanner.nextLine(); //ignorar

        System.out.print("Por favor, digite a agencia: ");
        String agencia = scanner.nextLine();
        
        System.out.print("Por favor, digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Por favor, digite o saldo da conta: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá, " + nome + ". Obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo R$ " + String.format("%.2f", saldo) + " já está disponível para saque");

        scanner.close();
    }
}
