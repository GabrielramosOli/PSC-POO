import java.util.ArrayList;
import java.util.Scanner;

public class EditarCliente {
    public static void Editar() {
        Scanner sc = new Scanner(System.in);
        
        Registro registro = new Registro();
        LerClientes lerArquivo = new LerClientes();
        ArrayList<Registro> clientes = lerArquivo.lerClientesDoArquivo();

        String iddebusca;
        System.out.println("Escreva por qual ID você deseja buscar: ");
        iddebusca = sc.next();

        System.out.println("\n==== CLIENTE ENCONTRADO ====");
        for (Registro c : clientes) {
            if (iddebusca.equals(c.getid())) {
                registro.ExibirCliente();
            }
        }

        int opcao;
        do {
            System.out.println("\n=== O que você deseja alterar? ===");
            System.out.println("1 - Nome");
            System.out.println("2 - Data de Nascimento");
            System.out.println("3 - Idade");
            System.out.println("4 - CPF");
            System.out.println("5 - Nacionalidade");
            System.out.println("6 - Endereço");
            System.out.println("7 - Telefone 1");
            System.out.println("8 - Telefone 2");
            System.out.println("9 - Estado Civil");
            System.out.println("10 - Profissão");
            System.out.println("11 - Email");
            System.out.println("12 - CEP");
            System.out.println("13 - Categoria CNH");
            System.out.println("14 - Validade CNH");
            System.out.println("0 - Sair da edição");

            System.out.print("Escolha uma opção: ");
            opcao = Integer.parseInt(sc.nextLine());

            for (Registro c : clientes) {
                switch (opcao) {
                    case 1:
                        System.out.println("Digite o novo Nome:");
                       registro.setNome(registro.validarCampoVazio("Digite seu nome:"));
                        break;

                    case 2:
                        System.out.println("Digite a nova Data de Nascimento (dd/MM/yyyy):");
                        registro.setDataNascimento(registro.lerData("Digite sua data de nascimento: "));
                        break;

                    case 3:
                        System.out.println("Digite a nova Idade:");
                        c.setIdade(Integer.parseInt(sc.nextLine()));
                        break;

                    case 4:
                        String cpf = registro.lerCPF("Digite o novo CPF: ");
                        registro.setCPF(cpf);
                        break;

                    case 5:
                        System.out.println("Digite a nova Nacionalidade:");
                        c.setNacionalidade(sc.nextLine());
                        break;

                    case 6:
                        System.out.println("Digite o novo Endereço:");
                        c.setEndereco(sc.nextLine());
                        break;

                    case 7:
                        System.out.println("Digite o novo Telefone 1:");
                        c.setTelefone1(sc.nextLine());
                        break;

                    case 8:
                        System.out.println("Digite o novo Telefone 2:");
                        c.setTelefone2(sc.nextLine());
                        break;

                    case 9:
                        System.out.println("Digite o novo Estado Civil:");
                        c.setEstadoCivil(sc.nextLine());
                        break;

                    case 10:
                        System.out.println("Digite a nova Profissão:");
                        c.setProfissao(sc.nextLine());
                        break;

                    case 11:
                        System.out.println("Digite o novo Email:");
                        c.setEmail(sc.nextLine());
                        break;

                    case 12:
                        System.out.println("Digite o novo CEP:");
                        c.setCEP(sc.nextLine());
                        break;

                    case 13:
                        System.out.println("Digite a nova Categoria CNH:");
                        c.setCategoria(sc.nextLine());
                        break;

                    case 14:
                        System.out.println("Digite a nova Validade CNH (dd/MM/yyyy):");
                        c.setValidade(sc.nextLine());
                        break;

                    case 0:
                        System.out.println("Saindo da edição...");
                        break;

                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        break;
                }
            }
        } while (opcao != 0);

        sc.close();
    }
}
