package animal;

public class lobo extends canino{

    public lobo(String nome, double peso){
        super(nome, peso);
    }
    @Override
    public void comer(){
        System.out.println(getNome() + " esta comendo");
    }

    @Override
    public void fazerBarulho(){
        System.out.println(getNome() + "auuuuuuuuuuuu");
    }

}
