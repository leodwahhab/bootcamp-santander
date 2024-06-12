public abstract class Conta {
    protected double saldo;
    protected int agencia;
    protected int numero;
    protected Cliente cliente;

    protected static final int AGENCIA_PADRAO = 0001;
    protected static int SEQUENCIAL = 0; //estática pq é relacionada à classe conta e não à sua estância

    public Conta(String nome) {
        agencia = Conta.AGENCIA_PADRAO;
        numero = SEQUENCIAL++;
        cliente = new Cliente(nome);
    }

    public int getAgencia() {
        return this.agencia;
    }

    public int getNumero() {
        return this.numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }

    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public String toString() {
        return "conta: " + SEQUENCIAL + " | " +  cliente + " | saldo: " + getSaldo();
    }
}
