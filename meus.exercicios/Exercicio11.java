import java.util.Scanner;

public class Exercicio11 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        String senha = "1234";
        String senhaDigitada; // declara a variável "senhaDigitada"
        int contador = 0;

        // continue o desafio
        do {
            System.out.print("Digite a senha: ");
            senhaDigitada = scanner.nextLine(); // atribui valor à "senhaDigitada"

            if (!senhaDigitada.equals(senha)) {
                System.out.println("Acesso negado!");
                contador++;
            } else {
                System.out.println("Acesso permitido!");
                break;
            }
        } while (!senhaDigitada.equals(senha) && contador < 3);

        if (contador == 3) {
            System.out.println("Você alcançou o máximo de tentativas!");
        }

        scanner.close();
    }
}
