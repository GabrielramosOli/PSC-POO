import java.util.ArrayList;

public class ListaClientes {
    public void ListarClientes(){
        
        LerClientes lerarquivo = new LerClientes();
        ArrayList<Registro> clientes = lerarquivo.lerClientesDoArquivo();

        System.out.println("\n==== CLIENTES LIDOS ====");
        for (Registro c : clientes) {
            System.out.println(c.ExibirCliente());
        }
    }
}

