package com.example.turismoapp.Controlador;


import com.example.turismoapp.Modelos.Empresa;
import com.example.turismoapp.Servicio.EmpresaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping ("/Empresa")
@RestController

public class EmpresaContrlador {
    @Autowired

    EmpresaServicio empresaServicio;

    @PostMapping
    public ResponseEntity<?> registrarEmpresa( @RequestBody Empresa datosEmpresa)
    {
      return null;
    }
    @PutMapping
    public ResponseEntity<?> editarEmpresa(@RequestBody Empresa datosNuevoEmpresa,@PathVariable Integer idEmpresa)
    {
      return  null;
    }

    @GetMapping
    public  ResponseEntity<?> buscarEmpresa(@PathVariable Integer id)
    {
        return  null;
    }
    @PostMapping
    public ResponseEntity<?> buscarTodasEmpresas(){
        return  null;
    }
    @DeleteMapping
    public  ResponseEntity<?> borrarEmpresas(@PathVariable Integer id)
    {
        return null;
    }


}


