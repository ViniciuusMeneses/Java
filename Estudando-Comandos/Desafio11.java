public class Desafio11 {
    public static void main(String[] args) {
        System.out.println("Raiz de 9: " + Math.sqrt(9));
        System.out.println("2^10: " + Math.pow(2, 10));
        System.out.println("Absoluto de -7: " + Math.abs(-7));
        System.out.println("Maior(3,8): " + Math.max(3, 8));
        System.out.println("Menor(3,8): " + Math.min(3, 8));
        System.out.println("Arredondar 4.7: " + Math.round(4.7));
        System.out.println("Teto 4.1: " + Math.ceil(4.1));
        System.out.println("Piso 4.9: " + Math.floor(4.9));

        int dado = (int) (Math.random() * 6) + 1; // 1 a 6
        System.out.println("Dado sorteado: " + dado);
        
    }
}
