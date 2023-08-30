package com.example.turismoapp.Controlador;

import com.example.turismoapp.Modelos.Oferta;
import com.example.turismoapp.Servicio.OfertaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Oferta")

public class OfertaControlador {

    @Autowired

    OfertaServicio ofertaServicio;

    @PostMapping

    public ResponseEntity <?> registrarOferta (@RequestBody Oferta datosOferta)
    {
        return null;
    }

    @PutMapping

    public ResponseEntity <?>  modificaroferta (@RequestBody Oferta datosNuevosOferta ,@PathVariable Integer idOferta)
    {
        return  null;
    }

    @GetMapping
    public ResponseEntity<?> buscarOferta ( @PathVariable Integer id)
    {
        return  null;
    }

    @PostMapping
    public ResponseEntity<?> buscarTodasOferta(){
        return  null;
    }
    @DeleteMapping
    public  ResponseEntity<?> borrarOferta(@PathVariable Integer id)
    {
        return null;
    }


}
