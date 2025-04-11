
import dominio.Calculadora;
import java.util.Scanner;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        Scanner scan = new Scanner(System.in);

        System.out.println("===== DIVISÃO =====");
        System.out.print("Digite o primeiro número: ");
        double num1 = scan.nextInt();

        System.out.print("Digite o segundo número: ");
        double num2 = scan.nextInt();

        System.out.println("-------------------");
        calc.divideDoisNumeros03(num1, num2);

    }
}
