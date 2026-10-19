package animal;

public abstract class canino extends animal{
    public canino(String nome, double peso){
        super(nome, peso);
    }

    public void cacar(){
        System.out.println(getNome() + " esta caçando");
    }
    public void vaguear(){
        System.out.println(getNome() + " Esta vagueando");
    }


}