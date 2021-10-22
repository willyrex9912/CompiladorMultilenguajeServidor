package com.rex.compiladormultilenguajeservidor.modelos.instruccion.condicional;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.rex.compiladormultilenguajeservidor.modelos.Codigo3d;
import com.rex.compiladormultilenguajeservidor.modelos.instruccion.Instruccion;
import com.rex.compiladormultilenguajeservidor.modelos.instruccion.complemento.ResultadoInstruccion;

import java.util.LinkedList;

public class If implements Instruccion {

    @JsonProperty("condicion")
    private Instruccion condicion;

    @JsonProperty("instrucciones")
    private LinkedList<Instruccion> instrucciones;

    @JsonProperty("instruccionesElseIf")
    private LinkedList<ElseIf> instruccionesElseIf;

    @JsonProperty("instruccionElse")
    private Else instruccionElse;


    @Override
    public void generarCodigo(ResultadoInstruccion res) {
        this.condicion.generarCodigo(res);
        res.getCodigo3d().agregarCodigo("if "+res.getValor()+" goto et"+res.getIdE());
        res.getCodigo3d().agregarCodigo("et"+res.getIdT()+":");
        res.incIdE();

    }
}
