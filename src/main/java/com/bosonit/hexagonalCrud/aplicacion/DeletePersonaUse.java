package com.bosonit.hexagonalCrud.aplicacion;

import com.bosonit.hexagonalCrud.aplicacion.port.DeletePersonaI;
import com.bosonit.hexagonalCrud.dominio.EntityPersona;
import com.bosonit.hexagonalCrud.infraestructura.repositorio.PersonaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

@Service
public class DeletePersonaUse implements DeletePersonaI {

    @Autowired
    PersonaRepositorio personaRepositorio;

    @Override
    public void deletePersona(int id_persona) throws Exception{

        EntityPersona personadel;
        personadel = personaRepositorio.findById(id_persona)
                .orElseThrow(() -> new HttpClientErrorException(HttpStatus.NOT_ACCEPTABLE));
        personaRepositorio.deleteById(id_persona);
    }

}
