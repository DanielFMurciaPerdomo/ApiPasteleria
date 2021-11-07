package backend.spring.modelsDAO.personacontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import backend.spring.modelentity.Persona;
import backend.spring.personaservice.IPersonaService;

@RestController
@RequestMapping("/pasteleria")
public class PersonaRestController {
	@Autowired
	private IPersonaService personaservice;
	@GetMapping("/Personas")
	public List<Persona> listarPersonas(){
		return personaservice.findAll();
	}
	@PostMapping("/Personas")
	@ResponseStatus(HttpStatus.CREATED)
	public Persona guardar(@RequestBody Persona e) {
		return personaservice.save(e);
	}
	@DeleteMapping("/Personas/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void borrar (@PathVariable Long id) {
		personaservice.delete(id);
	}
	@GetMapping("/Personas/{id}")
	public Persona encontrarPorId(@PathVariable Long id) {
		return personaservice.searchById(id);
	}
	@PutMapping("/Personas/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public Persona actualizar(@PathVariable Long id, @RequestBody Persona e) {
		Persona actual = personaservice.searchById(id);
		actual.setCedula(e.getCedula());
		actual.setNombreCompleto(e.getNombreCompleto());
		actual.setDireccion(e.getDireccion());
		actual.setFechaNacimiento(e.getFechaNacimiento());
		return personaservice.save(actual);
	}
}
