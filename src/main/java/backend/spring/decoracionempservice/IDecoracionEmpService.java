package backend.spring.decoracionempservice;

import java.util.List;

import backend.spring.modelentity.DecoracionEmp;

public interface IDecoracionEmpService {
	public List<DecoracionEmp> findAll();
	public DecoracionEmp save(DecoracionEmp e);
	public void delete(Long id);
	public DecoracionEmp searchById(Long id);
}
