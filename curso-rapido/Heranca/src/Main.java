import animais.Cachorro;
import animais.Gato;

public class Main {
    public static void main() {
        Cachorro c1 = new Cachorro("Luke");
        Gato g1 = new Gato("Gato");

        c1.beber();
        c1.lamber();
        g1.miar();

    }
}
