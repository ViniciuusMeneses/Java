package Instrumentos;

public class Violao extends instrumento {

    public Violao(String nome){
        super(nome);
    }

    @Override
    public void tocar(){
        System.out.println("Tocando Violão");
    }

    public void trocaCorda(){
        System.out.println("Trocando cordas");
    }

}
