package animal;

public class cachorro extends canino {
    public cachorro(String nome, double peso){
        super(nome, peso);
    }

    @Override
    public void comer(){
        System.out.println(getNome() + " esta comendo ração");
    }
    @Override
    public void fazerBarulho(){
        System.out.println("auauauauaua");
    }
    public void abanarRabo(){
        System.out.println(getNome() + " esta feliz");
    }

}
