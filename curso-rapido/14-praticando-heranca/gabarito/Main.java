import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("===== Exercicio 1 =====");
        Carro carro = new Carro("Fiat", 2020, 4);
        Moto moto = new Moto("Honda", 2023, 160);
        carro.exibir();
        carro.buzinar();
        moto.exibir();
        moto.empinar();

        System.out.println("===== Exercicio 2 =====");
        ContaCorrente cc = new ContaCorrente("Ana", 500);
        ContaPoupanca cp = new ContaPoupanca("Bruno", 1000);
        cc.sacar(100);
        cc.sacar(1000);
        cp.renderJuros(1);
        cp.sacar(100);
        cc.exibir();
        cp.exibir();

        System.out.println("===== Exercicio 3 =====");
        Instrumento[] banda = { new Violao(), new Bateria(), new Piano(), new Instrumento("Triangulo") };
        for (Instrumento i : banda) {
            i.tocar();
        }

        System.out.println("===== Exercicio 4 =====");
        Forma[] formas = { new Retangulo(3, 4), new Triangulo(6, 3), new Circulo(2) };
        double areaTotal = 0;
        for (Forma f : formas) {
            f.exibir();
            areaTotal += f.area();
        }
        System.out.println("Area total: " + areaTotal);

        System.out.println("===== Exercicio 5 =====");
        Cachorro rex = new Cachorro("Rex");
        System.out.println(rex);
        System.out.println("Rex e um SerVivo? " + (rex instanceof SerVivo));

        System.out.println("===== Exercicio 6 =====");
        ArrayList<Funcionario> folha = new ArrayList<>();
        folha.add(new Gerente("Carla", 5000, 2000));
        folha.add(new Vendedor("Diego", 2000, 10000, 5));
        folha.add(new Estagiario("Elisa", 1200));

        double totalFolha = 0;
        Funcionario maior = folha.get(0);
        for (Funcionario f : folha) {
            f.exibir();
            if (f instanceof Vendedor v) {
                System.out.println("  vendeu " + v.getVendas());
            }
            totalFolha += f.calcularSalario();
            if (f.calcularSalario() > maior.calcularSalario()) {
                maior = f;
            }
        }
        System.out.println("Total da folha: " + totalFolha);
        System.out.println("Maior salario: " + maior.getNome());
    }
}

// ===== Exercicio 1: extends e super =====

class Veiculo {
    protected String marca;
    protected int ano;

    public Veiculo(String marca, int ano) {
        this.marca = marca;
        this.ano = ano;
    }

    public void exibir() {
        System.out.println(marca + " (" + ano + ")");
    }
}

class Carro extends Veiculo {
    private int portas;

    public Carro(String marca, int ano, int portas) {
        super(marca, ano);
        this.portas = portas;
    }

    public void buzinar() {
        System.out.println(marca + " de " + portas + " portas: bi bi!");
    }
}

class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String marca, int ano, int cilindradas) {
        super(marca, ano);
        this.cilindradas = cilindradas;
    }

    public void empinar() {
        System.out.println(marca + " " + cilindradas + "cc empinou!");
    }
}

// ===== Exercicio 2: @Override e super.metodo() =====

class Conta {
    protected String titular;
    protected double saldo;

    public Conta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        saldo = saldo + valor;
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo = saldo - valor;
        } else {
            System.out.println("Saldo insuficiente na conta de " + titular);
        }
    }

    public void exibir() {
        System.out.println(titular + " | Saldo: " + saldo);
    }
}

class ContaCorrente extends Conta {
    private static final double TARIFA = 2.0;

    public ContaCorrente(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    public void sacar(double valor) {
        super.sacar(valor + TARIFA);
    }

    @Override
    public void exibir() {
        super.exibir();
        System.out.println("  conta corrente (tarifa de " + TARIFA + " por saque)");
    }
}

class ContaPoupanca extends Conta {

    public ContaPoupanca(String titular, double saldo) {
        super(titular, saldo);
    }

    public void renderJuros(double percentual) {
        depositar(saldo * percentual / 100);
    }

    @Override
    public void exibir() {
        super.exibir();
        System.out.println("  conta poupanca");
    }
}

// ===== Exercicio 3: polimorfismo =====

class Instrumento {
    protected String nome;

    public Instrumento(String nome) {
        this.nome = nome;
    }

    public void tocar() {
        System.out.println(nome + " faz um som qualquer");
    }
}

class Violao extends Instrumento {
    public Violao() {
        super("Violao");
    }

    @Override
    public void tocar() {
        System.out.println(nome + ": dlem dlem");
    }
}

class Bateria extends Instrumento {
    public Bateria() {
        super("Bateria");
    }

    @Override
    public void tocar() {
        System.out.println(nome + ": tum tum pa");
    }
}

class Piano extends Instrumento {
    public Piano() {
        super("Piano");
    }

    @Override
    public void tocar() {
        System.out.println(nome + ": plim plim");
    }
}

// ===== Exercicio 4: classe abstrata =====

abstract class Forma {
    private String nome;

    public Forma(String nome) {
        this.nome = nome;
    }

    public abstract double area();

    public void exibir() {
        System.out.println(nome + " | area: " + area());
    }
}

class Retangulo extends Forma {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        super("Retangulo");
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double area() {
        return largura * altura;
    }
}

class Triangulo extends Forma {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        super("Triangulo");
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return base * altura / 2;
    }
}

class Circulo extends Forma {
    private double raio;

    public Circulo(double raio) {
        super("Circulo");
        this.raio = raio;
    }

    @Override
    public double area() {
        return 3.14 * raio * raio;
    }
}

// ===== Exercicio 5: varios niveis, ordem dos construtores e toString =====

class SerVivo {
    public SerVivo() {
        System.out.println("1. Construtor de SerVivo");
    }
}

class Animal extends SerVivo {
    protected String nome;

    public Animal(String nome) {
        // o Java coloca um super() escondido aqui, antes de tudo
        this.nome = nome;
        System.out.println("2. Construtor de Animal");
    }
}

class Cachorro extends Animal {
    public Cachorro(String nome) {
        super(nome);
        System.out.println("3. Construtor de Cachorro");
    }

    @Override
    public String toString() {
        return "Cachorro chamado " + nome;
    }
}

// ===== Exercicio 6: desafio da folha de pagamento =====

abstract class Funcionario {
    private String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public abstract double calcularSalario();

    public void exibir() {
        System.out.println(nome + " | Salario: " + calcularSalario());
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
}

class Vendedor extends Funcionario {
    private double vendas;
    private double percentualComissao;

    public Vendedor(String nome, double salarioBase, double vendas, double percentualComissao) {
        super(nome, salarioBase);
        this.vendas = vendas;
        this.percentualComissao = percentualComissao;
    }

    public double getVendas() {
        return vendas;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + vendas * percentualComissao / 100;
    }
}

class Estagiario extends Funcionario {
    private static final double AUXILIO_TRANSPORTE = 200;

    public Estagiario(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase + AUXILIO_TRANSPORTE;
    }
}
