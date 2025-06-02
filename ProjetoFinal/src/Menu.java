import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int escolha;
        System.out.println("1. Criar novo registro\n2. Listar novo registro\n3. Buscar registro\n4. Editar registro\n5. Excluir registro\n6. Sair");
        System.out.println("Selicione uma das seguintes opções: ");
        escolha = sc.nextInt();
        switch (escolha) {
            case 1:
                ArrayList<Registro> clientes = new ArrayList<>();
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

                System.out.println("Escreva seu Telefone 2: ");
                registro.setTelefone2(sc.nextLine());

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
                
                clientes.add(new Registro());
                break;
            case 2:
                System.out.println("Acao 2 bem sucedida");
                break;
            case 3:
                System.out.println("Acao 3 bem sucedida");
                break;
            case 4:
                System.out.println("Acao 4 bem sucedida");
                break;
            case 5:
                System.out.println("Acao 5 bem sucedida");
                break;
            case 6:
                System.out.println("Acao 6 bem sucedida");
                break;
        
            
        }

        sc.close();
    }
}
