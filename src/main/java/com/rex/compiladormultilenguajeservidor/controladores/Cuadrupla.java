package com.rex.compiladormultilenguajeservidor.controladores;

public class Cuadrupla {

    private String operacion;
    private String resultado;
    private String argumento1;
    private String argumento2;

    public Cuadrupla(String operacion, String resultado, String argumento1, String argumento2) {
        this.operacion = operacion;
        this.resultado = resultado;
        this.argumento1 = argumento1;
        this.argumento2 = argumento2;
    }

    public String getOperacion() {
        return operacion;
    }

    public String getResultado() {
        return resultado;
    }

    public String getArgumento1() {
        return argumento1;
    }

    public String getArgumento2() {
        return argumento2;
    }
}
