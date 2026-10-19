package Banco;

public class contaPoupança extends conta{

    public contaPoupança(String nome, double saldo){
        super(nome, saldo);
    }

    public void sacar(double valor){
        setSaldo(getSaldo() * 1.01);
        super.sacar(valor);
    }

}
