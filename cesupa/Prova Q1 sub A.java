public class Main {

    public static void main(String[] args) {
        curso c1 = new curso("vinicius", 15, 15);
        curso c2 = new curso();

        c1.exibir();
        c2.exibir();
    }
}

class curso{
    private String nome;
    private int cargaHoraria;
    private int vagas;

    public String getnome(){
        return nome;
    }
    public int getcargaHoraria(){
        return cargaHoraria;
    }
    public int getvagas(){
        return vagas;
    }
    public void setnome(String nome){
        if(nome.length()<3){
        this.nome = nome;}
    }
    public void setcargaHoraria(int cargaHoraria){
        if(cargaHoraria>=10 && cargaHoraria<=200){
        this.cargaHoraria = cargaHoraria;}
    }
    public void setvagas(int vagas){
        if(vagas>=1 && vagas<=40){
        this.vagas = vagas;}
    }
    public curso(String nome, int cargaHoraria, int vagas){
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.vagas = vagas;
    }
    public curso(){
        this.nome = "";
        this.cargaHoraria = 0;
        this.vagas = 0;
    }
    public void exibir(){
        System.out.println("Nome do curso: " + this.nome);
        System.out.println("Vagas do curso: " + this.vagas);
        System.out.println("Vagas do curso: " + this.vagas);
    }

}
