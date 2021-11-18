package backend.spring.modelsDAO.pastelempcontroller;

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

import backend.spring.modelentity.PastelEmp;
import backend.spring.pastelempservice.IPastelEmpService;

@RestController
@RequestMapping("/pasteleria")
@CrossOrigin(origins="*", allowedHeaders="*")
public class PastelEmpRestController {
	@Autowired
	private IPastelEmpService pastelempservice;
	@GetMapping("/pastelesemp")
	public List<PastelEmp> listarPastels(){
		return pastelempservice.findAll();
	}
	@PostMapping("/pastelesemp")
	@ResponseStatus(HttpStatus.CREATED)
	public PastelEmp guardar(@RequestBody PastelEmp e) {
		return pastelempservice.save(e);
	}
	@DeleteMapping("/pastelesemp/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void borrar (@PathVariable Long id) {
		pastelempservice.delete(id);
	}
	@GetMapping("/pastelesemp/{id}")
	public PastelEmp encontrarPorId(@PathVariable Long id) {
		return pastelempservice.searchById(id);
	}
	@PutMapping("/pastelesemp/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public PastelEmp actualizar(@PathVariable Long id, @RequestBody PastelEmp e) {
		PastelEmp actual = pastelempservice.searchById(id);
		actual.setNombre(e.getNombre());
		actual.setDescripcion(e.getDescripcion());
		actual.setPeso(e.getPeso());
		actual.setTipo(e.getTipo());
		actual.setFechaEntrega(e.getFechaEntrega());
		return pastelempservice.save(actual);
	}
}
