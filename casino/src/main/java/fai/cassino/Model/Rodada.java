package fai.casino.Model;

public class Rodada {
    private int numero;
    private String tipo; 

    public Rodada(int numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
    }

    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }
}
