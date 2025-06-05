import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ExcluirCliente {
    public void Excluir() {
        Scanner sc = new Scanner(System.in);
        LerClientes lerArquivo = new LerClientes();
        ArrayList<Registro> clientes = lerArquivo.lerClientesDoArquivo();

        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
            return;
        }

        System.out.print("Digite o ID do cliente que deseja excluir: ");
        String idExcluir = sc.nextLine();

        BuscarClienteId buscar = new BuscarClienteId();
        Registro clienteEncontrado = buscar.BuscarClienteid(idExcluir, clientes);

        if (clienteEncontrado == null) {
            System.out.println("Cliente com ID " + idExcluir + " não encontrado.");
            return;
        }
        clientes.remove(clienteEncontrado);
        System.out.println("Cliente removido com sucesso!");

        try {
            FileWriter escritor = new FileWriter("clientes.txt");
            for (Registro c : clientes) {
                escritor.write(c.getid() + ";" + c.getNome() + ";" + c.getDataNascimento() + ";" + c.getIdade() + ";" +
                        c.getCPF() + ";" + c.getNacionalidade() + ";" + c.getEndereco() + ";" + c.getTelefone1() + ";" +
                        c.getTelefone2() + ";" + c.getEstadoCivil() + ";" + c.getProfissao() + ";" + c.getEmail() + ";"
                        +
                        c.getCEP() + ";" + c.getCategoria() + ";" + c.getValidade() + "\n");
            }
            escritor.close();
        } catch (IOException e) {
            System.out.println("Erro ao atualizar o arquivo.");
        }

        sc.close();
    }
}
