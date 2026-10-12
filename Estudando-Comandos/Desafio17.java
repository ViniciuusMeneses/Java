public class Desafio17 {
    public static void main(String[] args) {
        String nome = "Ana";
        int idade = 20;
        double saldo = 1234.5;

        System.out.printf("Nome: %s | Idade: %d%n", nome, idade);
        System.out.printf("Saldo: R$ %.2f%n", saldo);
        System.out.printf("Percentual: %d%%%n", 50);

        String texto = String.format("%-10s|%5d", nome, idade);
        System.out.println(texto);
    }
}
