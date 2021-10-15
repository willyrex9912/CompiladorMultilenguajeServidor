package com.rex.compiladormultilenguajeservidor.utilidades;

import com.rex.compiladormultilenguajeservidor.modelos.proyecto.Proyecto;

public class DecodificadorProyecto {

    public static void decodificar(Proyecto proyecto){
        System.out.println("Proyecto "+proyecto.getNombre());

    }

}
