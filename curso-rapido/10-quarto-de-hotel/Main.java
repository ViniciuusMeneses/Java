import java.util.Scanner;
class Main {

    public void main() {
        int numero;
        String tipo;
        double valor;

        //quarto q = new quarto(101, "casal", 250);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero do quarto? ");
        numero =  sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o tipo do quarto? ");
        tipo = sc.nextLine();
        System.out.println("Digite o valor do quarto? ");
        valor = sc.nextDouble();

        quarto q = new quarto(numero, tipo, valor);

        q.exibir();

    }
}

class quarto{

    private int numero;
    private String tipo;
    private double valorDiaria;

    public void exibir(){
        System.out.println("Quarto " + numero + " " + tipo + " " + valorDiaria);
    }

    public quarto(int numero, String tipo, double valorDiaria) {
        this.numero = numero;
        this.tipo = tipo;
        this.valorDiaria = valorDiaria;
        }
    }
