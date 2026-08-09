void main() {

    double n1 = Double.parseDouble(IO.readln("Digite um numero "));
    double n2 = Double.parseDouble(IO.readln("Digite outro numero "));
    String op = IO.readln("Escolha a operação ");

    if (op.equals("+")) {
        IO.println(n1 + n2);
    } else if (op.equals("-")) {
        IO.println(n1 - n2);
    } else if (op.equals("*")) {
        IO.println(n1 * n2);
    } else{
        IO.println(n1 / n2);
    }

    }
