import java.util.Scanner;
public class Desafio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma nota (0 a 10): ");
        double nota = sc.nextDouble();
        if (nota >= 7.0) {
            System.out.println("Aprovado");
        } else if (nota >= 5.0) {
            System.out.println("Recuperacao");
        } else {
            System.out.println("Reprovado");
        }
        sc.close();
    }
}
