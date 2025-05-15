public class Main {
    public static void main(String[] args) throws Exception {
        ContaBancaria Joao = new ContaBancaria(2200, "João", 300.0);
        System.out.println("Saldo inicial " +Joao.getTitular() + ": " + Joao.getConsultarSaldo());
        boolean ok = Joao.sacar(200.0);
        System.out.println("Tentativa de saque de R$ 200: " + (ok? "Bem sucedida" : "Invalida"));
        Joao.depositar(1000.0);
        System.out.println("Saldo final " + Joao.getTitular()+ ": " + Joao.getConsultarSaldo());
        ContaBancaria Sophia = new ContaBancaria(1100, "Sophia", 600.0);
        System.out.println("Saldo inicial " + Sophia.getTitular() + ": " + Sophia.getConsultarSaldo());
        Sophia.depositar(250.0);
        System.out.println("Após depósito de R$150: " + Sophia.getConsultarSaldo());
        boolean okay = Sophia.sacar(900.0);
        System.out.println("Tentativa de saque de R$700: " + (okay ? "sucesso" : "falha"));
        System.out.println("Saldo " + Sophia.getTitular() + ": " + Sophia.getConsultarSaldo());
        Sophia.depositar(50.0);
        System.out.println("Apos deposito de R$ 50: " + Sophia.getConsultarSaldo());
        boolean oky = Sophia.sacar(900);
        System.out.println("Tentativa de saque de R$700: " + (oky ? "sucesso" : "falha"));
        System.out.println("Saldo final " + Sophia.getTitular() + ": " + Sophia.getConsultarSaldo());
    }
}
