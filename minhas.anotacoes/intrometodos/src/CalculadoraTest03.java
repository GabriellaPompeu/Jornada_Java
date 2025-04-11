import dominio.Calculadora;
import java.util.Scanner;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double num1 = scan.nextDouble();

        System.out.print("Digite outro número: ");
        double num2 = scan.nextDouble();

        double result = calc.divideDoisNumeros(num1, num2);
        System.out.printf("%.2f / %.2f = %.2f", num1 , num2, result);

        scan.close();
    }
}
