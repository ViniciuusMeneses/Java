# 14 - Praticando herança

Seis exercícios de herança, do mais fácil ao desafio. Cada um treina uma ideia nova.

## Como fazer

1. Abra o [`Main.java`](Main.java) desta pasta. O `main` já está escrito, mas comentado.
2. Leia o enunciado do exercício e escreva as classes no fim do arquivo.
3. Tire o comentário do bloco daquele exercício no `main`.
4. Rode e compare com a **saída esperada**:

   ```bash
   cd curso-rapido/14-praticando-heranca
   java Main.java
   ```

5. Faça o **Experimente** de cada exercício. É ali que você entende o porquê das coisas.

Travou? A solução completa está em [`gabarito/Main.java`](gabarito/Main.java). Tente sozinho antes de abrir.

## Resumo rápido

| Palavra | Para que serve |
| --- | --- |
| `class B extends A` | `B` herda os atributos e métodos de `A`. `B` é a subclasse (filha) e `A` a superclasse (mãe). |
| `super(...)` | Chama o construtor da mãe. Tem que ser a primeira linha do construtor da filha. |
| `super.metodo()` | Chama a versão da mãe de um método que a filha sobrescreveu. |
| `protected` | A filha consegue acessar o atributo direto. Com `private`, só pelo getter. |
| `@Override` | Avisa que o método substitui um da mãe. Se o nome estiver errado, o compilador acusa. |
| `abstract` | Classe que não pode ser instanciada (`new`). Método `abstract` não tem corpo e toda filha é obrigada a implementar. |
| `instanceof` | Pergunta se um objeto é de uma classe (ou de uma filha dela). |

---

## Exercício 1 - Veículos (`extends` e `super`)

Crie três classes:

- **`Veiculo`**
  - atributos `protected`: `marca` (`String`) e `ano` (`int`)
  - construtor que recebe `marca` e `ano`
  - `exibir()`: imprime `Fiat (2020)`
- **`Carro`**, filha de `Veiculo`
  - atributo `portas` (`int`)
  - construtor que recebe `marca`, `ano` e `portas` e usa `super(...)` para os dois primeiros
  - `buzinar()`: imprime `Fiat de 4 portas: bi bi!`
- **`Moto`**, filha de `Veiculo`
  - atributo `cilindradas` (`int`)
  - construtor que recebe `marca`, `ano` e `cilindradas`
  - `empinar()`: imprime `Honda 160cc empinou!`

Repare que `Carro` e `Moto` não escrevem `exibir()`, mas conseguem chamar: herdaram da mãe.

**Saída esperada:**

```
===== Exercicio 1 =====
Fiat (2020)
Fiat de 4 portas: bi bi!
Honda (2023)
Honda 160cc empinou!
```

**Experimente:**

- Apague a linha do `super(...)` no construtor de `Carro`. Qual erro aparece? Por quê?
- Troque `protected` por `private` em `marca`. O que quebra? Como resolver com um `getMarca()`?

---

## Exercício 2 - Contas (`@Override` e `super.metodo()`)

- **`Conta`**
  - atributos `protected`: `titular` (`String`) e `saldo` (`double`)
  - construtor que recebe `titular` e `saldo`
  - `depositar(valor)`: soma o valor ao saldo
  - `sacar(valor)`: se tiver saldo, desconta. Se não, imprime `Saldo insuficiente na conta de Ana`
  - `exibir()`: imprime `Ana | Saldo: 398.0`
- **`ContaCorrente`**, filha de `Conta`
  - cobra uma tarifa de `2.0` em todo saque: sobrescreva `sacar` e chame `super.sacar(valor + TARIFA)`
  - sobrescreva `exibir()`: chame `super.exibir()` e depois imprima `  conta corrente (tarifa de 2.0 por saque)`
- **`ContaPoupanca`**, filha de `Conta`
  - método novo `renderJuros(percentual)`: deposita `saldo * percentual / 100`
  - sobrescreva `exibir()`: chame `super.exibir()` e depois imprima `  conta poupanca`

Dica: a tarifa pode ser uma constante: `private static final double TARIFA = 2.0;`

**Saída esperada:**

```
===== Exercicio 2 =====
Saldo insuficiente na conta de Ana
Ana | Saldo: 398.0
  conta corrente (tarifa de 2.0 por saque)
Bruno | Saldo: 910.0
  conta poupanca
```

**Experimente:**

- No `sacar` da `ContaCorrente`, troque `super.sacar(...)` por só `sacar(...)` (sem o `super.`). Rode. O que aconteceu e por quê?
- Escreva `@Override` em cima de um método `sacarr` (com dois `r`). O que o compilador diz?

---

## Exercício 3 - Banda (polimorfismo)

Polimorfismo é guardar objetos de classes diferentes numa variável do tipo da mãe. Cada um continua se comportando do seu jeito.

- **`Instrumento`**
  - atributo `protected` `nome` (`String`)
  - construtor que recebe `nome`
  - `tocar()`: imprime `Triangulo faz um som qualquer`
- **`Violao`**, **`Bateria`** e **`Piano`**, filhas de `Instrumento`
  - construtor **sem parâmetros** que chama `super("Violao")` (ou `"Bateria"`, `"Piano"`)
  - sobrescrevem `tocar()`:
    - `Violao: dlem dlem`
    - `Bateria: tum tum pa`
    - `Piano: plim plim`

O vetor do `main` é do tipo `Instrumento[]`, mas guarda um violão, uma bateria, um piano e um instrumento comum.

**Saída esperada:**

```
===== Exercicio 3 =====
Violao: dlem dlem
Bateria: tum tum pa
Piano: plim plim
Triangulo faz um som qualquer
```

**Experimente:**

- Crie um método `afinar()` só no `Violao` e tente chamar `banda[0].afinar()`. Não compila, mesmo `banda[0]` sendo um violão. Por quê?
  (Resposta: o **tipo da variável** decide quais métodos você pode chamar. O **tipo do objeto** decide qual versão roda.)

---

## Exercício 4 - Formas (classe abstrata)

Não existe "uma forma qualquer" para calcular área. Por isso `Forma` vai ser abstrata.

- **`Forma`** (`abstract`)
  - atributo `private` `nome` (`String`) e construtor que recebe `nome`
  - `public abstract double area();` (sem corpo!)
  - `exibir()`: imprime `Retangulo | area: 12.0`, chamando `area()`
- **`Retangulo`**: recebe `largura` e `altura`. Área = `largura * altura`
- **`Triangulo`**: recebe `base` e `altura`. Área = `base * altura / 2`
- **`Circulo`**: recebe `raio`. Área = `3.14 * raio * raio`

Cada filha chama `super("Retangulo")` (ou `"Triangulo"`, `"Circulo"`) no construtor.

**Saída esperada:**

```
===== Exercicio 4 =====
Retangulo | area: 12.0
Triangulo | area: 9.0
Circulo | area: 12.56
Area total: 33.56
```

**Experimente:**

- Tente `Forma f = new Forma("Teste");` no `main`. O que acontece?
- Apague o método `area()` do `Circulo`. Qual erro aparece?
- Repare que `exibir()` chama `area()` sem saber qual forma é. Quem decide é o objeto.

---

## Exercício 5 - Vários níveis e ordem dos construtores

Herança pode ter vários níveis: `Cachorro` é filho de `Animal`, que é filho de `SerVivo`.

- **`SerVivo`**: construtor sem parâmetros que imprime `1. Construtor de SerVivo`
- **`Animal`**, filha de `SerVivo`
  - atributo `protected` `nome`
  - construtor que recebe `nome` e imprime `2. Construtor de Animal`
  - **não** escreva `super()` aqui
- **`Cachorro`**, filha de `Animal`
  - construtor que recebe `nome`, chama `super(nome)` e imprime `3. Construtor de Cachorro`
  - sobrescreva `toString()` para retornar `Cachorro chamado Rex`

Toda classe em Java é filha de `Object`, mesmo sem `extends`. O `toString()` vem de lá. É ele que o `println` usa quando você imprime um objeto.

**Antes de rodar**, escreva num papel em que ordem você acha que as mensagens vão aparecer.

**Saída esperada:**

```
===== Exercicio 5 =====
1. Construtor de SerVivo
2. Construtor de Animal
3. Construtor de Cachorro
Cachorro chamado Rex
Rex e um SerVivo? true
```

**Experimente:**

- Por que `SerVivo` imprimiu, se `Animal` não chamou `super()`? (O Java coloca um `super()` escondido.)
- Mude o construtor de `SerVivo` para receber um parâmetro. Qual erro aparece em `Animal`?
- Apague o `toString()` do `Cachorro` e rode. O que é impresso no lugar?

---

## Exercício 6 - Desafio: folha de pagamento

Junta tudo: classe abstrata, sobrescrita, polimorfismo com `ArrayList` e `instanceof`.

- **`Funcionario`** (`abstract`)
  - `private String nome` com `getNome()`
  - `protected double salarioBase`
  - construtor que recebe `nome` e `salarioBase`
  - `public abstract double calcularSalario();`
  - `exibir()`: imprime `Carla | Salario: 7000.0`
- **`Gerente`**: recebe também `bonus`. Salário = base + bônus
- **`Vendedor`**: recebe também `vendas` e `percentualComissao`. Salário = base + `vendas * percentualComissao / 100`. Tem `getVendas()`
- **`Estagiario`**: só recebe `nome` e `salarioBase`. Salário = base + 200 de auxílio transporte

No `main`, depois de preencher a `folha`, escreva um laço que:

1. chama `exibir()` de cada funcionário;
2. se for `Vendedor`, imprime também `  vendeu 10000.0`;
3. soma o salário de todos;
4. descobre quem ganha mais.

Para o passo 2, use o `instanceof` com variável (Java 16 ou mais novo):

```java
if (f instanceof Vendedor v) {
    // aqui dentro, v é um Vendedor e você pode chamar v.getVendas()
}
```

**Saída esperada:**

```
===== Exercicio 6 =====
Carla | Salario: 7000.0
Diego | Salario: 2500.0
  vendeu 10000.0
Elisa | Salario: 1400.0
Total da folha: 10900.0
Maior salario: Carla
```

**Experimente:**

- Adicione uma classe nova, `Diretor`, com salário = base x 2. Repare que o laço do `main` não precisa mudar nada. Essa é a vantagem do polimorfismo.
