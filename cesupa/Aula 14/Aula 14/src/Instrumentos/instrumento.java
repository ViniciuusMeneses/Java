package Instrumentos;

public abstract class instrumento {
    private String nome;

    public instrumento(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract void tocar();


}