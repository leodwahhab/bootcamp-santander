public class App {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente("Leonardo");
        Conta cp = new ContaPoupanca("Raphaela");

        cc.depositar(500);
        System.out.println(cc);

        cc.transferir(150, cp);

        System.out.println(cc + "\n" + cp);
    }
}
