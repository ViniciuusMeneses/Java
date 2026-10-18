package veiculos;

public class moto extends veiculo {
    private String cilidradas;

    public String getCilidradas() {
        return cilidradas;
    }

    public void setCilidradas(String cilidradas) {
        this.cilidradas = cilidradas;
    }

    public moto(String marca, int ano, String cilidradas){
        super(marca, ano);
        this.cilidradas = cilidradas;
    }
    public void empinar(){
        System.out.println(getMarca() + cilidradas + " empinou");
    }
}
