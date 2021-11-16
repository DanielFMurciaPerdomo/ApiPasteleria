package backend.spring.modelsDAO.pastelerocontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import backend.spring.modelentity.Pastelero;
import backend.spring.pasteleroservice.IPasteleroService;

@RestController
@RequestMapping("/pasteleria")
@CrossOrigin(origins="*", allowedHeaders="*")
public class PasteleroRestController {
	@Autowired
	private IPasteleroService pasteleroservice;
	@GetMapping("/pasteleros")
	public List<Pastelero> listarPasteleros(){
		return pasteleroservice.findAll();
	}
	@PostMapping("/pasteleros")
	@ResponseStatus(HttpStatus.CREATED)
	public Pastelero guardar(@RequestBody Pastelero p) {
		return pasteleroservice.save(p);
	}
	@DeleteMapping("/pasteleros/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void borrar(@PathVariable Long id) {
		pasteleroservice.delete(id);
	}
	@GetMapping("/pasteleros/{id}")
	public Pastelero encontrarporId(@PathVariable Long id) {
		return pasteleroservice.encontrarporId(id);
	}
	@PutMapping("/pasteleros/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public Pastelero editar(@PathVariable Long id,@RequestBody Pastelero p) {
		Pastelero actual=pasteleroservice.encontrarporId(id);
		actual.setNombre(p.getNombre());
		actual.setExperiencia(p.getExperiencia());
		actual.setSalario(p.getSalario());
		actual.setPaisOgn(p.getPaisOgn());
		actual.setPasaporte(p.getPasaporte());
		return pasteleroservice.save(actual);
	}
}
