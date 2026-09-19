public class Main {
    public static void main(String[] args) {
     carro ca = new carro();
     pessoa c = new pessoa("Ana", 25);
     pessoa c2 = new pessoa("Bia");
     gato cg = new gato("Felix");
     ca.ligarcarro();
     cg.comer();
     cg.miar();
     cg.apresentar();
     System.out.println(c.getnome());
     System.out.println(c.getidade());
     System.out.println(c2.getnome());
     System.out.println(c2.getidade());
    }
}

class motor {

    public void motorligar(){
        System.out.println("Vrum");
    }
}

class carro {
    private motor meuMotor;

    public carro() {
        this.meuMotor = new motor();
            }
    public void ligarcarro(){
        meuMotor.motorligar();
    }
        }

class animal {

    String nome;

    public void apresentar(){
        System.out.println("sou um animal");
    }

    public animal(String nome){
        this.nome = nome;
    }

    public void comer() {
        System.out.println(nome + " esta comendo");
    }
}
    class gato extends animal{
        public gato(String nome){
            super(nome);
        }
        public void miar(){
            System.out.println(nome + " faz miau");
        }
        @Override
        public void apresentar(){
            System.out.println("Sou um gato");
        }

    }



class pessoa {
    private String nome;
    private int idade;

    public pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public pessoa(String nome) {
        this(nome, 0);
    }

    public String getnome(){
    return nome;
    }

    public int getidade(){
        return idade;
    }

    public void setidade(int idade) {
        if (idade >= 0){
        this.idade = idade;
    }
}
}
