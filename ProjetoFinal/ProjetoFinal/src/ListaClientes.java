import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ListaClientes {
    public void ListarClientes(){
        ArrayList<Registro> clientes = new ArrayList<>();
        try {
            BufferedReader leitor = new BufferedReader(new FileReader("clientes.txt"));
            String linha;

            while ((linha = leitor.readLine()) != null) {
                String[] partes = linha.split(";");
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
         

                
                Registro c = new Registro(id, nome, dataNascimento, idade, CPF, nacionalidade, endereco, telefone1, telefone2,
                                          estadoCivil, profissao, email, CEP, categoria, validade);
                clientes.add(c);
            }
            leitor.close();
            
            System.out.println("\n==== CLIENTES LIDOS ====");
            for (Registro c : clientes) {
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

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo de clientes.");
            e.printStackTrace();
        }
    }
}

