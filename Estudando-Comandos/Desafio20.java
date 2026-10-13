import java.util.Scanner;

public class Desafio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Dividendo: ");
            int a = sc.nextInt();
            System.out.print("Divisor: ");
            int b = sc.nextInt();

            int resultado = a / b; // pode lancar ArithmeticException 
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: nao divida por zero!");
        } catch (Exception e) {
            System.out.println("Entrada invalida. Digite apenas numeros.");
        } finally {
            System.out.println("Fim do programa.");
            sc.close();
        }
    }
}
