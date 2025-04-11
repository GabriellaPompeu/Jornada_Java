import java.util.Scanner;

public class Exercicio8 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(
            "Escolha um dia da semana:" + "\n" +
            "Warning: Lembre-se de considerar 1 como Domingo e 7 como sábado!"
        );
        int dia = scanner.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Escreva um número válido!");

        }

        scanner.close();
    }
}
