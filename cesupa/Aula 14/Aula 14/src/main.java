package Instrumentos;
import  videolocadora.*;

import videolocadora.Filme;
import videolocadora.Video;

public class main{
void main() {
       // 1°
       // instrumento v1 = new Violao("v1");
       // instrumento b1 = new Bateria("b1");

       // v1.tocar();
        // b1.tocar();
        //((Violao)v1).trocaCorda();

        //2°

        Video f1 = new Filme("Star Wars", "2h", "4K");

        f1.calcularPreco();
        f1.exibirFicha();




}
}
