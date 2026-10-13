import java.util.ArrayList;

public class Estacionamento {
    private String nome;
    private int capacidade = 2;
    private ArrayList<Veiculos> veiculos = new ArrayList<>();

    public String getNome(){
        return nome;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public ArrayList<Veiculos> getVeiculos() {
        return veiculos;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void addVeiculo(Veiculos sla){
        if(veiculos.size() < capacidade) {
            if (sla.getPlaca() != null) {
                veiculos.add(sla);
                System.out.println("Veículo Adicionado");
            } else {
                System.out.println("Placa invalida, n foi possivel adicionar");
            }
        } else{
            System.out.println("Não pode entra, Capacidade maxima atingida");
        }
    }
}
