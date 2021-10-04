package com.rex.compiladormultilenguajeservidor.modelos;

public class Instruccion {

    private String texto;

    public Instruccion(String codigo) {
        this.texto = codigo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
