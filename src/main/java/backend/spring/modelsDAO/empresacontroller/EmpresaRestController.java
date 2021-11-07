package backend.spring.modelsDAO.empresacontroller;

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

import backend.spring.empresaservice.IEmpresaService;
import backend.spring.modelentity.Empresa;

@RestController
@RequestMapping("/pasteleria")
public class EmpresaRestController {
	@Autowired
	private IEmpresaService empresaservice;
	@GetMapping("/decoradores")
	public List<Empresa> findAll(){
		return empresaservice.findAll();
	}
	@PostMapping("/decoradores")
	@ResponseStatus(HttpStatus.CREATED)
	public Empresa guardar(@RequestBody Empresa d) {
		return empresaservice.save(d);
	}
	@DeleteMapping("/decoradores/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void borrar (@PathVariable Long nit) {
		empresaservice.delete(nit);
	}
	@GetMapping("/decoradores/{id}")
	public Empresa encontrarporId(@PathVariable Long nit) {
		return empresaservice.searchById(nit);
	}
	@PutMapping("/estudiantes/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public Empresa actualizar(@PathVariable Long nit, @RequestBody Empresa e) {
		Empresa actual = empresaservice.searchById(nit);
		actual.setNombre(e.getNombre());
		actual.setDirección(e.getDirección());
		return empresaservice.save(actual);
	}
	
}
