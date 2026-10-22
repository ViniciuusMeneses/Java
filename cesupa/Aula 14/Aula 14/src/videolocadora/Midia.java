package videolocadora;

public abstract class Midia {

    private String titulo;
    private String duração;
    public double valor = 0;

    public Midia(String titulo, String duração){
        setTitulo(titulo);
        setDuração(duração);
    }

    public abstract void calcularPreco();

    public abstract void exibirFicha();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDuração() {
        return duração;
    }

    public void setDuração(String duração) {
        this.duração = duração;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
