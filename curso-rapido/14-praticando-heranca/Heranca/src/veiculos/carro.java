package veiculos;

public class carro extends veiculo {
    private int numeroPortas;

    public carro(String marca, int ano, int numeroPortas) {
        super(marca, ano);
        this.numeroPortas = numeroPortas;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public void buzina() {
        System.out.println(getMarca() + " de " + getNumeroPortas() + " portas: bi bi!");
    }
}
