import java.util.Arrays;

public class Desafio13 {
    public static void main(String[] args) {
        int[] v = {5, 2, 9, 1, 7};

        System.out.println("Antes: " + Arrays.toString(v));
        Arrays.sort(v);
        System.out.println("Ordenado: " + Arrays.toString(v));

        int pos = Arrays.binarySearch(v, 7);
        System.out.println("Posicao do 7: " + pos);

        int[] copia = Arrays.copyOf(v, 3);
        System.out.println("Copia: " + Arrays.toString(copia));

        int[] preenchido = new int[4];
        Arrays.fill(preenchido, 1);
        System.out.println("Preenchido: " + Arrays.toString(preenchido));
    }
}
