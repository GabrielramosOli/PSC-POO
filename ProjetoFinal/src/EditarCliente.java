import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EditarCliente {
    public static void Editar() {
        Scanner sc = new Scanner(System.in);

        LerClientes lerArquivo = new LerClientes();
        ArrayList<Registro> clientes = lerArquivo.lerClientesDoArquivo();

        System.out.print("Escreva por qual ID você deseja buscar: ");
        String iddebusca = sc.nextLine().trim();

        Registro clienteEncontrado = null;
        for (Registro c : clientes) {
            if (iddebusca.equals(c.getid())) {
                clienteEncontrado = c;
                break;
            }
        }

        if (clienteEncontrado == null) {
            System.out.println("Cliente com o ID informado não encontrado.");
            return;
        }

        System.out.println("\n==== CLIENTE ENCONTRADO ====");
        System.out.println(clienteEncontrado.ExibirCliente());

        int opcao;
        do {
            System.out.println("\n=== O que você deseja alterar? ===");
            System.out.println("1 - Nome");
            System.out.println("2 - Data de Nascimento");
            System.out.println("3 - Idade");
            System.out.println("4 - CPF");
            System.out.println("5 - RG");
            System.out.println("6 - Estado Civil");
            System.out.println("7 - Nacionalidade");
            System.out.println("8 - Endereço");
            System.out.println("9 - Telefone 1");
            System.out.println("10 - Telefone 2");
            System.out.println("11 - Email");
            System.out.println("12 - CEP");
            System.out.println("13 - Número da CNH");
            System.out.println("14 - Categoria CNH");
            System.out.println("15 - Validade CNH");
            System.out.println("16 - Profissão");
            System.out.println("0 - Sair da edição");

            System.out.print("Escolha uma opção: ");
            while (!sc.hasNextInt()) {
                System.out.print("Digite um número válido: ");
                sc.next();
            }
            opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    System.out.print("Digite o novo Nome: ");
                    clienteEncontrado.setNome(sc.nextLine());
                    break;
                case 2:
                    clienteEncontrado.setDataNascimento(
                            clienteEncontrado.lerData("Digite a nova Data de Nascimento (dd/MM/yyyy): "));
                    break;
                case 3:
                    System.out.print("Digite a nova Idade: ");
                    try {
                        clienteEncontrado.setIdade(Integer.parseInt(sc.nextLine().trim()));
                    } catch (NumberFormatException e) {
                        System.out.println("Idade inválida.");
                    }
                    break;
                case 4:
                    clienteEncontrado.setCPF(clienteEncontrado.lerCPF("Digite o novo CPF: "));
                    break;
                case 5:
                    System.out.print("Digite o novo RG: ");
                    clienteEncontrado.setRG(sc.nextLine());
                    break;
                case 6:
                    System.out.print("Digite o novo Estado Civil: ");
                    clienteEncontrado.setEstadoCivil(sc.nextLine());
                    break;
                case 7:
                    System.out.print("Digite a nova Nacionalidade: ");
                    clienteEncontrado.setNacionalidade(sc.nextLine());
                    break;
                case 8:
                    System.out.print("Digite o novo Endereço: ");
                    clienteEncontrado.setEndereco(sc.nextLine());
                    break;
                case 9:
                    System.out.print("Digite o novo Telefone 1: ");
                    clienteEncontrado.setTelefone1(sc.nextLine());
                    break;
                case 10:
                    System.out.print("Digite o novo Telefone 2: ");
                    clienteEncontrado.setTelefone2(sc.nextLine());
                    break;
                case 11:
                    System.out.print("Digite o novo Email: ");
                    clienteEncontrado.setEmail(sc.nextLine());
                    break;
                case 12:
                    System.out.print("Digite o novo CEP: ");
                    clienteEncontrado.setCEP(sc.nextLine());
                    break;
                case 13:
                    System.out.print("Digite o novo Número da CNH: ");
                    clienteEncontrado.setNumcnh(sc.nextLine());
                    break;
                case 14:
                    System.out.print("Digite a nova Categoria CNH: ");
                    clienteEncontrado.setCategoria(sc.nextLine());
                    break;
                case 15:
                    System.out.print("Digite a nova Validade CNH (dd/MM/yyyy): ");
                    clienteEncontrado.setValidade(sc.nextLine());
                    break;
                case 16:
                    System.out.print("Digite a nova Profissão: ");
                    clienteEncontrado.setProfissao(sc.nextLine());
                    break;
                case 0:
                    System.out.println("Saindo da edição...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

        } while (opcao != 0);

        EditarCliente escrever = new EditarCliente();
        escrever.gravarClientesEmArquivo(clientes);

        System.out.println("Dados atualizados com sucesso!");
    
    }




    public static void gravarClientesEmArquivo(ArrayList<Registro> clientes) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("CLientes.txt"))) {
            for (Registro c : clientes) {
                String linha = String.join(";",
                        c.getid(),
                        c.getNome(),
                        c.getDataNascimento(),
                        String.valueOf(c.getIdade()),
                        c.getCPF(),
                        c.getRG(),
                        c.getEstadoCivil(),
                        c.getNacionalidade(),
                        c.getEndereco(),
                        c.getTelefone1(),
                        c.getTelefone2(),
                        c.getEmail(),
                        c.getCEP(),
                        c.getNumcnh(),
                        c.getCategoria(),
                        c.getValidade(),
                        c.getProfissao());
                writer.write(linha);
                writer.newLine();
            }
            System.out.println("Arquivo atualizado com sucesso.");
        } catch (IOException e) {
            System.out.println("Erro ao gravar no arquivo: " + e.getMessage());
        }
    }
}
