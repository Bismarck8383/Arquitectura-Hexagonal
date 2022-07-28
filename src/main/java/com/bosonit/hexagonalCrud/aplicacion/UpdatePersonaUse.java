package com.bosonit.hexagonalCrud.aplicacion;

import com.bosonit.hexagonalCrud.aplicacion.port.UpdatePersonaI;
import com.bosonit.hexagonalCrud.dominio.EntityPersona;
import com.bosonit.hexagonalCrud.infraestructura.dtos.input.PersonaInputDTO;
import com.bosonit.hexagonalCrud.infraestructura.dtos.output.PersonaOutputDTO;
import com.bosonit.hexagonalCrud.infraestructura.repositorio.PersonaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

@Service
public class UpdatePersonaUse implements UpdatePersonaI {

    @Autowired
    PersonaRepositorio personaRepositorio;

    @Override
    public PersonaOutputDTO  updatePersona(int id_persona, PersonaInputDTO personaInputDTO)throws Exception{
        EntityPersona persona;
        persona = personaRepositorio.findById(id_persona)
                .orElseThrow(() -> new HttpClientErrorException(HttpStatus.NOT_ACCEPTABLE));
        persona.actualizarDatos(personaInputDTO);
        personaRepositorio.save(persona);
        return new PersonaOutputDTO(persona);
    }
}
