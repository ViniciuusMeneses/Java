import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

    }
}
class usuario{
    private String nome;
    private String email;
    private String numero;

    public String getNome(){
        return nome;
    }
    public String getEmail(){
        return email;
    }
    public String getNumero(){
        return numero;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setNumero(String numero){
        this.numero = numero;
    }

}
class livro{
    private String titulo;
    private String autor;
    private ArrayList<leitores> leitores;

    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public ArrayList<leitores> getLeitores(){
        return leitores;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public void setLeitores(ArrayList<leitores> leitores){
        this.leitores = leitores;
    }
    public livro(String titulo, String autor, ArrayList<usuario> leitores){
        this.titulo = titulo;
        this.autor = autor;
        this.leitores = this.leitores;

    }
    public void adicionar(ArrayList<leitores> leitores){
        this.setLeitores(leitores);
    }
}
class biblioteca{
    private String nome;
    private ArrayList<livros> livros;
    private String bibliotecario;

    public ArrayList<livros> getLivros() {
        return livros;
    }
    public String getNome() {
        return nome;
    }
    public String getBibliotecario() {
        return bibliotecario;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setBibliotecario(String bibliotecario) {
        this.bibliotecario = bibliotecario;
    }
    public void blibiotecario(String bibliotecario){
        this.bibliotecario = bibliotecario;
    }

}
