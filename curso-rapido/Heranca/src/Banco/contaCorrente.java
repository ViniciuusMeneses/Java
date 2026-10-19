package Banco;

public class contaCorrente extends conta {

    private double tarifa = 2;

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public contaCorrente(String nome, double saldo) {
        super(nome, saldo);
    }

    public void exibir() {
        System.out.println("Titular " + super.getNome());
        System.out.println("Saldo: " +  super.getSaldo());
        System.out.println("Conta corrente");
        System.out.println("2% de taxa de saldo");
    }
    @Override
    public void sacar(double valor) {
        double temp = valor + tarifa;
        super.sacar(temp);
    }
}

