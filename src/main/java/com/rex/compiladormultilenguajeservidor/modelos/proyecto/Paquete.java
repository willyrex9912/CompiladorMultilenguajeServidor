package com.rex.compiladormultilenguajeservidor.modelos.proyecto;

import java.util.LinkedList;
import java.util.List;

public class Paquete {

    private String nombre;
    private String id;
    private List<Archivo> archivos;
    private List<Paquete> paquetes;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Archivo> getArchivos() {
        return archivos;
    }

    public void setArchivos(LinkedList<Archivo> archivos) {
        this.archivos = archivos;
    }

    public List<Paquete> getPaquetes() {
        return paquetes;
    }

    public void setPaquetes(LinkedList<Paquete> paquetes) {
        this.paquetes = paquetes;
    }
}
