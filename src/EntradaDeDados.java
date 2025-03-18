import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine(); // Lê uma linha inteira

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt(); // Lê um número inteiro

        System.out.print("Digite sua altura (em metros): ");
        double altura = scanner.nextDouble(); // Lê um número decimal

        System.out.println("Nome: " + nome + ", Idade: " + idade + ", Altura: " + altura);
        scanner.close(); // Fecha o scanner para evitar vazamento de recursos
    }
}
