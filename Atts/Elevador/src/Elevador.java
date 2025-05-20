public class Elevador {

    public Elevador(int par, int par1) {
    }
    private int andarAtual;
    private int capacidadeElevador;
    private int pessoasPresente;
    private int andares;

    public void inicializar(int cpe,int a){
        this.andarAtual = 0;
        this.capacidadeElevador = cpe;
        this.pessoasPresente = 0;
        this.andares = a;
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getCapacidadeElevador() {
        return capacidadeElevador;
    }

    public void setCapacidadeElevador(int capacidadeElevador) {
        this.capacidadeElevador = capacidadeElevador;
    }

    public int getPessoasPresente() {
        return pessoasPresente;
    }

    public void setPessoasPresente(int pessoasPresente) {
        this.pessoasPresente = pessoasPresente;
    }

    public int getAndares() {
        return andares;
    }

    public void setAndares(int andares) {
        this.andares = andares;
    }
    
    public void Entrar(){
        if (pessoasPresente < capacidadeElevador) {
            pessoasPresente++;
        } else {
            System.out.println("Elevador ja esta cheio!");
        }
    }

    public void Sair(){
        if (pessoasPresente > 0) {
            pessoasPresente--;
        } else {
            System.out.println("Elvador ja esta vazio");
        }
    }

    public void subir(){
        if (andarAtual < andares) {
            andarAtual++;
        } else {
            System.out.println("Voce ja esta no ultimo andar!");
        }
    }

    public void descer(){
        if (andarAtual > 0) {
            andarAtual--;
        } else {
            System.out.println("Voce ja esta no terreo");
        }
    }
}
