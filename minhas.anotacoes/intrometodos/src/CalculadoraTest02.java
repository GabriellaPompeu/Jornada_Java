import dominio.Calculadora;
import java.util.Scanner;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um inteiro: ");
        int num1 = scan.nextInt();

        System.out.print("Digite outro inteiro: ");
        int num2 = scan.nextInt();

        System.out.print("A multiplicação dos números é ");
        calc.multiplicaDoisNumeros(num1, num2);

        scan.close();
    }
}
