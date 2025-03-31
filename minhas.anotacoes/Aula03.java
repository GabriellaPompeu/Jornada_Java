// Aula sobre Operadores
/*
 * and -> &&
 * or -> ||
 */
public class Aula03 {
    public static void main (String[] args) {
        int numero1 = 10;
        int numero2 = 20;

        int soma = numero1 + numero2;
        double divisao = (double) numero1 / numero2; // fiz o casting pois a divisão de inteiros retorna um inteiro

        System.out.println("Valor da soma = " + soma);
        System.out.println(numero1 - numero2);
        System.out.println("Divisão = " + divisao);
        System.out.println(numero2 / numero1);
        System.out.println(numero1 * numero2);

        // %
        int a = 10, b = 3;
        System.out.println("Soma: " + (a + b));
        System.out.println("Subtração: " + (a - b));
        System.out.println("Multiplicação: " + (a * b));
        System.out.println("Módulo: " + (a % b));
        System.out.println("a é maior que b? " + (a > b));
        System.out.println("a é menor que b? " + (a < b));
        System.out.println("a é diferente de b? " + (a != b));
        System.out.println("a é igual a b? " + (a == b));

    }
}
