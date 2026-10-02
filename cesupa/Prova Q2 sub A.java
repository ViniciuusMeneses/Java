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
    private String autor; // Erro aqui
    private ArrayList<leitores> leitores; // Erro aqui

    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){ // Erro aqui
        return autor;
    }
    public ArrayList<leitores> getLeitores(){ // Erro aqui
        return leitores;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public void setLeitores(ArrayList<leitores> leitores){ // Erro aqui
        this.leitores = leitores;
    }
    public livro(String titulo, String autor, ArrayList<usuario> leitores){
        this.titulo = titulo;
        this.autor = autor;
        this.leitores = this.leitores; // Erro aqui

    }
    public void adicionar(ArrayList<leitores> leitores){ // Erro aqui
        this.setLeitores(leitores);
    }
}
class biblioteca{
    private String nome;
    private ArrayList<livros> livros; // Erro aqui
    private String bibliotecario; // Erro aqui

    public ArrayList<livros> getLivros() { // Erro aqui
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
    public void setBibliotecario(String bibliotecario) { // Erro aqui
        this.bibliotecario = bibliotecario;
    }
    public void blibiotecario(String bibliotecario){ // Erro aqui
        this.bibliotecario = bibliotecario;
    }

}
