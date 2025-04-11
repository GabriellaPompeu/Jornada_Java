import java.util.Scanner;

public class Exercicio14 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite quantos alunos serão cadastrados: ");
        int qtdAlunos = scanner.nextInt();
        scanner.nextLine();

        double[] medias = new double[qtdAlunos];
        String[] nomes = new String[qtdAlunos];
        String[] situacao = new String[qtdAlunos];

        for (int i = 0; i < qtdAlunos; i++) {
            System.out.print("Digite o nome do aluno: ");
            nomes[i] = scanner.nextLine();

            System.out.print("Digite a nota da primeira prova: ");
            double nota1 = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Digite a nota da segunda prova: ");
            double nota2 = scanner.nextDouble();
            scanner.nextLine();

            medias[i] = (nota1 + nota2) / 2;

            if (medias[i] >= 7) {
                situacao[i] = "aprovado";
            } else {
                situacao[i] = "reprovado";
            }

            System.out.println("-----------------------------------");
        }

        System.out.println("========= RELATÓRIO FINAL =========");

        for (int indice = 0; indice < qtdAlunos; indice++) {
            System.out.printf("Nome = %s\nMedia = %.2f\nSituação = %s\n", nomes[indice], medias[indice], situacao[indice]);
            System.out.println("-----------------------------------");
        }

        scanner.close();
    }
}
