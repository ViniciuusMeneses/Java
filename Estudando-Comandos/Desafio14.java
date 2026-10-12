import java.util.ArrayList;

public class Desafio14 {
    public static void main(String[] args) {
        ArrayList<String> frutas = new ArrayList<>();

        frutas.add("maca");
        frutas.add("banana");
        frutas.add("uva");

        System.out.println("Lista: " + frutas);
        System.out.println("Tamanho: " + frutas.size());
        System.out.println("Posicao 1: " + frutas.get(1));
        System.out.println("Contem 'uva'? " + frutas.contains("uva"));

        frutas.remove("banana");
        System.out.println("Apos remover: " + frutas);

        for (String f : frutas) {
            System.out.println("- " + f);
        }
    }
}
