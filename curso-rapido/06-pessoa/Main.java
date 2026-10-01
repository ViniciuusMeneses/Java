class Main {
    void main() {

        pessoa p = new pessoa("Ana", 25);
        System.out.println(p.getnome());
        System.out.println(p.getidade());

    }
}

class pessoa{
   private String nome;
   private int idade;

   public String getnome(){
       return nome;
   }
   public int getidade(){
       return idade;
   }

   public pessoa(String nome, int idade){

       this.nome = nome;
       this.idade = idade;

   }
    public void setidade(int idade){
        if(idade >= 0){
            this.idade = idade;
        }
    }

}
