package com.laboratorio.gestionlab.repositorios;

import com.laboratorio.gestionlab.entidades.Investigador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvestigadorRepositorio extends JpaRepository<Investigador,Long> {
    boolean existsByCedula(String cedula);
    Investigador findByNombre(String nombre);
}
