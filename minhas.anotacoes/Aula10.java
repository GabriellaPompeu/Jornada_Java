public class Aula10 {
    public static void main(String[] args) {
        int[] numeros = {13, 27, 33, 49, 52}; // forma de inicializar array mais resumidamente

        for (int num : numeros) { // este é o foreach, ele não usa índices, mas faz a mesma coisa que aquele for que aprendemos
            System.out.println(num);
        }
    }
}
