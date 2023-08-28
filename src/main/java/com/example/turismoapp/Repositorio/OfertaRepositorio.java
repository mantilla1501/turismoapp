package com.example.turismoapp.Repositorio;

import com.example.turismoapp.Modelos.Oferta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OfertaRepositorio  extends JpaRepository<Oferta,Integer> {
}
