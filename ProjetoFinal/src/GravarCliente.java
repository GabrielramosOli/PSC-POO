import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class GravarCliente {
    public static void main(String[] args) {
        ArrayList<Registro> clientes = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String escolha;
        
        Registro registro = new Registro();

            System.out.println("Escreva seu nome: ");
            registro.setNome(sc.nextLine());

            System.out.println("Escreva sua data de nascimento: ");
            registro.setDataNascimento(sc.nextLine());

            System.out.println("Escreva o seu CPF: ");
            registro.setCPF(sc.nextLine());

            System.out.println("Escreva sua nacionalidade: ");
            registro.setNacionalidade(sc.nextLine());

            System.out.println("Escreva seu endereço: ");
            registro.setEndereco(sc.nextLine());

            System.out.println("Escreva seu Telefone 1: ");
            registro.setTelefone1(sc.nextLine());

            System.out.println("Deseja adicionar um Telefone 2:");
            escolha = sc.nextLine();
            if (escolha.equals("sim")) {
                System.out.println("Escreva seu Telefone 2: ");
                registro.setTelefone2(sc.nextLine());
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

            System.out.println("Escreva a Validade da CNH: ");
            registro.setValidade(sc.nextLine());

            clientes.add(registro);

        try {
            FileWriter escritor = new FileWriter("frase.txt");
            escritor.write(registro.toString());
            escritor.close();
        } catch (Exception e) {
            System.out.println("Erro ao gravar cliente.");
        }
        sc.close();
        
    }
}
