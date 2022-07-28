package com.bosonit.hexagonalCrud.infraestructura.repositorio;

import com.bosonit.hexagonalCrud.dominio.EntityPersona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepositorio  extends JpaRepository<EntityPersona, Integer> {
}
