package Instrumentos;
import  videolocadora.*;

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
        Video s1 = new Serie("sla","4K", 2);
        Midia m1 = new Musica("sla");


        f1.calcularPreco();
        f1.exibirFicha();
        if (f1 instanceof Filme) {
                ((Filme) f1).treiler();
        }

        System.out.println("");

        s1.calcularPreco();
        s1.exibirFicha();
        if (s1 instanceof Serie) {
                ((Serie)s1).listaTempordas();
        }
        System.out.println("");

        m1.calcularPreco();
        m1.exibirFicha();
        if (m1 instanceof Musica) {
                ((Musica)m1).addPlaylist();
        }






}
}
