import java.util.Random;

public class GeradorID {
    public static String gerarID(String cpf) {
        Random random = new Random();

        
        int parteAleatoria = 1000 + random.nextInt(9000);

       
        String cpfNumeros = cpf.replaceAll("\\D", ""); 
        if (cpfNumeros.length() < 2) {
            throw new IllegalArgumentException("CPF inválido. Insira pelo menos dois dígitos.");
        }
        String ultimosDoisCPF = cpfNumeros.substring(cpfNumeros.length() - 2);

        return parteAleatoria + ultimosDoisCPF;
    }
}


