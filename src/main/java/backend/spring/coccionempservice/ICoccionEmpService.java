package backend.spring.coccionempservice;

import java.util.List;

import backend.spring.modelentity.CoccionEmp;

public interface ICoccionEmpService {
	public List<CoccionEmp> findAll();
	public CoccionEmp save(CoccionEmp e);
	public void delete(Long id);
	public CoccionEmp searchById(Long id);
}
