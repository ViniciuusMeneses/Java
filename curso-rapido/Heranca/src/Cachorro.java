package animais;

public class Cachorro extends Animal {
    public void latir(){
        System.out.printf("%s latiu", getNome());
    }
    public void lamber(){
        System.out.printf("%s lambeu", getNome());
    }
}
