// Exercício: descubra em quantas vezes um carro pode ser parcelado com a parcela mínima sendo 1000 reais
import java.util.Scanner;

public class Exercicio12 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do carro: R$");
        double valor = scanner.nextDouble();

        int maiorParcela = 0;
        double valorParcela = 0;

        for (int parcela = 1; parcela <= valor; parcela++) {
            double divisao = valor / parcela;
            if (divisao >= 1000) {
                maiorParcela = parcela;
                valorParcela = divisao;
            } else {
                break;
            }
        }

        System.out.printf("Quantidade máxima de parcelas = %d parcelas\n" , maiorParcela);
        System.out.printf("O valor mínimo da parcela é R$%.2f" , valorParcela);

        scanner.close();

        }
    
    }
