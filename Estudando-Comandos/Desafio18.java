import java.util.Scanner;

public class Desafio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um caractere: ");
        char c = sc.next().charAt(0);

        System.out.println("E letra? " + Character.isLetter(c));
        System.out.println("E digito? " + Character.isDigit(c));
        System.out.println("E espaco? " + Character.isWhitespace(c));
        System.out.println("Maiusculo: " + Character.toUpperCase(c));
        System.out.println("Minusculo: " + Character.toLowerCase(c));
        sc.close();
    }
}
