package backend.spring.modelsDAO.decoracioncontroller;

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

import backend.spring.decoracionservice.IDecoracionService;
import backend.spring.modelentity.Decoracion;

@RestController
@RequestMapping("/pasteleria")
@CrossOrigin(origins="*", allowedHeaders="*")
public class DecoracionRestController {
	@Autowired
	private IDecoracionService decoracionservice;
	@GetMapping("/decoraciones")
	public List<Decoracion> findAll(){
		return decoracionservice.findAll();
	}
	@PostMapping("/decoraciones")
	@ResponseStatus(HttpStatus.CREATED)
	public Decoracion guardar(@RequestBody Decoracion d) {
		return decoracionservice.save(d);
	}
	@DeleteMapping("/decoraciones/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void borrar (@PathVariable Long id) {
		decoracionservice.delete(id);
	}
	@GetMapping("/decoraciones/{id}")
	public Decoracion encontrarporId(@PathVariable Long id) {
		return decoracionservice.searchById(id);
	}
	@PutMapping("/decoraciones/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public Decoracion actualizar(@PathVariable Long id, @RequestBody Decoracion e) {
		Decoracion actual = decoracionservice.searchById(id);
		actual.setFechaHoraFin(e.getFechaHoraFin());
		actual.setFechaHoraInicio(e.getFechaHoraInicio());
		actual.setPesoFinal(e.getPesoFinal());
		return decoracionservice.save(actual);
	}
}
