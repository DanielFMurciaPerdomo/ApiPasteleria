package backend.spring.modelsDAO.decoradorcontroller;

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

import backend.spring.decoradorservice.IDecoradorService;
import backend.spring.modelentity.Decorador;

@RestController
@RequestMapping("/pasteleria")
public class DecoradorRestController {
	@Autowired
	private IDecoradorService decoradorservice;
	@GetMapping("/decoradores")
	public List<Decorador> findAll(){
		return decoradorservice.findAll();
	}
	@PostMapping("/decoradores")
	@ResponseStatus(HttpStatus.CREATED)
	public Decorador guardar(@RequestBody Decorador d) {
		return decoradorservice.save(d);
	}
	@DeleteMapping("/decoradores/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void borrar (@PathVariable Long id) {
		decoradorservice.delete(id);
	}
	@GetMapping("/decoradores/{id}")
	public Decorador encontrarporId(@PathVariable Long id) {
		return decoradorservice.searchById(id);
	}
	@PutMapping("/estudiantes/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public Decorador actualizar(@PathVariable Long id, @RequestBody Decorador e) {
		Decorador actual = decoradorservice.searchById(id);
		actual.setNombre(e.getNombre());
		actual.setSalario(e.getSalario());
		return decoradorservice.save(actual);
	}
}
