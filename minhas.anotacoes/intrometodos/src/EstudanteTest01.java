import dominio.Estudante;
import dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante1.nome = "Hebert";
        estudante1.idade = 15;
        estudante1.sexo = 'M';

        estudante2.nome = "Hicaro";
        estudante2.idade = 17;
        estudante2.sexo = 'M';

        impressora.imprime(estudante1);
        impressora.imprime(estudante2);
    }
}
