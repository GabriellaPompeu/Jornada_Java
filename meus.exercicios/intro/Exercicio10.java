import java.util.Scanner;

public class Exercicio10 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = -1;
        int soma = 0;
        while (numero != 0) {
            System.out.print("Digite um número inteiro (0 para sair): ");
            numero = scanner.nextInt();

            soma += numero;
        }

        System.out.printf("A soma é %d" , soma);

        scanner.close();
    }
}