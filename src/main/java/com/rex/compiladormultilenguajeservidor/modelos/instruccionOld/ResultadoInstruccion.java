package com.rex.compiladormultilenguajeservidor.modelos.instruccionOld;

public class ResultadoInstruccion {

    private String valor;
    private int idT;

    public ResultadoInstruccion(String valor, int idT) {
        this.valor = valor;
        this.idT = idT;
    }

    public ResultadoInstruccion(String valor) {
        this.valor = valor;
    }

    public ResultadoInstruccion(int idT) {
        this.idT = idT;
    }

    public String getValor() {
        return valor;
    }

    public int getIdT() {
        return idT;
    }
}
