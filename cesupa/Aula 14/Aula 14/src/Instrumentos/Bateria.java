package Instrumentos;

public class Bateria extends instrumento {

    public Bateria(String nome){
        super(nome);
    }

    @Override
    public void tocar(){
        System.out.println("Tocando bateria");
    }

    public void afinarTambores(){
        System.out.println("Afinando Tambores");
    }
}
