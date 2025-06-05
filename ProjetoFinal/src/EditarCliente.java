import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
public class EditarCliente {
    public static void Editar(){
        Scanner sc = new Scanner(System.in);
        Registro registrodois = new Registro();
        ArrayList<Registro> clientestres = new ArrayList<>();
        try {
            BufferedReader leitor = new BufferedReader(new FileReader("clientes.txt"));
            String linha;

            while ((linha = leitor.readLine()) != null) {
                String[] partes = linha.split("; ");
                String id = partes[0];
                String nome = partes[1];
                String dataNascimento = partes[2];
                int idade = Integer.parseInt(partes[3]);
                String CPF = partes[4];
                String nacionalidade = partes[5];
                String endereco = partes[6];
                String telefone1 = partes[7];
                String telefone2 = partes[8];
                String estadoCivil = partes[9];
                String profissao = partes[10];
                String email = partes[11];
                String CEP = partes[12];
                String categoria = partes[13];
                String validade = partes[14];

                Registro c = new Registro(id, nome, dataNascimento, idade, CPF, nacionalidade, endereco,
                        telefone1,
                        telefone2,
                        estadoCivil, profissao, email, CEP, categoria, validade);
                clientestres.add(c);
            }
            leitor.close();
            String iddebusca;
            System.out.println("Escreva por qual ID você deseja buscar: ");
            iddebusca = sc.next();

            System.out.println("\n==== CLIENTE ENCONTRADO ====");
            for (Registro c : clientestres) {
                if (iddebusca.equals(registrodois.getid())) {
                    System.out.println("ID: " + c.getid());
                    System.out.println("Nome: " + c.getNome());
                    System.out.println("Data de Nascimento: " + c.getDataNascimento());
                    System.out.println("Idade: " + c.getIdade() + " anos");
                    System.out.println("CPF: " + c.getCPF());
                    System.out.println("Nacionalidade: " + c.getNacionalidade());
                    System.out.println("Endereço: " + c.getEndereco());
                    System.out.println("Telefone 1: " + c.getTelefone1());
                    System.out.println("Telefone 2: " + c.getTelefone2());
                    System.out.println("Estado Civil: " + c.getEstadoCivil());
                    System.out.println("Profissão: " + c.getProfissao());
                    System.out.println("Email: " + c.getEmail());
                    System.out.println("CEP: " + c.getCEP());
                    System.out.println("Categoria CNH: " + c.getCategoria());
                    System.out.println("Validade CNH: " + c.getValidade());
                    System.out.println("-----------------------------------------");
                }
            }

        } catch (IOException e) {
            System.out.println("Erro ao tentar encontrar o cliente.");
            e.printStackTrace();
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

            for (Registro c : clientestres) {
                switch (opcao) {
                case 1:
                    System.out.println("Digite o novo Nome:");
                    c.setNome(sc.nextLine());
                    break;

                case 2:
                    System.out.println("Digite a nova Data de Nascimento (dd/MM/yyyy):");
                    c.setDataNascimento(sc.nextLine());
                    break;

                case 3:
                    System.out.println("Digite a nova Idade:");
                    c.setIdade(Integer.parseInt(sc.nextLine()));
                    break;

                case 4:
                    System.out.println("Digite o novo CPF:");
                    c.setCPF(sc.nextLine());
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
