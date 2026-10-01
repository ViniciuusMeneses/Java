import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome do time:");
        String nome = sc.nextLine();

        System.out.println("Nome do tecnico:");
        String tecnico = sc.nextLine();

        TimeFutebol time = new TimeFutebol(nome, tecnico);

        System.out.println("Nome do jogador:");
        String jogador = sc.nextLine();

        System.out.println("Posicao:");
        String posicao = sc.nextLine();

        System.out.println("Quantidade de gols:");
        int gols = sc.nextInt();

        System.out.println("Quantidade de partidas:");
        int partidas = sc.nextInt();

        time.adicionarJogador(jogador, posicao, gols, partidas);

        System.out.println("Nome de outro jogador:");
        sc.nextLine();
        jogador = sc.nextLine();

        System.out.println("Posicao:");
        posicao = sc.nextLine();

        System.out.println("Quantidade de gols:");
        gols = sc.nextInt();

        System.out.println("Quantidade de partidas:");
        partidas = sc.nextInt();

        time.adicionarJogador(jogador, posicao, gols, partidas);

        System.out.println("Nome do adversario:");
        sc.nextLine();
        String adversario = sc.nextLine();

        System.out.println("Gols do time:");
        int golsTime = sc.nextInt();

        System.out.println("Gols do adversario:");
        int golsAdversario = sc.nextInt();

        time.registrarPartida(adversario, golsTime, golsAdversario);

        time.imprimir();

        sc.close();
    }
}

class TimeFutebol {
    private String nome;
    private String tecnico;

    private ArrayList<String> jogadores = new ArrayList<>();
    private ArrayList<String> posicoes = new ArrayList<>();
    private ArrayList<Integer> gols = new ArrayList<>();
    private ArrayList<Integer> partidas = new ArrayList<>();

    private int vitorias = 0;
    private int empates = 0;
    private int derrotas = 0;

    public TimeFutebol(String nome, String tecnico) {
        this.nome = nome;
        this.tecnico = tecnico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    public void adicionarJogador(String nome, String posicao, int gols, int partidas) {
        jogadores.add(nome);
        posicoes.add(posicao);
        this.gols.add(gols);
        this.partidas.add(partidas);
    }

    public void removerJogador(String nome) {
        int x = jogadores.indexOf(nome);

        if (x >= 0) {
            jogadores.remove(x);
            posicoes.remove(x);
            gols.remove(x);
            partidas.remove(x);
        }
    }

    public void registrarPartida(String adversario, int golsTime, int golsAdversario) {
        System.out.println(nome + " x " + adversario);
        System.out.println(golsTime + " x " + golsAdversario);

        if (golsTime > golsAdversario) {
            vitorias++;
        } else if (golsTime == golsAdversario) {
            empates++;
        } else {
            derrotas++;
        }
    }

    public void mostrarEstatisticas() {
        System.out.println("Vitorias: " + vitorias);
        System.out.println("Empates: " + empates);
        System.out.println("Derrotas: " + derrotas);
    }

    public void mostrarArtilheiro() {
        if (jogadores.size() == 0) {
            return;
        }

        int maior = 0;

        for (int i = 1; i < gols.size(); i++) {
            if (gols.get(i) > gols.get(maior)) {
                maior = i;
            }
        }

        System.out.println("Artilheiro: " + jogadores.get(maior));
        System.out.println("Gols: " + gols.get(maior));
    }

    public void mostrarMaisPartidas() {
        if (jogadores.size() == 0) {
            return;
        }

        int maior = 0;

        for (int i = 1; i < partidas.size(); i++) {
            if (partidas.get(i) > partidas.get(maior)) {
                maior = i;
            }
        }

        System.out.println("Jogador com mais partidas: " + jogadores.get(maior));
        System.out.println("Partidas: " + partidas.get(maior));
    }

    public void mostrarJogadores() {
        System.out.println("\nJogadores:");

        for (int i = 0; i < jogadores.size(); i++) {
            System.out.println(
                    jogadores.get(i) + " - " +
                            posicoes.get(i) + " - " +
                            gols.get(i) + " gols - " +
                            partidas.get(i) + " partidas"
            );
        }
    }

    public void imprimir() {
        System.out.println("\nTime: " + nome);
        System.out.println("Tecnico: " + tecnico);

        mostrarJogadores();

        System.out.println("\nEstatisticas:");
        mostrarEstatisticas();

        System.out.println();
        mostrarArtilheiro();

        System.out.println();
        mostrarMaisPartidas();
    }
}
