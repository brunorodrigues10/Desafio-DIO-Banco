public class Conta implements Transacoes {

    private static final int AGENCIA = 1;
    private static int SEQUENCIAL = 1;

    private int agencia;
    private int numero;
    private double saldo;
    private String cliente;


    public Conta(String cliente) {
        this.cliente = cliente;
        this.numero = SEQUENCIAL++;
        this.agencia = Conta.AGENCIA;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }



    protected void imprimirInfo() {
        System.out.println("=====================");
        System.out.println("Titular: " + this.cliente);
        System.out.println("Agência: " + this.agencia);
        System.out.println("Número: " + this.numero);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("=====================");
    }

    @Override
    public void sacar(double valor) {
        if (this.saldo < valor){
            System.out.println("Saldo Insuficiente");
        }else{
            this.saldo = saldo - valor;
        }

    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void transferir(double valor, Conta contaDestino) {
        if (this.saldo < valor){
            System.out.println("Transação bloqueada! Saldo insuficiente");
        }else{
            this.sacar(valor);
            contaDestino.depositar(valor);
        }

    }

    @Override
    public void imprimirExtrato() {
        System.out.println(this.getSaldo());
    }
}
