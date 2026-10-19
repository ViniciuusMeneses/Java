package animal;

public class leao extends felino {

    public leao(String nome, double peso){
        super(nome, peso);
    }

    @Override
    public void comer(){
        System.out.println(getNome() + " esta comendo carne");
    }

    @Override
    public void fazerBarulho(){
        System.out.println(getNome() + ": ROAAAAAR");
    }

    @Override
    public void escalarArvore(){
        System.out.println(getNome() + " subiu na arvore com dificuldade");
    }

}
