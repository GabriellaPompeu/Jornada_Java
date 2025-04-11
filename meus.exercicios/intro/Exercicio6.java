import java.util.Scanner;

public class Exercicio6 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("----- CALCULADORA DE MAIORIDADE ------");
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        if (idade >= 18) {
            System.out.printf("%s é maior de idade, pois possui %d anos", nome, idade);
        } else {
            System.out.printf("%s não é maior de idade, pois possui %d anos", nome, idade);
        }

        scanner.close();
    }
}
