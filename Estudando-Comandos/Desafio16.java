public class Desafio16 {

    static int somar(int a, int b) {
        return a + b;
    }

    static double media(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    static void saudacao(String nome) {
        System.out.println("Ola, " + nome + "!");
    }

    public static void main(String[] args) {
        saudacao("Vinicius");
        System.out.println("Soma: " + somar(4, 6));
        System.out.println("Media: " + media(7, 8, 9));
    }
}
