package com.rex.compiladormultilenguajeservidor.modelos.instruccion;

public class Declaracion implements Instruccion{

    private String opr1;
    private Instruccion opr2;

    @Override
    public DataInstruccion generarCodigo() {
        return null;
    }
}
