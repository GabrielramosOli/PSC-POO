public class ContaBancaria {
    private int numconta;
    private String titular;
    private double saldo;

    public ContaBancaria(int numconta, String titular, double saldoinicial){
        this.numconta = numconta;
        this.titular = titular;
        this.saldo = saldoinicial;
    }
    public int getNumConta(){
        return numconta;
    }
    public void setNumConta(int numconta){
        this.numconta = numconta;
    }
    public String getTitular(){
        return titular;
    }
    public void setTitular(String titular){
        this.titular = titular;
    }
    public double getConsultarSaldo(){
        return saldo;
    }
    public void depositar(double valor){
        saldo += valor;
    }
    public boolean sacar(double valor){
        if (valor <= saldo) {
            saldo -= valor;
            return true;
        } else {
            System.out.println("Você não possui saldo suficiente para realizar o saque.");
            return false;
        }
    }
}