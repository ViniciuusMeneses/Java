package Banco;

public abstract class conta  {
     private String nome;
     private double saldo;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public conta(String nome, double saldo){
        this.nome = nome;
        this.saldo = saldo;
    }

    public void exibir(){
        System.out.println("Titular " + nome);
        System.out.println("Saldo: " + saldo);
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            setSaldo(saldo - valor);
        }else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void depositar(double valor){
        this.saldo = saldo + valor;
    }
}

