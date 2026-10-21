package videolocadora;

public abstract class Video extends Midia{

    private String qualidade;

    public Video(String titulo, String duracao, String qualidade){
        super(titulo, duracao);
        this.qualidade = qualidade;
    }

    public void acrecimoQualidade(String qualidade){
        valor = valor + 3;
    }

    public String getQualidade() {
        return qualidade;
    }

    public void setQualidade(String qualidade) {
        this.qualidade = qualidade;
    }
}
