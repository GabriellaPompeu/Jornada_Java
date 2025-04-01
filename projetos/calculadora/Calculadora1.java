package projetos.calculadora;

import java.util.Scanner;

public class Calculadora1 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Escolha a operação (+, -, *, /): ");
        String operacao = scanner.next();

        switch (operacao) {
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            case "/":
                if (num2 != 0) {
                    System.out.println(num1 / num2);
                } else {
                    System.out.println("Erro: Divisão por zero!");
                }
                break;
            default:
                System.out.println("Operação inválida!");
        }
        
        scanner.close();

    }
}