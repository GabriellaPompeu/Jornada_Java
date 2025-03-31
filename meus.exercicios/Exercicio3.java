import java.util.Scanner;

public class Exercicio3 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double num1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Digite outro número: ");
        double num2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Soma = " + (num1 + num2));
        System.out.println("Subtração = " + (num1 - num2));
        System.out.println("Multiplicação = " + (num1 * num2));
        System.out.println("Divisão = " + (num1 / num2));

        scanner.close();

    }
}
