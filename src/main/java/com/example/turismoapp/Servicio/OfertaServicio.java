package com.example.turismoapp.Servicio;

import com.example.turismoapp.Modelos.Oferta;
import com.example.turismoapp.Repositorio.OfertaRepositorio;
import com.example.turismoapp.validaciones.OfertaValidacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;

import java.util.List;
import java.util.Optional;


public class OfertaServicio {



    @Autowired

    OfertaRepositorio ofertaRepositorio;

    public Oferta registrarOferta (Oferta datoARegistrar) throws  Exception
    {
        try
        {
           return (this.ofertaRepositorio.save(datoARegistrar));
        }

        catch (Exception error){
            throw new Exception(error.getMessage());
        }

    }


    public  Oferta modicarOferta ( Integer id, Oferta datosAModificar) throws  Exception
    {
        try
        {
          Optional<Oferta>ofertaEncontrada=this.ofertaRepositorio.findById(id);

          if(ofertaEncontrada.isEmpty())
          {
              throw new Exception("oferta no encontrada");
          }

          Oferta ofertaExistnte=ofertaEncontrada.get();
          ofertaExistnte.setTitulo(datosAModificar.getTitulo());
          ofertaExistnte.setDescripcion(datosAModificar.getDescripcion());

          return (this.ofertaRepositorio.save(ofertaExistnte));
        }
        catch (Exception error)
        {
            throw  new Exception(error.getMessage());
        }
    }

    public Oferta buscarOfertaPorId(Integer id) throws Exception
    {
        try {
            Optional<Oferta>ofertaOptional=this.ofertaRepositorio.findById(id);
            if (ofertaOptional.isEmpty()){
                throw  new Exception("ofereta no encontrada");
            }
            return ofertaOptional.get();
        }
        catch (Exception error){
            throw  new Exception(error.getMessage());
        }
    }

    public List<Oferta> buscarTodasLasOferta () throws  Exception
    {
        try {
            List<Oferta>ofertaList=this.ofertaRepositorio.findById();
            return ofertaList;
        }
        catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }

    public Boolean eliminaOferta(Integer id) throws  Exception
    {
        try {
            Optional<Oferta>ofertaOptional=this.ofertaRepositorio.findById(id);

            if (ofertaOptional.isPresent()){
              Optional<Oferta>optionalOferta=this.ofertaRepositorio.deleteAllById(id);
                return true;
            }
            else {
                throw new Exception("oferta no encontrada");
            }

        }
        catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }
}
