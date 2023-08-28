package com.example.turismoapp.Repositorio;

import com.example.turismoapp.Modelos.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmpresaRepositorio extends JpaRepository <Empresa,Integer> {
}
