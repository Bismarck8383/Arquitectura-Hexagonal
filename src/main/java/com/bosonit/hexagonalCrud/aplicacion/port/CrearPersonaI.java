package com.bosonit.hexagonalCrud.aplicacion.port;

import com.bosonit.hexagonalCrud.infraestructura.dtos.input.PersonaInputDTO;
import com.bosonit.hexagonalCrud.infraestructura.dtos.output.PersonaOutputDTO;

public interface CrearPersonaI {
    PersonaOutputDTO addPersona(PersonaInputDTO personaInputDTO) throws Exception;
}
