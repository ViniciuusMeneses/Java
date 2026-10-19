package veiculos;

public class veiculo {
    private String marca;
    private int ano;


    public veiculo(String marca, int ano) {
        this.marca = marca;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }


    public void imprimir() {
        System.out.println(marca + " (" + ano + ")");
    }
}