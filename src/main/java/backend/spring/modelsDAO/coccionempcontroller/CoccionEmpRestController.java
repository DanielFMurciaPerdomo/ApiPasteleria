package backend.spring.modelsDAO.coccionempcontroller;

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

import backend.spring.coccionempservice.ICoccionEmpService;
import backend.spring.modelentity.CoccionEmp;

@RestController
@RequestMapping("/pasteleria")
@CrossOrigin(origins="*", allowedHeaders="*")
public class CoccionEmpRestController {
	@Autowired
	private ICoccionEmpService coccionempservice;
	@GetMapping("/coccionesemp")
	public List<CoccionEmp> findAll(){
		return coccionempservice.findAll();
	}
	@PostMapping("/coccionesemp")
	@ResponseStatus(HttpStatus.CREATED)
	public CoccionEmp guardar(@RequestBody CoccionEmp d) {
		return coccionempservice.save(d);
	}
	@DeleteMapping("/coccionesemp/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void borrar (@PathVariable Long id) {
		coccionempservice.delete(id);
	}
	@GetMapping("/coccionesemp/{id}")
	public CoccionEmp encontrarporId(@PathVariable Long id) {
		return coccionempservice.searchById(id);
	}
	@PutMapping("/coccionesemp/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public CoccionEmp actualizar(@PathVariable Long id, @RequestBody CoccionEmp e) {
		CoccionEmp actual = coccionempservice.searchById(id);
		actual.setFechaHoraFinal(e.getFechaHoraFinal());
		actual.setFechaHoraInicio(e.getFechaHoraInicio());
		actual.setMarca(e.getMarca());
		actual.setTempCoccion(e.getTempCoccion());
		actual.setValorEstimado(e.getValorEstimado());
		return coccionempservice.save(actual);
	}
}
