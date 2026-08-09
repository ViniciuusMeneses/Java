void main() {
    int[] n = new int[5];
    int maior = 0;
    int menor;
    double media = 0;

    n[0] = ler("Digite o numero " + (1) + " ");
    menor = n[0];
    media = n[0];
    maior = n[0];
    for(int i = 1; i < n.length; i++){
        n[i] = ler("Digite o numero " + (i+1) + " ");
        if(n[i] > maior){
            maior = n[i];
        }
        if(n[i] < menor){
            menor = n[i];
        }
        media = media + n[i];
    }
    System.out.println(media/n.length);
    IO.println("Maior " + maior);
    IO.println("Menor " + menor);
}
    int ler(String l){
    return Integer.parseInt(IO.readln(l));
    }

