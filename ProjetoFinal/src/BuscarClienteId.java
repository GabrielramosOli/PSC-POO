import java.util.ArrayList;
import java.util.Scanner;

public class BuscarClienteId {
    public void BuscarClienteid(){
        Scanner sc = new Scanner(System.in);
        
        LerClientes lerarquivo = new LerClientes();
        ArrayList<Registro> clientes = lerarquivo.lerClientesDoArquivo();
        Registro registro = new Registro();
        

        String iddebusca;
        System.out.println("Escreva por qual ID você deseja buscar: ");
        iddebusca = sc.next();

        System.out.println("\n==== CLIENTE ENCONTRADO ====");
        for (Registro c : clientes) {
            if (iddebusca.equals(c.getid())) {
                registro.ExibirCliente();
            }
        }
        sc.close();
    }

    

    public Registro BuscarClienteid(String id, ArrayList<Registro> clientes) {
    for (Registro c : clientes) {
        if (id.equals(c.getid())) {
            return c;
        }
    }
    return null;
    }
}

