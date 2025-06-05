import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CadastrarCLiente {
    public static void Cadastrar(){
        Scanner sc = new Scanner(System.in);
        Registro registro = new Registro();
        String esc;

        System.out.println("Escreva seu nome: ");
        registro.setNome(sc.nextLine());

        System.out.println("Escreva sua data de nascimento (dd/MM/yyyy): ");
        registro.setDataNascimento(sc.nextLine());

        System.out.println("Escreva o seu CPF: ");
        String cpf = sc.nextLine();
        registro.setCPF(cpf);

        System.out.println("Escreva sua nacionalidade: ");
        registro.setNacionalidade(sc.nextLine());

        System.out.println("Escreva seu endereço: ");
        registro.setEndereco(sc.nextLine());

        System.out.println("Escreva seu Telefone 1: ");
        registro.setTelefone1(sc.nextLine());

        System.out.println("Deseja adicionar um Telefone 2:");
        esc = sc.nextLine();
        if (esc.equalsIgnoreCase("Sim")) {
            System.out.println("Escreva seu Telefone 2: ");
            registro.setTelefone2(sc.nextLine());
        } else {
            registro.setTelefone2("Não informado");
        }

        System.out.println("Escreva o seu Estado Civil: ");
        registro.setEstadoCivil(sc.nextLine());

        System.out.println("Escreva sua Profissão: ");
        registro.setProfissao(sc.nextLine());

        System.out.println("Escreva seu Email: ");
        registro.setEmail(sc.nextLine());

        System.out.println("Escreva seu CEP: ");
        registro.setCEP(sc.nextLine());

        System.out.println("Escreva a Categoria da CNH: ");
        registro.setCategoria(sc.nextLine());

        System.out.println("Escreva a Validade da CNH (dd/MM/yyyy): ");
        registro.setValidade(sc.nextLine());

        String idGerado = GeradorID.gerarID(cpf);
        registro.setid(idGerado);

        sc.close();
    }

    public static void Gravar(){
        Registro registro = new Registro();
        try {
            FileWriter escritor = new FileWriter("Clientes.txt", true);
            escritor.write(registro.toString() + "\n");
            escritor.close();
            System.out.println("Cliente salvo com sucesso no arquivo!");
        } catch (IOException e) {
            System.out.println("Erro ao gravar cliente.");
            e.printStackTrace();
        }
    }
}