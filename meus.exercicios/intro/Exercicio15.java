
import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("======= CRIADOR DE MATRIZES 3X3 =======");
        int[][] matriz = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Digite o termo da linha %d, coluna %d: ", i, j);
                matriz[i][j] = scanner.nextInt();
            }
            System.out.println("--------------------------------------------");
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
