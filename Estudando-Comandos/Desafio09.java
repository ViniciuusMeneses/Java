import java.util.Scanner;

public class Desafio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        do {
            System.out.print("Digite um numero positivo: ");
            numero = sc.nextInt();
        } while (numero <= 0);

        System.out.println("Obrigado! Voce digitou: " + numero);
        sc.close();
    }
}
