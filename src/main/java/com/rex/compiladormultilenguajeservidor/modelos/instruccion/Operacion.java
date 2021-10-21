package com.rex.compiladormultilenguajeservidor.modelos.instruccion;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

public class Operacion implements Instruccion{

    @JsonProperty("opr1")
    private Instruccion opr1;
    @JsonProperty("opr2")
    private Instruccion opr2;
    @JsonProperty("opr")
    private String opr;
    @JsonProperty("resultado")
    private Object resultado;

    @Override
    public DataInstruccion generarCodigo() {
        return null;
    }
}
