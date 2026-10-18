public class Desafio12 {
    public static void main(String[] args) {
        int[] numeros = {10, 25, 3, 47, 8};

        System.out.println("Quantidade: " + numeros.length);
        System.out.println("Primeiro: " + numeros[0]);
        System.out.println("Ultimo: " + numeros[numeros.length - 1]);

        int soma = 0;
        int maior = numeros[0];
        for (int n : numeros) {
            soma += n;
            if (n > maior) maior = n;
        }
        System.out.println("Soma: " + soma);
        System.out.println("Media: " + (soma / (double) numeros.length));
        System.out.println("Maior: " + maior);
    }
}
