package com.rex.compiladormultilenguajeservidor.controladores;

import com.rex.compiladormultilenguajeservidor.modelos.Confirmacion;
import com.rex.compiladormultilenguajeservidor.modelos.proyecto.Proyecto;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ControladorServicioProyecto {

    @GetMapping("/compimult/Responder")
    public Confirmacion responder(){
        return new Confirmacion("Se ha recibido el proyecto",true);
    }

    @PostMapping("/compimult/GuardarProyecto")
    public Confirmacion procesarCuadrupla(@RequestBody Proyecto proyecto){
        System.out.println("proyecto "+proyecto.getNombre()+" recibido");
        return new Confirmacion("Se ha recibido el proyecto",true);
    }

}
