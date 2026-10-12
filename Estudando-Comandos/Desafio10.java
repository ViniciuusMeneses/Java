public class Desafio10 {
    public static void main(String[] args) {
        String frase = "  Aprendendo Java  ";

        System.out.println("Sem espacos: [" + frase.trim() + "]");
        System.out.println("Tamanho: " + frase.trim().length());
        System.out.println("Maiusculas: " + frase.toUpperCase());
        System.out.println("Minusculas: " + frase.toLowerCase());
        System.out.println("Primeira letra: " + frase.trim().charAt(0));
        System.out.println("Contem 'Java'? " + frase.contains("Java"));
        System.out.println("Posicao de 'Java': " + frase.indexOf("Java"));
        System.out.println("Trocando: " + frase.trim().replace("Java", "Python"));
        System.out.println("Pedaco: " + frase.trim().substring(0, 10));
    }
}
