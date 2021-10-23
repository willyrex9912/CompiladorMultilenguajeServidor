package com.rex.compiladormultilenguajeservidor.modelos.instruccion;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.rex.compiladormultilenguajeservidor.modelos.instruccion.ciclo.DoWhile;
import com.rex.compiladormultilenguajeservidor.modelos.instruccion.ciclo.For;
import com.rex.compiladormultilenguajeservidor.modelos.instruccion.ciclo.While;
import com.rex.compiladormultilenguajeservidor.modelos.instruccion.complemento.ResultadoInstruccion;
import com.rex.compiladormultilenguajeservidor.modelos.instruccion.condicional.Else;
import com.rex.compiladormultilenguajeservidor.modelos.instruccion.condicional.ElseIf;
import com.rex.compiladormultilenguajeservidor.modelos.instruccion.condicional.If;
import com.rex.compiladormultilenguajeservidor.modelos.instruccion.inc_dec.IncDec;

@JsonTypeInfo( use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXTERNAL_PROPERTY, property = "tipo", visible = true)
@JsonSubTypes({
        @JsonSubTypes.Type(value = Operacion.class, name = "Operacion"),
        @JsonSubTypes.Type(value = Asignacion.class, name = "Asignacion"),
        @JsonSubTypes.Type(value = Asignacion.class, name = "Declaracion"),
        @JsonSubTypes.Type(value = Metodo.class, name = "Metodo"),
        @JsonSubTypes.Type(value = If.class, name = "If"),
        @JsonSubTypes.Type(value = ElseIf.class, name = "ElseIf"),
        @JsonSubTypes.Type(value = Else.class, name = "Else"),
        @JsonSubTypes.Type(value = While.class, name = "While"),
        @JsonSubTypes.Type(value = DoWhile.class, name = "DoWhile"),
        @JsonSubTypes.Type(value = For.class, name = "For"),
        @JsonSubTypes.Type(value = IncDec.class, name = "IncDec"),
})
public interface Instruccion {

    public void generarCodigo(ResultadoInstruccion res);

}
