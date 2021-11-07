package backend.spring.modelsDAO.ingredientecontroller;

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

import backend.spring.ingredienteservice.IIngredienteService;
import backend.spring.modelentity.Ingrediente;

@RestController
@RequestMapping("/pasteleria")
public class IngredienteRestController {
	@Autowired
	private IIngredienteService ingredienteservice;
	@GetMapping("/ingredientes")
	public List<Ingrediente> listarIngredientes(){
		return ingredienteservice.findAll();
	}
	@PostMapping("/ingredientes")
	@ResponseStatus(HttpStatus.CREATED)
	public Ingrediente guardar(@RequestBody Ingrediente e) {
		return ingredienteservice.save(e);
	}
	@DeleteMapping("/ingredientes/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void borrar (@PathVariable String id) {
		ingredienteservice.delete(id);
	}
	@GetMapping("/ingredientes/{id}")
	public Ingrediente encontrarPorId(@PathVariable String id) {
		return ingredienteservice.searchById(id);
	}
	@PutMapping("/ingredientes/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public Ingrediente actualizar(@PathVariable String id, @RequestBody Ingrediente e) {
		Ingrediente actual = ingredienteservice.searchById(id);
		actual.setNombre(e.getNombre());
		actual.setUnidadMedida(e.getUnidadMedida());
		return ingredienteservice.save(actual);
	}
}
