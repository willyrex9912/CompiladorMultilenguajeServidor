package com.rex.compiladormultilenguajeservidor.modelos.instruccion;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.rex.compiladormultilenguajeservidor.modelos.Codigo3d;
import com.rex.compiladormultilenguajeservidor.modelos.instruccionOld.ResultadoInstruccion;
import com.rex.compiladormultilenguajeservidor.modelos.instruccionOld.TipoInstruccion;

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
    public ResultadoInstruccion generarCodigo(int idT, Codigo3d codigo3d) {
        if(this.opr.equals(TipoInstruccion.INT)|this.opr.equals(TipoInstruccion.ID)|this.opr.equals(TipoInstruccion.CHAR)|this.opr.equals(TipoInstruccion.FLOAT)){
            return new ResultadoInstruccion(this.resultado.toString(),idT);
        }else{
            ResultadoInstruccion res1 = this.opr1.generarCodigo(idT,codigo3d);
            ResultadoInstruccion res2 = this.opr2.generarCodigo(res1.getIdT(),codigo3d);
            String res = "t"+res2.getIdT();
            codigo3d.agregarCodigo(res+" = "+res1.getValor()+" "+this.opr+" "+res2.getValor());
            return new ResultadoInstruccion(res,res2.getIdT()+1);
        }
    }
}
