package com.rex.compiladormultilenguajeservidor.modelos.instruccion;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.rex.compiladormultilenguajeservidor.modelos.Codigo3d;
import com.rex.compiladormultilenguajeservidor.modelos.instruccion.complemento.ResultadoInstruccion;

public class Asignacion implements Instruccion{

    @JsonProperty("opr1")
    private String opr1;
    @JsonProperty("opr2")
    private Instruccion opr2;

    @Override
    public ResultadoInstruccion generarCodigo(int idT, Codigo3d codigo3d) {
        ResultadoInstruccion res2 = this.opr2.generarCodigo(idT,codigo3d);
        codigo3d.agregarCodigo(opr1+" = "+res2.getValor());
        return new ResultadoInstruccion("",res2.getIdT());
    }
}
