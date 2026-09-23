import java.util.Scanner;

class main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        jogo j1 = new jogo();
        jogo j2 = new jogo();

        System.out.println("Qual nome do jogo 1? ");
        j1.nome = sc.nextLine();

        System.out.println("Qual o valor do jogo 1?");
        j1.valor = sc.nextInt();
        sc.nextLine();

        System.out.println("Qual o nome do jogo 2?");
        j2.nome = sc.nextLine();

        System.out.println("Qual o valor do jogo 2?");
        j2.valor = sc.nextInt();

        j1.jogo();
        j2.jogo();

    }
}

class jogo{

    String nome;
    int valor;

    public void jogo(){

        System.out.println("Nome: " + nome);

        if(valor >= 150){
            valor = valor - (valor/10);
        }

        System.out.println("Valor: " + valor);
    }
}
