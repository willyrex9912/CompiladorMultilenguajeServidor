package com.rex.compiladormultilenguajeservidor.controladores;

import com.rex.compiladormultilenguajeservidor.modelos.Codigo3d;
import com.rex.compiladormultilenguajeservidor.modelos.Confirmacion;
import com.rex.compiladormultilenguajeservidor.modelos.instruccion.Instruccion;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ControladorServicioCodigo3D {

    private Codigo3d codigo3d;

    public ControladorServicioCodigo3D() {
        this.codigo3d = new Codigo3d();
    }

    @PostMapping(ControladorServicioProyecto.PATH_SERVICIO_PROYECTO+"/codigo3d")
    public Confirmacion test(@RequestBody List<Instruccion> instrucciones){
        codigo3d = new Codigo3d();
        System.out.println("RECIBIENDO INSTRUCCIONES");
        int idT = 1;
        /*for (Instruccion instruccion:instrucciones){
            idT = instruccion.generarCodigo(idT,codigo3d).getIdT();
        }
        System.out.println("CODIGO 3D:");
        System.out.println(codigo3d.getCodigo());*/
        return new Confirmacion("Instrucciones recibidas.", true);
    }

}
