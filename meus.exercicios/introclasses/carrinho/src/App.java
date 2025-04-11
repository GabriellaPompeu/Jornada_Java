import dominio.Carro;

public class App {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Civic";
        carro1.marca = "Honda";
        carro1.ano = 2014;

        carro2.nome = "City";
        carro2.marca = "Honda";
        carro2.ano = 2015;

        System.out.println(carro1.nome);
        System.out.println(carro1.marca);
        System.out.println(carro1.ano);

        System.out.println("-----------------");

        System.out.println(carro2.nome);
        System.out.println(carro2.marca);
        System.out.println(carro2.ano);

    }
}
