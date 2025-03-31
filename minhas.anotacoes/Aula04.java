// Função Scanner
import java.util.Scanner; // importa a classe Scanner

public class Aula04 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in); // cria um objeto Scanner chamado scan

        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine(); // captura uma linha completa

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt(); // captura um número inteiro

        System.out.print("Digite a sua altura em metros: ");
        double altura = scanner.nextDouble();

        System.out.print("Você gosta de café? (true/false): ");
        boolean gostaDeCafe = scanner.nextBoolean();

        System.out.println("\nDados inseridos:");
        System.out.println("Nome:" + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Gosta de café? " + gostaDeCafe);

        scanner.close();
    }
}
