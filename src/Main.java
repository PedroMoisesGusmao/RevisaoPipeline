public class Main {
    public static void main(String[] args) {
        System.out.println("Soma: " + soma(1, 1));
        System.out.println("Subtração: " + subtracao(1, 1));
        System.out.println("Divisão: " + divicao(1, 1));
        System.out.println("Multiplicação: " + multiplicacao(1, 1));
    }

    public static double soma(double num1, double num2) {
        return num1 + num2;
    }
    public static double subtracao(double num1, double num2) {
        return num1 - num2;
    }
    public static double divicao(double num1, double num2) {
        return num1/num2;
    }
    public static double multiplicacao(double num1, double num2) {
        return num1 * num2;
    }
}