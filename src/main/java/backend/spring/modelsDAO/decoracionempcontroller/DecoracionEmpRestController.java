package backend.spring.modelsDAO.decoracionempcontroller;

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

import backend.spring.decoracionempservice.IDecoracionEmpService;
import backend.spring.modelentity.DecoracionEmp;

@RestController
@RequestMapping("/pasteleria")
@CrossOrigin(origins="*", allowedHeaders="*")
public class DecoracionEmpRestController {
	@Autowired
	private IDecoracionEmpService decoracionempservice;
	@GetMapping("/decoracionesemp")
	public List<DecoracionEmp> findAll(){
		return decoracionempservice.findAll();
	}
	@PostMapping("/decoracionesemp")
	@ResponseStatus(HttpStatus.CREATED)
	public DecoracionEmp guardar(@RequestBody DecoracionEmp d) {
		return decoracionempservice.save(d);
	}
	@DeleteMapping("/decoracionesemp/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void borrar (@PathVariable Long id) {
		decoracionempservice.delete(id);
	}
	@GetMapping("/decoracionesemp/{id}")
	public DecoracionEmp encontrarporId(@PathVariable Long id) {
		return decoracionempservice.searchById(id);
	}
	@PutMapping("/decoracionesemp/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public DecoracionEmp actualizar(@PathVariable Long id, @RequestBody DecoracionEmp e) {
		DecoracionEmp actual = decoracionempservice.searchById(id);
		actual.setFechaHoraFin(e.getFechaHoraFin());
		actual.setFechaHoraInicio(e.getFechaHoraInicio());
		actual.setPesoFinal(e.getPesoFinal());
		return decoracionempservice.save(actual);
	}
}
