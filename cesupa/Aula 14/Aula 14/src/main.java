package Instrumentos;

public class main{
void main() {

        instrumento v1 = new Violao("v1");
        instrumento b1 = new Bateria("b1");

        v1.tocar();
        b1.tocar();
        ((Violao)v1).trocaCorda();


}
}
