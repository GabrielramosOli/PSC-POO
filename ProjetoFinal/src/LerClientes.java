import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class LerClientes {

    public static ArrayList<Registro> lerClientesDoArquivo() {
        ArrayList<Registro> clientes = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("Clientes.txt"))) {
            String linha;
            int linhaAtual = 0;

            while ((linha = br.readLine()) != null) {
                linhaAtual++;
                String[] partes = linha.split(";");

                
                if (partes.length != 17) {
                    System.out.println("Linha " + linhaAtual + " inválida (campos=" + partes.length + "): " + linha);
                    continue;
                }

                try {
                    String id = partes[0];
                    String nome = partes[1];
                    String dataNascimento = partes[2];
                    int idade = Integer.parseInt(partes[3]);
                    String cpf = partes[4];
                    String rg = partes[5];
                    String estadoCivil = partes[6];
                    String nacionalidade = partes[7];
                    String endereco = partes[8];
                    String telefone1 = partes[9];
                    String telefone2 = partes[10];
                    String email = partes[11];
                    String cep = partes[12];
                    String profissao = partes[13];
                    String numcnh = partes[14];
                    String categoria = partes[15];
                    String validade = partes[16];

                    Registro cliente = new Registro(id, nome, dataNascimento, idade, cpf, rg,
                                                    estadoCivil, nacionalidade, endereco,
                                                    telefone1, telefone2, email, cep,
                                                    profissao, numcnh, categoria, validade);

                    clientes.add(cliente);
                } catch (NumberFormatException e) {
                    System.out.println("Erro ao converter idade na linha " + linhaAtual + ": " + e.getMessage());
                } catch (Exception e) {
                    System.out.println("Erro ao processar linha " + linhaAtual + ": " + e.getMessage());
                }
            }

        } catch (Exception e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        return clientes;
    }
}
