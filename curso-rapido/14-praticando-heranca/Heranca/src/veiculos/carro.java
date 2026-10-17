package veiculos;

public class carro extends veiculo {
    private short numeroPortas;

    public short getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(short numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public void imprimir(){
        System.out.println(getMarca() + "de" + getNumeroPortas() + "Portas: bi bi! ");
    }

    public carro(String marca, int ano){
        super(marca);
        super(ano);


    }

}
