package aula13.test;

import aula13.dominio.Professor;

public class ProfessorTeste01 {
    public static void main (String[] args) {
        Professor professor = new Professor();
        professor.nome = "Julio";
        professor.idade = 28;
        professor.sexo = 'M';

        System.out.println(professor.nome + " " + professor.idade + " " + professor.sexo);
    }
    
}
