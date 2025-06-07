import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class LerClientes {
    public ArrayList<Registro> lerClientesDoArquivo() {
        ArrayList<Registro> clientes = new ArrayList<>();

        try {
            BufferedReader leitor = new BufferedReader(new FileReader("Clientes.txt"));
            String linha;

            while ((linha = leitor.readLine()) != null) {
                String[] partes = linha.split(";");

                Registro cliente = new Registro();
                cliente.setid(partes[0]);
                cliente.setNome(partes[1]);
                cliente.setDataNascimento(partes[2]);
                cliente.setIdade(Integer.parseInt(partes[3]));
                cliente.setCPF(partes[4]);
                cliente.setNacionalidade(partes[5]);
                cliente.setEndereco(partes[6]);
                cliente.setTelefone1(partes[7]);
                cliente.setTelefone2(partes[8]);
                cliente.setEstadoCivil(partes[9]);
                cliente.setProfissao(partes[10]);
                cliente.setEmail(partes[11]);
                cliente.setCEP(partes[12]);
                cliente.setCategoria(partes[13]);
                cliente.setValidade(partes[14]);
                cliente.setRG(partes[15]);
                cliente.setNumcnh(partes[16]);
                clientes.add(cliente);
            }
            leitor.close();
        } catch (Exception e) {
            System.out.println("Erro ao ler o arquivo.");
        }

        return clientes;
    }
}
