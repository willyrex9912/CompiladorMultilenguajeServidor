package com.rex.compiladormultilenguajeservidor.controladores;

import com.rex.compiladormultilenguajeservidor.modelos.Instruccion;
import org.springframework.web.bind.annotation.*;

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
        instrucciones.add(new Instruccion("codigo 4"));
        instrucciones.add(new Instruccion("codigo 5"));
        return instrucciones;
    }

    @PostMapping
    public List<Instruccion> procesarCuadrupla(@RequestBody List<Cuadrupla> cuadruplas){
        for(Cuadrupla cuadrupla:cuadruplas){
            System.out.println("--------------------");
            System.out.println("Opr: "+cuadrupla.getOperacion());
            System.out.println("Res: "+cuadrupla.getResultado());
            System.out.println("Ar1: "+cuadrupla.getArgumento1());
            System.out.println("Ar2: "+cuadrupla.getArgumento2());
        }

        List<Instruccion> instrucciones = new LinkedList<>();
        instrucciones.add(new Instruccion("codigo 11"));
        instrucciones.add(new Instruccion("codigo 12"));
        instrucciones.add(new Instruccion("codigo 13"));
        instrucciones.add(new Instruccion("codigo 14"));
        instrucciones.add(new Instruccion("codigo 15"));
        return instrucciones;
    }

}
