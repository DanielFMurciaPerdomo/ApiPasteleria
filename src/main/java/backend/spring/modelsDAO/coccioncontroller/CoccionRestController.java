package backend.spring.modelsDAO.coccioncontroller;

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

import backend.spring.coccionservice.ICoccionService;
import backend.spring.modelentity.Coccion;

@RestController
@RequestMapping("/pasteleria")
@CrossOrigin(origins="*", allowedHeaders="*")
public class CoccionRestController {
	@Autowired
	private ICoccionService coccionservice;
	@GetMapping("/cocciones")
	public List<Coccion> findAll(){
		return coccionservice.findAll();
	}
	@PostMapping("/cocciones")
	@ResponseStatus(HttpStatus.CREATED)
	public Coccion guardar(@RequestBody Coccion d) {
		return coccionservice.save(d);
	}
	@DeleteMapping("/cocciones/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void borrar (@PathVariable Long id) {
		coccionservice.delete(id);
	}
	@GetMapping("/cocciones/{id}")
	public Coccion encontrarporId(@PathVariable Long id) {
		return coccionservice.searchById(id);
	}
	@PutMapping("/cocciones/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public Coccion actualizar(@PathVariable Long id, @RequestBody Coccion e) {
		Coccion actual = coccionservice.searchById(id);
		actual.setFechaHoraFinal(e.getFechaHoraFinal());
		actual.setFechaHoraInicio(e.getFechaHoraInicio());
		actual.setMarca(e.getMarca());
		actual.setTempCoccion(e.getTempCoccion());
		actual.setValorEstimado(e.getValorEstimado());
		return coccionservice.save(actual);
	}
}
