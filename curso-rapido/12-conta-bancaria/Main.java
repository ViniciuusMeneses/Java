import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome da conta 1:");
        String nome1 = sc.nextLine();
        System.out.println("Saldo da conta 1:");
        double saldo1 = sc.nextDouble();

        sc.nextLine();  

        System.out.println("Nome da conta 2:");
        String nome2 = sc.nextLine();
        System.out.println("Saldo da conta 2:");
        double saldo2 = sc.nextDouble();

        contaBancaria cb1 = new contaBancaria(nome1, saldo1);
        contaBancaria cb2 = new contaBancaria(nome2, saldo2);

        System.out.println("Transferir de " + cb1.getNome() + " para " + cb2.getNome() + "?");
        System.out.println("Digite 1, ou 2 para o inverso:");
        byte conta = sc.nextByte();

        System.out.println("Quanto voce quer transferir?");
        double valor = sc.nextDouble();

        sc.close();

        if (conta == 1) cb1.transferir(cb2, valor);
        else            cb2.transferir(cb1, valor);

        cb1.imprimir();
        cb2.imprimir();
    }
}

class contaBancaria {
    private String nome;
    private double saldo;

    public contaBancaria(String nome, double saldo) {
        this.nome = nome;
        if (saldo >= 0) { this.saldo = saldo; } else { this.saldo = -1; }
    }

    public String getNome() {
        return this.nome;
    }

    public void transferir(contaBancaria destino, double valor) {
        if (this.saldo >= valor) {
            this.saldo = this.saldo - valor;          
            destino.saldo = destino.saldo + valor;    
        } else {
            System.out.println("Saldo insuficiente na conta de " + this.nome);
        }
    }

    public void imprimir() {
        System.out.println("Nome da conta: " + this.nome + " Saldo: " + this.saldo);
    }
}
