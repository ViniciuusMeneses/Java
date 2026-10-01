class Main {
    public static void main(String[] args) {
        prestador p1 = new prestador("Vinicius");
        prestador p2 = new prestador("Vinicius", "Robotica", 150);
        p1.exbir();
        p2.exbir();
        p1.prestadores2(p2);
    }
}

class prestador{

    String nome;
    String especialidade;
    double preco;

    public prestador(String nome){
        this.nome = nome;
        especialidade = "a definir";
        preco = 100;
    }

    public prestador(String nome,String especialidade, double preco){
        this.nome = nome;
        this.especialidade = especialidade;
        this.preco = preco;
    }

    public void prestadores2(prestador p2){
        double gasto =  this.preco + p2.preco;
        System.out.println("Para contrata ambos voce gastara " + gasto);
    }


    public void exbir(){
        System.out.println(" Nome: "+ nome + " especialidade: "+ especialidade + " preco: "+ preco);
    }

}
