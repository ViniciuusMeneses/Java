public class Desafio03 {
    public static void main(String[] args) {
        int a = 17, b = 5;
        System.out.println("Soma: " + (a + b));
        System.out.println("Subtracao: " + (a - b));
        System.out.println("Multiplicacao: " + (a * b));
        System.out.println("Divisao inteira: " + (a / b));
        System.out.println("Resto (modulo): " + (a % b));
        double divisaoReal = (double) a / b;
        System.out.println("Divisao real: " + divisaoReal);
        a += 3; // equivale a a = a + 3
        System.out.println("a apos += 3: " + a);
    }
}
