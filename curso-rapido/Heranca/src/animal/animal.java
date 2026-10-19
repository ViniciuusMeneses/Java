package animal;

public abstract class animal {

    private String nome;
    private double peso;

    public animal(String nome, double peso){
        setNome(nome);
        setPeso(peso);
    }

    public void dormi(){
        System.out.println("zzzzzz");
    }
    public abstract void fazerBarulho();
    public abstract void comer();

    public String toString(){
        return "nome: " + getNome() + "peso: " + getPeso();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
