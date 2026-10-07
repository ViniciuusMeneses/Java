import java.util.Scanner;
class Main{
  public static void main() {

      Scanner sc = new Scanner(System.in);

      System.out.println("Digite o Ip em 4 partes separadas");

      a = sc.nextInt();
      b = sc.nextInt();
      c = sc.nextInt();
      d = sc.nextInt();

      ip i = new ip( a, b, c, d);

}
}
class ip{
    private int a;
    private int b;
    private int c;
    private int d;

    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }
    public int getC() {
        return c;
    }
    public void setC(int c) {
        this.c = c;
    }
    public int getD() {
        return d;
    }
    public void setD(int d) {
        this.d = d;
    }
    public ip(int a, int b, int c, int d) {
        if(a >= 0 && b >= 0 && c >= 0 && d >= 0 && a < 256 && b < 256 && c < 256 && d < 256 ) {
            System.out.println("IP: " + a + "." + b + "." + c + "." + d + "Valido");
        }else{
            System.out.println("Ip invalido");
        }
        if (a == 10 || a == 172 && b > 15 && b < 32 || a == 192 && b == 168){
            System.out.println("Ip privado");
        } else {
            System.out.println("Ip publico");
        }
    }
}
