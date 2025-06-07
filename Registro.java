import java.util.Scanner;

public class Registro {
    private String nome;
    private int idade;
    private String dataNascimento;
    private String CPF;
    private String RG;
    private String estadoCivil;
    private String nacionalidade;
    private String profissao;
    private String endereco;
    private String CEP;
    private String telefone1;
    private String telefone2;
    private String email;
    private String numcnh;
    private String categoria;
    private String validade;
    private String id;

    public Registro(String id, String nome, String dataNascimento, int idade, String CPF, String nacionalidade,
            String endereco, String telefone1, String telefone2, String estadoCivil, String profissao,
            String email, String CEP, String categoria, String validade) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.idade = idade;
        this.CPF = CPF;
        this.nacionalidade = nacionalidade;
        this.endereco = endereco;
        this.telefone1 = telefone1;
        this.telefone2 = telefone2;
        this.estadoCivil = estadoCivil;
        this.profissao = profissao;
        this.email = email;
        this.CEP = CEP;
        this.categoria = categoria;
        this.validade = validade;
    }

    public Registro() {
    }

    public String lerData(String mensagem) {
        Scanner sc = new Scanner(System.in);
        String data;
        do {
            System.out.println(mensagem + " (dd/MM/yyyy):");
            data = sc.nextLine();
            if (!data.matches("\\d{2}/\\d{2}/\\d{4}")) {
                System.out.println("Data inválida. Digite novamente.");
            }
        } while (!data.matches("\\d{2}/\\d{2}/\\d{4}"));
        return data;
    }

    public String lerCPF(String mensagem) {
        Scanner sc = new Scanner(System.in);
        String cpf;
        do {
            System.out.println(mensagem + " (somente números):");
            cpf = sc.nextLine();
            if (!cpf.matches("\\d{11}")) {
                System.out.println("CPF inválido. Deve conter 11 dígitos.");
            }
        } while (!cpf.matches("\\d{11}"));
        return cpf;
    }

    public static String validarCampoVazio(String mensagem) {
        Scanner sc = new Scanner(System.in);
        String entrada;
        do {
            System.out.println(mensagem);
            entrada = sc.nextLine();
            if (entrada.isEmpty()) {
                System.out.println("Este campo é obrigatório. Digite novamente.");
            }
        } while (entrada.isEmpty());
        return entrada;
    }

    public static int validarIdade(String mensagem) {
    Scanner sc = new Scanner(System.in);
    int idade;

    while (true) {
        System.out.print(mensagem);
        String entrada = sc.nextLine();

        if (entrada.trim().isEmpty()) {
            System.out.println("Este campo é obrigatório. Digite novamente.");
            continue;
        }

        try {
            idade = Integer.parseInt(entrada);
            if (idade >= 0 && idade <= 120) {
                break;
            } else {
                System.out.println("Idade inválida. Digite um número entre 0 e 120.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. Digite apenas números.");
        }
    }

    return idade;
}


    public String ExibirCliente() {
    return "----------------------------------------" +
           "\nID: " + id +
           "\nNome: " + nome +
           "\nIdade: " + idade +
           "\nData de Nascimento: " + dataNascimento +
           "\nCPF: " + CPF +
           "\nRG: " + RG +
           "\nEstado Civil: " + estadoCivil +
           "\nNacionalidade: " + nacionalidade +
           "\nProfissão: " + profissao +
           "\nEndereço: " + endereco +
           "\nCEP: " + CEP +
           "\nTelefone 1: " + telefone1 +
           "\nTelefone 2: " + telefone2 +
           "\nEmail: " + email +
           "\nNúmero da CNH: " + numcnh +
           "\nCategoria da CNH: " + categoria +
           "\nValidade da CNH: " + validade +
           "\n----------------------------------------";
}


    public String getid() {
        return id;
    }

    public void setid(String id) {
        this.id = id;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public String getNumcnh() {
        return numcnh;
    }

    public void setNumcnh(String numcnh) {
        this.numcnh = numcnh;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String cPF) {
        CPF = cPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String rG) {
        RG = rG;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String cEP) {
        CEP = cEP;
    }

    public String getTelefone1() {
        return telefone1;
    }

    public void setTelefone1(String telefone1) {
        this.telefone1 = telefone1;
    }

    public String getTelefone2() {
        return telefone2;
    }

    public void setTelefone2(String telefone2) {
        this.telefone2 = telefone2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
