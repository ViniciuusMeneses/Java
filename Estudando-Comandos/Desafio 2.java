import java.util.Scanner;
public class Desafio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        System.out.print("Digite seu peso: ");
        double peso = sc.nextDouble();
        System.out.println("Ola, " + nome + "! Voce tem " + idade + " anos.");
        System.out.println("Peso informado: " + peso + " kg");
        sc.close();
    }
}
