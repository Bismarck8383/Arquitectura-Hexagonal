package com.bosonit.hexagonalCrud.infraestructura.Controladores;


import com.bosonit.hexagonalCrud.aplicacion.port.CrearPersonaI;
import com.bosonit.hexagonalCrud.aplicacion.port.DeletePersonaI;
import com.bosonit.hexagonalCrud.aplicacion.port.MostrarPersonaI;
import com.bosonit.hexagonalCrud.aplicacion.port.UpdatePersonaI;
import com.bosonit.hexagonalCrud.infraestructura.dtos.input.PersonaInputDTO;
import com.bosonit.hexagonalCrud.infraestructura.dtos.output.PersonaOutputDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persona")
public class ControladorPersona {
    @Autowired
    DeletePersonaI deletePersonaI;
    @Autowired
    CrearPersonaI crearPersonaI;
    @Autowired
    UpdatePersonaI updatePersonaI;
    @Autowired
    MostrarPersonaI mostrarPersonaI;

    @GetMapping("/id/{id_persona}")
    public PersonaOutputDTO buscarPorId (@PathVariable int id_persona) throws Exception {
        return mostrarPersonaI.mostrarId(id_persona);
    }

    @GetMapping("/nombre/{nombre}")
    public List<PersonaOutputDTO> buscarPorNombre (@PathVariable String nombre) throws Exception {
        return mostrarPersonaI.mostrarNombre(nombre);
    }

    @GetMapping("/todos")
    public List<PersonaOutputDTO> buscarTodos () throws Exception {
        return mostrarPersonaI.mostrarTodos();
    }

    @PostMapping("/addPersona")
    public PersonaOutputDTO addPersona (@RequestBody PersonaInputDTO personaInputDTO) throws Exception {
        return crearPersonaI.addPersona(personaInputDTO);
    }

    @DeleteMapping("/deletePersona/{id_persona}")
    public void deletePersona (@PathVariable int id_persona) throws Exception {
        deletePersonaI.deletePersona(id_persona);
    }

    @PutMapping("/updatePersona/{id_persona}")
    public PersonaOutputDTO updatePersona (@PathVariable int id_persona, @RequestBody PersonaInputDTO personaInputDTO) throws Exception {
        return updatePersonaI.updatePersona(id_persona, personaInputDTO);
    }
}
