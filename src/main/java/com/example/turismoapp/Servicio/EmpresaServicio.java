package com.example.turismoapp.Servicio;

import com.example.turismoapp.Modelos.Empresa;
import com.example.turismoapp.Modelos.Oferta;
import com.example.turismoapp.Repositorio.EmpresaRepositorio;
import com.example.turismoapp.validaciones.EmpresaValidacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class EmpresaServicio {
    @Autowired
    EmpresaRepositorio empresaRepositorio ;

    @Autowired
    EmpresaValidacion empresaValidacion;




    public Empresa registrarEmpresa (Empresa datosARegistrar) throws  Exception {
        try {
            if (!this.empresaValidacion.validarNombre(datosARegistrar.getNombre())) {
                throw new Exception("error en el servicio");
            }

            //si paso todos los if estoy listo para llamar al repo
          return (this.empresaRepositorio.save(datosARegistrar));
        } catch (Exception error) {
                 throw new Exception(error.getMessage());
        }
    }


    public    Empresa modicarEmpresa ( Integer id, Empresa datosAModificar) throws  Exception
    {
        try
        {
            if (! this.empresaValidacion.validarNombre(datosAModificar.getNombre()) ){
                throw new Exception("error en ele dato entregado");
            }


           //buscar q la empresa q busque tiene el id que envia el usuario a la bd
            Optional<Empresa> empresaEncontrada=this.empresaRepositorio.findById(id);

           //pregunto q si lo q busca esta vacio (que no existe)

            if (empresaEncontrada.isEmpty()){
                throw new Exception("Empresa no encontrada");
            }

            Empresa empresaEncontrada2=empresaEncontrada.get();

            empresaEncontrada2.setNombre(datosAModificar.getNombre());

            return (this.empresaRepositorio.save(empresaEncontrada2));
        }


        catch (Exception error)
        {
           throw  new Exception(error.getMessage());
        }
    }

    public Empresa buscarEmpresaPorId(Integer id) throws Exception
    {
        try {
            Optional<Empresa> empresaOptional=this.empresaRepositorio.findById(id);
            if (empresaOptional.isEmpty()){
                throw  new Exception("empresa no encontrada");
            }
            return empresaOptional.get();
        }
        catch (Exception error)
        {
            throw new Exception(error.getMessage());
        }
    }

    public List<Empresa> buscarTodasLasEmpresar () throws  Exception
    {
        try {
            List<Empresa>ListaEmpresa=this.empresaRepositorio.findById();
            return ListaEmpresa;
        }

        catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }

    public Boolean eliminaEmpresa(Integer id) throws  Exception
    {
        try {
            Optional<Empresa>empresaOptional=this.empresaRepositorio.findById(id);

            if (empresaOptional.isPresent()){
                this.empresaRepositorio.deleteById(id);
                return true;
            }

            else {
                throw  new Exception("empresa no encontrada");
            }
        }

        catch (Exception error){
            throw new Exception(error.getMessage());
        }

    }
}
