import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CadastrarCliente {

    public static void cadastrar() {
        Scanner sc = new Scanner(System.in);
        Registro registro = new Registro();

        System.out.println("=== Cadastro de Cliente ===");

        registro.setNome(registro.validarCampoVazio("Digite seu nome:"));
        registro.setDataNascimento(registro.lerData("Digite sua data de nascimento: "));
        registro.setIdade(registro.validarIdade("Digite sua idade: "));
        String cpf = registro.lerCPF("Digite seu CPF: ");
        registro.setCPF(cpf);
        registro.setRG(registro.validarCampoVazio("Digite seu RG: "));

        registro.setNacionalidade(registro.validarCampoVazio("Digite sua nacionalidade:"));
        registro.setEndereco(registro.validarCampoVazio("Digite seu endereço:"));
        registro.setTelefone1(registro.validarCampoVazio("Digite seu Telefone 1:"));

        System.out.println("Deseja adicionar um Telefone 2? (Sim/Não)");
        String esc = sc.nextLine();
        if (esc.equalsIgnoreCase("Sim")) {
            registro.setTelefone2(registro.validarCampoVazio("Digite seu Telefone 2: "));
        } else {
            registro.setTelefone2("Não informado");
        }

        registro.setEstadoCivil(registro.validarCampoVazio("Digite seu estado civil:"));
        registro.setProfissao(registro.validarCampoVazio("Digite sua profissão:"));
        registro.setEmail(registro.validarCampoVazio("Digite seu email:"));
        registro.setCEP(registro.validarCampoVazio("Digite seu CEP:"));
        registro.setNumcnh(registro.validarCampoVazio("Digite o numero da sua CNH"));
        registro.setCategoria(registro.validarCampoVazio("Digite a categoria da CNH:"));
        registro.setValidade(registro.lerData("Digite a validade da CNH: "));

        String idGerado = GeradorID.gerarID(cpf);
        registro.setid(idGerado);

        gravar(registro);

        System.out.println("Cliente cadastrado e salvo com sucesso!");
    }

    public static void gravar(Registro registro) {
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter("Clientes.txt", true))){
            escritor.write(registro.ExibirCliente());
            escritor.newLine();
            escritor.close();
        } catch (IOException e) {
            System.out.println("Erro ao gravar cliente no arquivo.");
            e.printStackTrace();
        }
    }
}
