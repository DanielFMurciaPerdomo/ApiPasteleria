package backend.spring.pastelempservice;

import java.util.List;

import backend.spring.modelentity.PastelEmp;

public interface IPastelEmpService {
	public List<PastelEmp> findAll();
	public PastelEmp save(PastelEmp e);
	public void delete(Long id);
	public PastelEmp searchById(Long id);
}
