package animal;

public class gato extends felino {

    public gato(String nome, double peso){
        super(nome, peso);
    }

    @Override
    public void comer(){
        System.out.println(getNome() + " esta comendo peixe");
    }

    @Override
    public void fazerBarulho(){
        System.out.println(getNome() + ": miaaaau");
    }

    @Override
    public void escalarArvore(){
        System.out.println(getNome() + " subiu na arvore rapidinho");
    }

}
