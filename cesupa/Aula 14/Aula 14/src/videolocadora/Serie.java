package videolocadora;

public class Serie extends Video{

    private int Temporadas;

    public Serie(String titulo, String qualidade, int temporadas){
        super(titulo,"0", qualidade);
        setTemporadas(temporadas);
    }

    @Override
    public void calcularPreco() {
        setValor(getValor() + (5 * getTemporadas()));
        if( getQualidade() == "4K"){
            setValor(getValor() + 3);
        }
    }

    @Override
    public void exibirFicha(){

        System.out.println("Titulo: " + getTitulo());
        System.out.println("Temporadas: " + getTemporadas());
        System.out.println("Valor: " + getValor());

    }


    public int getTemporadas() {
        return Temporadas;
    }

    public void setTemporadas(int temporadas) {
        Temporadas = temporadas;
    }
}
