import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EntradaBuffered {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Digite seu nome: ");
        String nome = reader.readLine(); // Lê uma linha inteira

        System.out.print("Digite sua idade: ");
        int idade = Integer.parseInt(reader.readLine()); // Converte para inteiro
        System.out.println("Nome: " + nome + ", Idade: " + idade);

        reader.close(); // Fecha o reader para evitar vazamento de recursos
    }
}
