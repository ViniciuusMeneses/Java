import java.util.Scanner;
public class Pessoa {
    private String nome;
    private String data;
    private int numeroDaConta;

    public String getNome(){
        return nome;
    }
    public String getData(){
        return data;
    }
    public int getNumeroDaConta(){
        return numeroDaConta;
    }
    public void setNome(String nome){
        if(nome.length() >= 3) {
            this.nome = nome;
        }
    }
    public void setData(String data) {
        if(data.length() == 8 || data.length() == 10){
        if(data.charAt(2) == '/'){
        this.data = data;
        } else{
            this.data =  data.substring(0,2) + "/" + data.substring(2,4) + "/" +  data.substring(4);
        }
    } else{
            System.out.println("Data invalida");
    }}
    public void setData(int dia, int mes, int ano){
        this.data = dia + "/" + mes + "/" + ano;
    }
    public void setNumeroDaConta(int numeroDaConta) {
        if( numeroDaConta >= 100 && numeroDaConta <= 500){
        this.numeroDaConta = numeroDaConta;
        }
    }
    public Pessoa(String nome, String data, int numeroDaConta){
        setNome(nome);
        setData(data);
        setNumeroDaConta(numeroDaConta);

        System.out.println("Nome: " + this.nome);
        System.out.println("Data: " + this.data);
        System.out.println("Numero Da Conta: " + this.numeroDaConta);
    }
    public Pessoa(){
        System.out.println("Nome: Não informado ");
        System.out.println("Data: Não informado ");
        System.out.println("Numero Da Conta: Não informado");
    }
}
