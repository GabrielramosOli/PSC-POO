import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<CadastrarCLiente> clientes = new ArrayList<>();
        int escolha;
        do {
            System.out.println("Selicione uma das seguintes opções: ");
            System.out.println(
                    "1. Criar novo registro\n2. Listar todos os registros\n3. Buscar registro (por Id)\n4. Editar registro\n5. Excluir registro\n6. Sair");
            escolha = sc.nextInt();
            switch (escolha) {
                case 1:
                    CadastrarCLiente cadastro = new CadastrarCLiente();
                    CadastrarCLiente.Cadastrar();
                    CadastrarCLiente.Gravar();
                    clientes.add(cadastro);
                    break;
                case 2:
                    ListaClientes listar = new ListaClientes();
                    listar.ListarClientes();
                    break;
                case 3:
                    BuscarClienteId clienteid = new BuscarClienteId();
                    clienteid.BuscarClienteid();
                    break;
                case 4:
                    EditarCliente editarCliente = new EditarCliente();
                    editarCliente.Editar();
                    break;
                case 5:
                    System.out.println("Acao 5 bem sucedida");
                    break;
                case 6:
                    System.out.println("Programa encerrado...");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }

        } while (escolha != 6);
        sc.close();
    }
}
