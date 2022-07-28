package com.bosonit.hexagonalCrud.aplicacion.port;

import com.bosonit.hexagonalCrud.infraestructura.dtos.input.PersonaInputDTO;
import com.bosonit.hexagonalCrud.infraestructura.dtos.output.PersonaOutputDTO;

public interface UpdatePersonaI {
    PersonaOutputDTO updatePersona(int id_persona, PersonaInputDTO personaInputDTO) throws Exception;
}
