package veiculos;

public class veiculo {
    private String marca;
    private int ano;

    public veiculo(String marca) {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public veiculo(String marca, int ano){
        this.marca = marca;
        this.ano = ano;
    }

    public void impimir(){
        getAno();
        getMarca();
        System.out.println( marca + " (" + ano + ") ");
    }
}