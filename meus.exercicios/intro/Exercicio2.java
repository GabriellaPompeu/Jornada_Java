package meus.exercicios;
import java.util.Scanner;
// Cadastro de usuarios

public class Exercicio2 {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite a sua idade: ");
        int idade = entrada.nextInt();

        System.out.print("Digite o seu salário: ");
        double salario = entrada.nextDouble();

        System.out.print("Possui carteira de motorista? (true/false) ");
        boolean possuiCnh = entrada.nextBoolean();

        System.out.println(
            "Nome: " + nome + "\n" +
            "Idade: " + idade + "\n" +
            "Salário: R$" + salario + "\n" +
            "Tem carteira de motorista? " + possuiCnh
        );

        entrada.close();
    }
}
