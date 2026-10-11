import java.util.Scanner;

public class Contato {
    private String nome;
    private String telefone;
    private String email;
    Scanner sc = new Scanner(System.in);

    public String getNome(){
        return nome;
    }
    public String getTelefone(){
        return telefone;
    }
    public String getEmail(){
        return email;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public Contato(){
        System.out.println("Nome: Não informado");
        System.out.println("Email: Não informado");
        System.out.println("Telefone: Não informado");
    }
    public Contato(String nome){
        System.out.println("Qual o nome?");
        nome = sc.nextLine();

        System.out.println("Nome: " + nome);
        System.out.println("Email: Não informado");
        System.out.println("Telefone: Não informado");
    }
    public Contato(String nome, String email, String telefone){
        System.out.println("Qual o nome?");
        nome = sc.nextLine();
        System.out.println("Qual o email?");
        email = sc.nextLine();
        System.out.println("Qual o telefone??");
        telefone = sc.nextLine();

        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Telefone: " + telefone);
    }
}
