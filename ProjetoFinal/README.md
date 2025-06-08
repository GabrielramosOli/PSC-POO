RESUMO DE USO DO SISTEMA DE CLIENTES EM JAVA

Este é um sistema em Java para cadastro e gerenciamento de clientes. Ele permite adicionar, listar, buscar por ID, editar e excluir clientes, com os dados armazenados em um arquivo de texto chamado cliente.txt.

REQUISITOS:
- Ter o Java JDK instalado (versão 11 ou superior)
- Usar um terminal, ou uma IDE como VS Code, Eclipse ou IntelliJ

COMO COMPILAR:
1. Abra o terminal na pasta onde estão os arquivos .java
2. Compile todos os arquivos com o comando:
   javac *.java

COMO EXECUTAR:
Após a compilação, execute o menu principal com:
- java Menu

SOBRE O ARQUIVO cliente.txt:
- Fica salvo na mesma pasta do projeto
- Cada cliente é salvo em uma linha com os campos separados por ;
- A ordem dos campos no arquivo é:
  ID;Nome;DataNascimento;Idade;CPF;Nacionalidade;Endereco;Telefone1;Telefone2;EstadoCivil;RG;NumeroCNH;Email;ValidadeCNH;CEP;CategoriaCNH;Profissao
