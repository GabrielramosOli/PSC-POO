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

    public String ExibirCliente() {
        return "ID: " + id +
                "\nNome: " + nome +
                "\nData de Nascimento: " + dataNascimento +
                "\nCPF: " + CPF +
                "\nNacionalidade: " + nacionalidade +
                "\nEndereço: " + endereco +
                "\nTelefone 1: " + telefone1 +
                "\nTelefone 2: " + telefone2 +
                "\nEstado Civil: " + estadoCivil +
                "\nProfissão: " + profissao +
                "\nEmail: " + email +
                "\nCEP: " + CEP +
                "\nCategoria CNH: " + categoria +
                "\nValidade CNH: " + validade +
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
