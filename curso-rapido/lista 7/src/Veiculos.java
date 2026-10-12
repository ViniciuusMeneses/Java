public class Veiculos {

    private String modelo;
    private String placa;
    private int horarioEntrada;
    private int horarioSaida;
    private int valor;

    public String getModelo(){ return modelo; }
    public String getPlaca(){ return placa; }
    public int getHorarioEntrada(){ return horarioEntrada; }
    public int getHorarioSaida(){ return horarioSaida; }
    public int getValor(){ return valor; }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setPlaca(String placa){
        if(placa.length() == 7){
            char[] c = placa.toCharArray();
            for(int i = 0; i < 3; i++){
                if(Character.isDigit(c[i])){
                    return;
                }
            }
            boolean pos4ok = Character.isLetter(c[4]) || Character.isDigit(c[4]);
            if( Character.isDigit(c[3]) && pos4ok && Character.isDigit(c[5]) && Character.isDigit(c[6]) ){
                this.placa = placa;
            } else {
                System.out.println("Placa invalida");
            }
        }
    }

    public void setHorario(int he, int mine){
        this.horarioEntrada = he * 60 + mine;
    }

    public void setHorarioSaida(int hs, int mins) {
        this.horarioSaida = hs * 60 + mins;
    }

    public void setValor() {
        int h = this.horarioSaida - this.horarioEntrada;
        this.valor = 8;
        for(int i = 60; i < h; i += 60){
            this.valor += 4;
        }
    }

    public Veiculos(String modelo, String placa, int he, int mine){
        setHorario(he, mine);
        setModelo(modelo);
        setPlaca(placa);
    }

    public void imprimir(int hs, int mine){
        setHorarioSaida(hs, mine);
        setValor();
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Placa: " + this.placa);
        System.out.println("Minutos: " + (this.horarioSaida - this.horarioEntrada) );
        System.out.println("Valor cobrado: " + this.valor);
    }
}
