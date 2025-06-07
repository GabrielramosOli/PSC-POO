import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int escolha;
        MenuClasse menu = new MenuClasse();
        do {
            System.out.println("========================================");
            System.out.println("         SISTEMA DE CLIENTES");
            System.out.println("========================================");
            System.out.println("Selecione uma das opções abaixo:");
            System.out.println("----------------------------------------");
            System.out.println("1. Criar novo registro de cliente");
            System.out.println("2. Listar todos os registros de clientes");
            System.out.println("3. Buscar registro dos clientes por ID");
            System.out.println("4. Editar registro de cliente");
            System.out.println("5. Excluir registro de cliente");
            System.out.println("6. Sair");
            System.out.println("----------------------------------------");
            System.out.print("Digite sua opção: ");
            escolha = sc.nextInt();
            switch (escolha) {
                case 1:
                    menu.Cadastrar();
                    break;
                case 2:
                    menu.ListarRegistros();
                    break;
                case 3:
                    menu.BuscarRegistroid();
                    break;
                case 4:
                    menu.EditarRegistro();
                    break;
                case 5:
                    menu.ExcluirRegistro();
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
