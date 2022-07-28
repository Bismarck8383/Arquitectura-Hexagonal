package com.bosonit.hexagonalCrud.aplicacion;

import com.bosonit.hexagonalCrud.aplicacion.port.CrearPersonaI;
import com.bosonit.hexagonalCrud.dominio.EntityPersona;
import com.bosonit.hexagonalCrud.infraestructura.dtos.input.PersonaInputDTO;
import com.bosonit.hexagonalCrud.infraestructura.dtos.output.PersonaOutputDTO;
import com.bosonit.hexagonalCrud.infraestructura.repositorio.PersonaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CrearPersonaUse implements CrearPersonaI {

    @Autowired
    PersonaRepositorio personaRepositorio;


    @Override
    public PersonaOutputDTO addPersona(PersonaInputDTO personaInputDTO) throws Exception{
        EntityPersona persona = new EntityPersona(personaInputDTO);
        PersonaOutputDTO personaOutputDTO= new PersonaOutputDTO(persona);


        if (persona == null) {
            throw new Exception("Persona Sin datos");
        }
        personaRepositorio.saveAndFlush(persona);
        return personaOutputDTO;
    }
}
