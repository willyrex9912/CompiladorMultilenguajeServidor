package com.rex.compiladormultilenguajeservidor.modelos.instruccion;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.rex.compiladormultilenguajeservidor.modelos.Codigo3d;
import com.rex.compiladormultilenguajeservidor.modelos.instruccionOld.ResultadoInstruccion;

@JsonTypeInfo( use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXTERNAL_PROPERTY, property = "tipo", visible = true)
@JsonSubTypes({
        @JsonSubTypes.Type(value = Operacion.class, name = "Operacion"),
        @JsonSubTypes.Type(value = Asignacion.class, name = "Asignacion"),
        @JsonSubTypes.Type(value = Asignacion.class, name = "Declaracion")
})
public interface Instruccion {

    public ResultadoInstruccion generarCodigo(int idT, Codigo3d codigo3d);

}
