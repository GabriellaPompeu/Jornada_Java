package dominio;

public class Calculadora {
    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(10-9);
    }

    public void multiplicaDoisNumeros(int num1 , int num2) {
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1 , double num2) {
        if (num2 != 0){
            return num1 / num2;
        } else {
            return 0;
        }
    }
    
    public void divideDoisNumeros02(double num1 , double num2) {
        if (num2 == 0){
            System.out.println("Erro: Divisão por zero!");
            return;
        }
    }

    public void divideDoisNumeros03(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Erro: Divisão por zero!");
        } else {
            System.out.println(num1 / num2);
        }
    }

}