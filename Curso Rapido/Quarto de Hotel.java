class Main {

    public void main() {
        quarto q = new quarto(101, "casal", 250);
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
