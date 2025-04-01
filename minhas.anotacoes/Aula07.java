public class Aula07 {
    public static void main (String[] args) {
        double salario = 1600;

        String mensagemDoar = "Eu tenho condições de doar";
        String mensagemNaoDoar = "Eu ainda não tenho condições de doar";

        // (condição) ? verdadeiro : falso
        String resultado = salario > 2000 ? mensagemDoar : mensagemNaoDoar;

        System.out.println(resultado);
    }
}