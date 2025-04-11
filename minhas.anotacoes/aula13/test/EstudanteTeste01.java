package aula13.test;

import aula13.dominio.Estudante;

public class EstudanteTeste01 {

    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Cesar";
        estudante.idade = 23;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

    }
}
