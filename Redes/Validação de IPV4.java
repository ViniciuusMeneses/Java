import java.util.Scanner;
class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o IP em 4 partes separadas:");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        Ip i = new Ip(a, b, c, d);

        if (i.ehValido()) {
            System.out.println("IP: " + a + "." + b + "." + c + "." + d + " válido");
            if (i.ehPrivado()) {
                System.out.println("IP privado");
            } else {
                System.out.println("IP público");
            }
        } else {
            System.out.println("IP inválido");
        }
    }
}

class Ip {
    private int a;
    private int b;
    private int c;
    private int d;

    public Ip(int a, int b, int c, int d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public boolean ehValido() {
        return a >= 0 && a < 256
                && b >= 0 && b < 256
                && c >= 0 && c < 256
                && d >= 0 && d < 256;
    }

    public boolean ehPrivado() {
        boolean faixa10  = (a == 10);
        boolean faixa172 = (a == 172 && b >= 16 && b <= 31);
        boolean faixa192 = (a == 192 && b == 168);
        return faixa10 || faixa172 || faixa192;
    }
    public int getA(){ 
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
    public int getB(){
        return b;
    }
    public void setB(int b){ 
        this.b = b;
    }
    public int getC(){
        return c;
    }
    public void setC(int c) {
        this.c = c;
    }
    public int getD() {
        return d;
    }
    public void setD(int d){
        this.d = d;
    }
}
