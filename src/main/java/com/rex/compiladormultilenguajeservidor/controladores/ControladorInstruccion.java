package com.rex.compiladormultilenguajeservidor.controladores;

import com.rex.compiladormultilenguajeservidor.modelos.Instruccion;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping({"/compimult/codigo3d"})
public class ControladorInstruccion {

    @GetMapping
    public List<Instruccion> getInstrucciones(){
        List<Instruccion> instrucciones = new LinkedList<>();
        instrucciones.add(new Instruccion("codigo 1"));
        instrucciones.add(new Instruccion("codigo 2"));
        instrucciones.add(new Instruccion("codigo 3"));
        return instrucciones;
    }

}
