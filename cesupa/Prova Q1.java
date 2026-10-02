public class App {
    public static void main(String[] args) throws Exception {
        Turma t1 = new Turma("1234");
        Turma t2 = new Turma("9302", 11, 10, 300);

        t1.exibir();
        t2.exibir();
        t2.setidMinima(20);
        t2.exibir();
    }
}

class Turma {
    private String codigo;
    private int idMinima;
    private int vagas;
    private double mensalidade;

    public String queroCodigoKKK(){
        return codigo;
    }
    public int queroidade(){
        return idMinima;
    }
    public int queroVagas(){
        return this.vagas;
    }
    public double queroinheiro(){
        return this.mensalidade;
    }
    public void setCodigo(String co){
        if(co.length() > 3){
        codigo = co;}
    }
    public void setidMinima(int idMinima){
        if( 18 > idMinima && idMinima > 3 ){
        this.idMinima = idMinima;}
    }
    public void setVagas(int vagas){
        if( 16 > vagas && vagas > 6 ){
        this.vagas = vagas;}
    }
    public void setMensalidade(double mensalidade){
        if(413 >= mensalidade && mensalidade >= 110){
        this.mensalidade = mensalidade;}
    }

    public Turma(String codigo){
        setCodigo(codigo);
    }
    public Turma(String codigo, int idMinima, int vagas, double mensalidade){
        setCodigo(codigo);
        setMensalidade(mensalidade);
        setVagas(vagas);
        setidMinima(idMinima);
    }

    public void exibir(){
        System.out.println("Codigo: " + codigo + " Idade minima " + idMinima + " vagas: " + vagas + " mensalidade " + mensalidade);
    }
}

