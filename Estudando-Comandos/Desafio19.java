public class Desafio19 {
    public static void main(String[] args) {
        String numeroTexto = "42";
        String decimalTexto = "3.14";

        int n = Integer.parseInt(numeroTexto);
        double d = Double.parseDouble(decimalTexto);

        System.out.println("Inteiro + 8 = " + (n + 8));
        System.out.println("Double * 2 = " + (d * 2));

        String deVolta = Integer.toString(n);
        System.out.println("Texto: " + deVolta + " (tamanho " + deVolta.length() + ")");

        System.out.println("Maior int: " + Integer.MAX_VALUE);
    }
} 
