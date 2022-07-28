package com.bosonit.hexagonalCrud.aplicacion.port;

import com.bosonit.hexagonalCrud.infraestructura.dtos.output.PersonaOutputDTO;

import java.util.List;

public interface MostrarPersonaI {


    //buscar por id
    PersonaOutputDTO mostrarId(int id_persona) throws Exception;

    // Mostrar todos las Persona
    List<PersonaOutputDTO> mostrarTodos() throws Exception;

    //Buscar por nombre
    List<PersonaOutputDTO> mostrarNombre(String nombre) throws  Exception;
}
