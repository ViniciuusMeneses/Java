class Main {

    public void main(){

        funcionario f = new funcionario();
        f.setnome("Vinicius");
        f.setsalario(4050);
        f.exibir();
    }
}

class funcionario{

    private String nome;
    private double salario;

    public String getnome(){
        return this.nome;
    }

    public double getsalario(){
        if(salario >= 0){
            return this.salario;
        }else{
        return -1;}
    }

    public void setnome(String n){
        nome = n;
    }

    public void setsalario(double s){
        salario = s;
    }

    void exibir(){
        System.out.println("Nome: " + nome + " Salario: " + salario);

    }
}
