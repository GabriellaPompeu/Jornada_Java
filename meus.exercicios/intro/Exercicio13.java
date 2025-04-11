import java.util.Scanner;

public class Exercicio13 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] notas = new double[5];
        notas[0] = 5;
        notas[1] = 9;
        notas[2] = 3;


        System.out.print("Digite a primeira nota: ");
        notas[3] = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Digite a segunda nota: ");
        notas[4] = scanner.nextDouble();

        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        
        double media = soma / notas.length;

        if (media < 7) {
            System.out.printf("O aluno obteve média %.2f e foi reprovado", media);

        } else {
            System.out.printf("O aluno obteve média %.2f e foi aprovado", media);
        }
    }
}
