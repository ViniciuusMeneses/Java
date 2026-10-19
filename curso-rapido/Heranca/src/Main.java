import Banco.conta;
import Banco.contaPoupança;
import animais.Gato;
import veiculos.moto;
import  Banco.contaCorrente;

public class Main {
    public static void main() {
        //1°
       // animais.Cachorro c1 = new animais.Cachorro("Luke");
       // Gato g1 = new Gato("Gato");

       // c1.beber();
       // c1.lamber();
       // g1.miar();

        //2°
       // veiculos.carro c1 = new veiculos.carro("honda", 2020, 4);
       // veiculos.moto m1 = new moto("Yamaha", 2023, " 125 cilidradas");
       // c1.imprimir();
       // c1.buzina();

        //m1.imprimir();
       // m1.empinar();

        //3
        contaCorrente cc1 = new contaCorrente("Vinicius", 500);
        contaPoupança cp1 = new contaPoupança("edu", 1000);

        //cc1.exibir();
        //cc1.depositar(400);
        //cc1.exibir();
        cp1.exibir();
        cp1.sacar(100);
        cp1.exibir();




    }
}
