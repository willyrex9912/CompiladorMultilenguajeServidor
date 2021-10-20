package com.rex.compiladormultilenguajeservidor.modelos.instruccion;

import com.rex.compiladormultilenguajeservidor.modelos.Codigo3d;

public class Instruccion {

    private Instruccion opr1;
    private Instruccion opr2;
    private Object resultado;
    private String opr;

    //5+5  T1

    public int generarCodigo(int idT, Codigo3d codigo3d){
        if(this.opr.equals(TipoInstruccion.INT)|this.opr.equals(TipoInstruccion.ID)){
            codigo3d.agregarCodigo("t"+idT+" = "+this.resultado);
            return idT;
        }else if(this.opr.equals(TipoInstruccion.ASIGNACION)){
            int idT1 = this.opr1.generarCodigo(idT,codigo3d);
            int idT2 = this.opr2.generarCodigo(idT1+1,codigo3d);
            codigo3d.agregarCodigo("t"+idT1+" = t"+idT2);
            return idT2;
        }else{
            int idT1 = this.opr1.generarCodigo(idT,codigo3d);
            int idT2 = this.opr2.generarCodigo(idT1+1,codigo3d);
            codigo3d.agregarCodigo("t"+(idT2+1)+" = t"+idT1+" "+this.opr+" t"+idT2);
            return idT2+1;
        }
    }

    public Instruccion getOpr1() {
        return opr1;
    }

    public void setOpr1(Instruccion opr1) {
        this.opr1 = opr1;
    }

    public Instruccion getOpr2() {
        return opr2;
    }

    public void setOpr2(Instruccion opr2) {
        this.opr2 = opr2;
    }

    public Object getResultado() {
        return resultado;
    }

    public void setResultado(Object resultado) {
        this.resultado = resultado;
    }

    public String getOpr() {
        return opr;
    }

    public void setOpr(String opr) {
        this.opr = opr;
    }
}
