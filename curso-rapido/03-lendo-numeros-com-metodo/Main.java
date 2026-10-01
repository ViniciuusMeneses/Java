void main() {
    int n1 = lernumero("Digite o numero 1 ");
    int n2 = lernumero("Digite o numero 2 ");
    int n3 = lernumero("Digite o numero 3 ");
    int n4 = lernumero("Digite o numero 4 ");
    IO.println(n1 + " " + n2 + " " + n3 + " " + n4);
}
int lernumero(String s) {
   return Integer.parseInt(IO.readln( s));
}

