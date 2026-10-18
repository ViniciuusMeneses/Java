package veiculos;

public class carro extends veiculo {
    private int numeroPortas;

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public void buzina(String marca){
        System.out.println(marca + " de " + getNumeroPortas() + " Portas: bi bi! ");
    }

    public carro(int numeroPortas){
        super(veiculo);
        this.numeroPortas = numeroPortas;

    }

}
