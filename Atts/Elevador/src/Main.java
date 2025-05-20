public class Main {
    public static void main(String[] args) throws Exception {
        Elevador Elevador = new Elevador(5, 10);
        Elevador.Entrar();
        Elevador.Entrar();
        Elevador.Entrar();
        Elevador.Entrar();
        Elevador.Entrar();
        Elevador.Entrar();
        Elevador.Entrar();
        Elevador.Entrar();
        Elevador.Sair();
        Elevador.Sair();
        Elevador.Sair(); 
        Elevador.Sair();
        System.out.println("Andar Atual: " + Elevador.getAndarAtual() +
                             "Pessoas no elevador: " + Elevador.getPessoasPresente());

    }
}
