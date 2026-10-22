package videolocadora;

public class Filme extends Video{

    public Filme(String titulo, String duracao, String qualidade){
        super(titulo, duracao, qualidade);
    }

    public void treiler(){
        System.out.println("Treiler");
    }

    @Override
    public void calcularPreco() {
        setValor(getValor() + 8);
        if( getQualidade() == "4K"){
            setValor(getValor() + 3);
        }
    }

    @Override
    public void exibirFicha(){

        System.out.println("Titulo: " + getTitulo());
        System.out.println("Duração: " + getDuração());
        System.out.println("Valor: " + getValor());

    }
}
