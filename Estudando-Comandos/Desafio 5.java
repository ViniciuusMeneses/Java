import java.util.Scanner;
public class Desafio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero inteiro: ");
        int n = sc.nextInt();
        String tipo = (n % 2 == 0) ? "par" : "impar";
        System.out.println("O numero e " + tipo);
        int absoluto = (n < 0) ? -n : n;
        System.out.println("Valor absoluto: " + absoluto);
        sc.close();
    }
}
