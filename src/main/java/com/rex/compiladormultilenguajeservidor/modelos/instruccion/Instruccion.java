package com.rex.compiladormultilenguajeservidor.modelos.instruccion;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonTypeInfo( use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXTERNAL_PROPERTY, property = "type", visible = true)
@JsonSubTypes({
        @JsonSubTypes.Type(value = Operacion.class, name = "Operacion"),
        @JsonSubTypes.Type(value = Asignacion.class, name = "Asignacion")
})
public interface Instruccion {

    public DataInstruccion generarCodigo();

}
