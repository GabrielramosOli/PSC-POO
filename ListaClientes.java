import java.util.ArrayList;

public class ListaClientes {
    public void ListarClientes(){
        
        LerClientes lerarquivo = new LerClientes();
        ArrayList<Registro> clientes = lerarquivo.lerClientesDoArquivo();
        Registro registro = new Registro();

        System.out.println("\n==== CLIENTES LIDOS ====");
        for (Registro c : clientes) {
            registro.ExibirCliente();
        }
    }
}

