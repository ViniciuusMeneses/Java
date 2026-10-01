class Main {
    public static void main(String[] args) {

        personagem p = new personagem();

        p.nome = "vinicius";
        p.vida = "Paraense";
        p.nivel = 10;

        p.mostraficha();
        p.subirnivel();
        p.subirnivel();

    }
}


class personagem{

    String nome;
    String vida;
    int nivel;

    public void mostraficha(){

        System.out.println(nome + " " + vida + " " + nivel);

    }

    public void subirnivel(){

        nivel = nivel + 1;
        System.out.println(nivel);

    }

}
