package com.rex.compiladormultilenguajeservidor.modelos.instruccion;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.rex.compiladormultilenguajeservidor.modelos.Codigo3d;
import com.rex.compiladormultilenguajeservidor.modelos.instruccion.complemento.ResultadoInstruccion;

import java.util.LinkedList;

public class Metodo implements Instruccion{

    @JsonProperty("nombre")
    private String nombre;
    @JsonProperty("instrucciones")
    private LinkedList<Instruccion> instrucciones;

    @Override
    public ResultadoInstruccion generarCodigo(int idT, Codigo3d codigo3d) {
        codigo3d.agregarCodigo(this.nombre+" {");
        int idT1 = idT;
        for (Instruccion instruccion:this.instrucciones){
            idT1 = instruccion.generarCodigo(idT1,codigo3d).getIdT();
        }
        codigo3d.agregarCodigo("}");
        return new ResultadoInstruccion("",idT1);
    }
}
