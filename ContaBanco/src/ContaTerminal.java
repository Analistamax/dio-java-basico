import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        // Configura o scanner para usar o separador decimal com ponto
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        try {
            // Solicita e armazena um número inteiro
            System.out.print("Por favor, digite o número do Banco:");
            int numero = scanner.nextInt();

            // Limpa o buffer do scanner após a entrada numérica
            scanner.nextLine(); // Necessário após a entrada de um int para consumir a quebra de linha

            // Solicita e armazena o nome da agência bancária
            System.out.print("Digite o numero da agência bancária: ");
            String agencia = scanner.nextLine();

            // Solicita e armazena o nome do cliente
            System.out.print("Digite o nome do cliente: ");
            String nome = scanner.nextLine();

            // Solicita e armazena o saldo em modo decimal
            System.out.print("Digite o saldo: ");
            double saldo = scanner.nextDouble();

            // Imprime os dados inseridos pelo usuário
            System.out.println("\nObrigado por criar uma conta em nosso banco:");
            System.out.println("Sua Agencia é: " + numero);
            System.out.println("Agência bancária: " + agencia);
            System.out.println("Nome do cliente: " + nome);
            System.out.println("Saldo: " + String.format("%.2f", saldo));

        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Por favor, insira os dados corretamente.");
        } finally {
            // Fecha o scanner
            scanner.close();
        }
    }
}
