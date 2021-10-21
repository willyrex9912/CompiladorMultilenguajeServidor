package com.rex.compiladormultilenguajeservidor.modelos.instruccion;

import com.rex.compiladormultilenguajeservidor.modelos.instruccionOld.Instruccion;

public class DataInstruccion {

    private String nombreMetodo;
    private com.rex.compiladormultilenguajeservidor.modelos.instruccionOld.Instruccion condicion;

    public String getNombreMetodo() {
        return nombreMetodo;
    }

    public void setNombreMetodo(String nombreMetodo) {
        this.nombreMetodo = nombreMetodo;
    }

    public com.rex.compiladormultilenguajeservidor.modelos.instruccionOld.Instruccion getCondicion() {
        return condicion;
    }

    public void setCondicion(Instruccion condicion) {
        this.condicion = condicion;
    }
}
