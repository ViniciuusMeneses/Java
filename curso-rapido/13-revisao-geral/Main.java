import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome do funcionario:");
        String nome = sc.nextLine();
        System.out.println("Salario base:");
        double sal = sc.nextDouble();

        Funcionario f = new Funcionario(nome, sal);
        f.setSalarioBase(-100);
        f.exibir();

        Gerente g = new Gerente("Chefe", 3000, 1500);
        g.exibir();

        Carro carro = new Carro("Fiat", 1.0);
        carro.exibir();

        Professor prof = new Professor("Girotto");
        Turma turma = new Turma("Prog2", prof);
        turma.exibir();

        System.out.println("Numero de linhas da matriz:");
        int linhas = sc.nextInt();
        System.out.println("Numero de colunas:");
        int colunas = sc.nextInt();
        int[][] matriz = new int[linhas][colunas];
        int valor = 1;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = valor;
                valor++;
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("[Matriz] tudo certo aqui");

        sc.close();
    }
}

class Funcionario {
    protected String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }
    public String getNome() {
        return nome;
    }
    public double getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(double salarioBase) {
        if (salarioBase >= 0) {
            this.salarioBase = salarioBase;
        } else {
            System.out.println("Salario invalido");
        }
    }
    public double calcularSalario() {
        return salarioBase;
    }
    public void exibir() {
        System.out.println(nome + " | Salario: " + calcularSalario());
        System.out.println("[Funcionario] tudo certo aqui");
    }
}

class Gerente extends Funcionario {
    private double bonus;

    public Gerente(String nome, double salarioBase, double bonus) {
        super(nome, salarioBase);
        this.bonus = bonus;
    }
    @Override
    public double calcularSalario() {
        return salarioBase + bonus;
    }
    @Override
    public void exibir() {
        super.exibir();
        System.out.println("[Gerente] tudo certo aqui");
    }
}

class Motor {
    private double potencia;

    public Motor(double potencia) {
        this.potencia = potencia;
    }
    public double getPotencia() {
        return potencia;
    }
}

class Carro {
    private String modelo;
    private Motor motor;

    public Carro(String modelo, double potencia) {
        this.modelo = modelo;
        this.motor = new Motor(potencia);
    }
    public void exibir() {
        System.out.println("Carro " + modelo + " | Motor " + motor.getPotencia());
        System.out.println("[Carro] tudo certo aqui");
    }
}

class Professor {
    private String nome;

    public Professor(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
}

class Turma {
    private String codigo;
    private Professor professor;

    public Turma(String codigo, Professor professor) {
        this.codigo = codigo;
        this.professor = professor;
    }
    public void exibir() {
        System.out.println("Turma " + codigo + " | Prof " + professor.getNome());
        System.out.println("[Turma] tudo certo aqui");
    }
}
