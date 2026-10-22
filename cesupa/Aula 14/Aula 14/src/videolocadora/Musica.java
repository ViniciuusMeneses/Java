import videolocadora.Midia;

public class Musica extends Midia {

public Musica(String titulo){
    super(titulo, "0");
}

@Override
    public void calcularPreco(){
    setValor(2);
}

@Override
public void exibirFicha(){
    System.out.println("Titulo: " + getTitulo());
    System.out.println("Valor; " + getValor());
}

public void addPlaylist(){
    System.out.println("Adicionado na playlist");
}


}
