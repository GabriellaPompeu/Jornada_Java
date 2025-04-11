// Exercício de Tipos primitivos
package meus.exercicios;

public class Exercicio1 {
    public static void main (String[] args){

        String nome = "João";
        String endereco = "Rua Sardinha, 338";
        float salario = 2500f;
        String data = "20 de março de 2025";

        System.out.println(
            "Eu " + nome + ", \n" +
            "morando no endereço " + endereco + ", \n" + 
            "confirmo que recebi o salário de " + salario + ", na data " + data
        );
    }
}