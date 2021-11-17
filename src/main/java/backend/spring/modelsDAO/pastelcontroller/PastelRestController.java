package backend.spring.modelsDAO.pastelcontroller;

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

import backend.spring.modelentity.Pastel;
import backend.spring.pastelservice.IPastelService;

@RestController
@RequestMapping("/pasteleria")
@CrossOrigin(origins="*", allowedHeaders="*")
public class PastelRestController {
	@Autowired
	private IPastelService pastelservice;
	@GetMapping("/pasteles")
	public List<Pastel> listarPastels(){
		return pastelservice.findAll();
	}
	@PostMapping("/pasteles")
	@ResponseStatus(HttpStatus.CREATED)
	public Pastel guardar(@RequestBody Pastel e) {
		return pastelservice.save(e);
	}
	@DeleteMapping("/pasteles/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void borrar (@PathVariable Long id) {
		pastelservice.delete(id);
	}
	@GetMapping("/pasteles/{id}")
	public Pastel encontrarPorId(@PathVariable Long id) {
		return pastelservice.searchById(id);
	}
	@PutMapping("/pasteles/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public Pastel actualizar(@PathVariable Long id, @RequestBody Pastel e) {
		Pastel actual = pastelservice.searchById(id);
		actual.setNombre(e.getNombre());
		actual.setDescripcion(e.getDescripcion());
		actual.setPeso(e.getPeso());
		actual.setTipo(e.getTipo());
		actual.setFechaEntrega(e.getFechaEntrega());
		return pastelservice.save(actual);
	}
}
