import java.util.ArrayList;

public class Main{
    public static void main(){
        Covidado c1 = new Covidado("vini");
        Covidado c2 = new Covidado("Rebeca");
        Covidado c3 = new Covidado("Debora");
        Covidado c4 = new Covidado("Feijao");

        ArrayList<Covidado> l1 = new ArrayList<>();
        l1.add(c1);
        l1.add(c2);
        l1.add(c3);
        l1.add(c4);
        for(Covidado c : l1) {
            System.out.println(c.nome);
        }
        System.out.println("Numero de convidados: " + l1.size());

    }
}

