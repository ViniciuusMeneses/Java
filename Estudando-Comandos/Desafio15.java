import java.util.HashMap;

public class Desafio15 {
    public static void main(String[] args) {
        HashMap<String, Integer> idades = new HashMap<>();

        idades.put("Ana", 20);
        idades.put("Bruno", 25);
        idades.put("Carla", 30);

        System.out.println("Idade de Bruno: " + idades.get("Bruno"));
        System.out.println("Tem 'Ana'? " + idades.containsKey("Ana"));
        System.out.println("Total: " + idades.size());

        for (String nome : idades.keySet()) {
            System.out.println(nome + " tem " + idades.get(nome) + " anos");
        }
    }
}
