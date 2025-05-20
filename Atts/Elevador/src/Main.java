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
        Elevador.Subir();
        Elevador.Subir();
        Elevador.Subir();
        Elevador.Subir();
        Elevador.Subir();
        Elevador.Descer();
        Elevador.Descer();
        Elevador.Descer();
        System.out.println("Andar Atual: " + Elevador.getAndarAtual() +
                             "Pessoas no elevador: " + Elevador.getPessoasPresente());

    }
}
