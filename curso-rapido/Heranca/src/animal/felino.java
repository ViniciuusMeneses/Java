package animal;

public abstract class felino extends animal {
    public felino(String nome, double peso){
        super(nome, peso);
    }

    public abstract void escalarArvore();
    public abstract void comer();

}
